package dk.mosberg.client;

import net.fabricmc.api.ClientModInitializer;

public class VVEClient implements ClientModInitializer {
    @SuppressWarnings("null")
    @Override
    public void onInitializeClient() {
        // Register HUD overlays using HudElementRegistry (Fabric API 1.21+)
        net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry.addLast(
                net.minecraft.util.Identifier.of("vve:village_name_overlay"),
                (drawContext, tickDelta) -> {
                    var client = net.minecraft.client.MinecraftClient.getInstance();
                    if (client.player != null && client.world != null) {
                        String villageName = "Village"; // Replace with actual village name lookup
                        int screenWidth = client.getWindow().getScaledWidth();
                        dk.mosberg.client.ui.VillageNameHud.renderVillageName(drawContext,
                                villageName, screenWidth);
                    }
                });
        // Register tooltip rendering for villagers (stub, needs entity targeting logic)
        // Use WorldRenderEvents for overlays if needed.
    }
}

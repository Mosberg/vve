package dk.mosberg.client;

import dk.mosberg.client.ui.VillageOverlayRenderer;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderEvents;

public class VVEClient implements ClientModInitializer {
    @SuppressWarnings("null")
    @Override
    public void onInitializeClient() {
        // Register networking payloads before any receiver registration
        dk.mosberg.network.VVENetworking.registerPayloads();

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

        // Register client-side networking receiver for management menu
        net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking.registerGlobalReceiver(
                dk.mosberg.network.OpenManagementMenuS2CPayload.ID, (payload, context) -> {
                    context.client().execute(() -> {
                        net.minecraft.client.MinecraftClient.getInstance()
                                .setScreen(new dk.mosberg.client.ui.VillageManagerScreen());
                    });
                });

        // Register tooltip rendering for villagers
        net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback.EVENT
                .register((drawContext, tickDelta) -> {
                    var client = net.minecraft.client.MinecraftClient.getInstance();
                    if (client.crosshairTarget != null && client.crosshairTarget
                            .getType() == net.minecraft.util.hit.HitResult.Type.ENTITY) {
                        var entityHit =
                                ((net.minecraft.util.hit.EntityHitResult) client.crosshairTarget)
                                        .getEntity();
                        if (entityHit instanceof net.minecraft.entity.passive.VillagerEntity villager) {
                            int mouseX = (int) client.mouse.getX();
                            int mouseY = (int) client.mouse.getY();
                            dk.mosberg.client.ui.VillagerTooltipRenderer
                                    .renderVillagerTooltip(drawContext, villager, mouseX, mouseY);
                        }
                    }
                });
        // Example: Use WorldRenderEvents for overlays (Fabric API 1.21+)
        WorldRenderEvents.START_MAIN.register(context -> {
            var client = net.minecraft.client.MinecraftClient.getInstance();
            if (client.player != null && client.world != null) {
                VillageOverlayRenderer.renderVillageOverlays(context);
            }
        });
    }
}

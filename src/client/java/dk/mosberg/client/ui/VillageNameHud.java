package dk.mosberg.client.ui;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;

/**
 * Renders the village name HUD overlay.
 */
public class VillageNameHud {
    public static void renderVillageName(DrawContext context, String villageName, int screenWidth) {
        int x = screenWidth / 2;
        int y = 10;
        context.drawText(MinecraftClient.getInstance().textRenderer, villageName, x, y, 0xFFD700,
                true);
    }
}

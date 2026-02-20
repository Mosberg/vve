package dk.mosberg.client.ui;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

/**
 * Village Manager Block UI screen for managing village upgrades, jobs, treasury, happiness, etc.
 */
public class VillageManagerScreen extends Screen {
    public VillageManagerScreen() {
        super(Text.literal("Village Manager"));
    }

    @Override
    protected void init() {
        this.addDrawableChild(ButtonWidget.builder(Text.literal("Upgrade Village"), btn -> {
            // Example: Print to log or show dialog
            var player = net.minecraft.client.MinecraftClient.getInstance().player;
            if (player != null) {
                player.sendMessage(
                        Text.literal("Upgrade Village clicked! (Stub: implement upgrade logic)"),
                        false);
            }
        }).position(10, 20).size(120, 20).build());
        this.addDrawableChild(ButtonWidget.builder(Text.literal("Assign Jobs"), btn -> {
            var player = net.minecraft.client.MinecraftClient.getInstance().player;
            if (player != null) {
                player.sendMessage(
                        Text.literal("Assign Jobs clicked! (Stub: implement job assignment logic)"),
                        false);
            }
        }).position(10, 50).size(120, 20).build());
        this.addDrawableChild(ButtonWidget.builder(Text.literal("Manage Treasury"), btn -> {
            var player = net.minecraft.client.MinecraftClient.getInstance().player;
            if (player != null) {
                player.sendMessage(
                        Text.literal("Manage Treasury clicked! (Stub: implement treasury logic)"),
                        false);
            }
        }).position(10, 80).size(120, 20).build());
        this.addDrawableChild(ButtonWidget.builder(Text.literal("Track Happiness"), btn -> {
            var player = net.minecraft.client.MinecraftClient.getInstance().player;
            if (player != null) {
                player.sendMessage(
                        Text.literal("Track Happiness clicked! (Stub: implement happiness logic)"),
                        false);
            }
        }).position(10, 110).size(120, 20).build());
    }
}

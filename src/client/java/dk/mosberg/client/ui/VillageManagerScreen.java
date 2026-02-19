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
        // TODO: Example: Add buttons for upgrades, jobs, treasury, happiness
        this.addDrawableChild(ButtonWidget.builder(Text.literal("Upgrade Village"), btn -> {
            // TODO: Upgrade logic
        }).position(10, 20).size(120, 20).build());
        this.addDrawableChild(ButtonWidget.builder(Text.literal("Assign Jobs"), btn -> {
            // TODO: Job assignment logic
        }).position(10, 50).size(120, 20).build());
        this.addDrawableChild(ButtonWidget.builder(Text.literal("Manage Treasury"), btn -> {
            // TODO: Treasury logic
        }).position(10, 80).size(120, 20).build());
        this.addDrawableChild(ButtonWidget.builder(Text.literal("Track Happiness"), btn -> {
            // TODO: Happiness logic
        }).position(10, 110).size(120, 20).build());
    }
}

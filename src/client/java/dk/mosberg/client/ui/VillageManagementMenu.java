package dk.mosberg.client.ui;

import java.util.List;

/**
 * Represents the main village management menu UI. Extend with actual rendering and interaction
 * logic for Minecraft Fabric client.
 */
public class VillageManagementMenu {
    private List<String> availableActions;

    public VillageManagementMenu(List<String> availableActions) {
        this.availableActions = availableActions;
    }

    public List<String> getAvailableActions() {
        return availableActions;
    }

    public void open() {
        net.minecraft.client.MinecraftClient.getInstance()
                .setScreen(new net.minecraft.client.gui.screen.Screen(
                        net.minecraft.text.Text.of("Village Management Menu")) {
                    @Override
                    protected void init() {
                        int y = 20;
                        for (String action : availableActions) {
                            this.addDrawableChild(net.minecraft.client.gui.widget.ButtonWidget
                                    .builder(net.minecraft.text.Text.of(action), btn -> {
                                        var player = net.minecraft.client.MinecraftClient
                                                .getInstance().player;
                                        if (player != null) {
                                            player.sendMessage(net.minecraft.text.Text
                                                    .of("Clicked: " + action), false);
                                        }
                                    }).position(10, y).size(160, 20).build());
                            y += 30;
                        }
                    }
                });
    }

    public void assignJob(String villagerId, String jobId) {
        var player = net.minecraft.client.MinecraftClient.getInstance().player;
        if (player != null) {
            player.sendMessage(net.minecraft.text.Text
                    .of("Assigning job " + jobId + " to villager " + villagerId), false);
        }
        // TODO: Send packet to server for job assignment
    }

    public void setPatrolRoute(String routeId) {
        var player = net.minecraft.client.MinecraftClient.getInstance().player;
        if (player != null) {
            player.sendMessage(net.minecraft.text.Text.of("Setting patrol route " + routeId),
                    false);
        }
        // TODO: Send packet to server for patrol route
    }

    public void approveExpansion(String expansionId) {
        var player = net.minecraft.client.MinecraftClient.getInstance().player;
        if (player != null) {
            player.sendMessage(net.minecraft.text.Text.of("Approving expansion " + expansionId),
                    false);
        }
        // TODO: Send packet to server for expansion approval
    }
}

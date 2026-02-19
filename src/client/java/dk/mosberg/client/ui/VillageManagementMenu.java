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
        // Example: Open a stub screen using Minecraft's client API
        net.minecraft.client.MinecraftClient.getInstance()
                .setScreen(new net.minecraft.client.gui.screen.Screen(
                        net.minecraft.text.Text.of("Village Management Menu")) {
                    // TODO: Stub screen, add widgets and logic as needed
                });
    }

    public void assignJob(String villagerId, String jobId) {
        // TODO: Stub: Send job assignment to server or update local state
        System.out.printf("Assigning job %s to villager %s\n", jobId, villagerId);
    }

    public void setPatrolRoute(String routeId) {
        // TODO: Stub: Send patrol route to server or update local state
        System.out.printf("Setting patrol route %s\n", routeId);
    }

    public void approveExpansion(String expansionId) {
        // TODO: Stub: Send expansion approval to server or update local state
        System.out.printf("Approving expansion %s\n", expansionId);
    }
}

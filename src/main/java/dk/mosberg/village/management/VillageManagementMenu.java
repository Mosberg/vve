package dk.mosberg.village.management;

import java.util.HashMap;
import java.util.Map;

/**
 * Village management menu data model for assigning jobs, patrols, expansions, treasury, happiness.
 */
public class VillageManagementMenu {
    private final Map<String, String> villagerJobs = new HashMap<>(); // villagerId -> job
    private final Map<String, String> patrolRoutes = new HashMap<>(); // routeId -> details
    private final Map<String, Boolean> buildingExpansions = new HashMap<>(); // buildingId ->
                                                                             // approved
    private int treasuryBalance = 0;
    private final Map<String, Integer> villagerHappiness = new HashMap<>(); // villagerId ->
                                                                            // happiness

    public void assignJob(String villagerId, String job) {
        villagerJobs.put(villagerId, job);
    }

    public void setPatrolRoute(String routeId, String details) {
        patrolRoutes.put(routeId, details);
    }

    public void approveExpansion(String buildingId, boolean approved) {
        buildingExpansions.put(buildingId, approved);
    }

    public void setTreasuryBalance(int balance) {
        treasuryBalance = balance;
    }

    public void setVillagerHappiness(String villagerId, int happiness) {
        villagerHappiness.put(villagerId, happiness);
    }

    public int getTreasuryBalance() {
        return treasuryBalance;
    }

    public Map<String, String> getVillagerJobs() {
        return villagerJobs;
    }

    public Map<String, String> getPatrolRoutes() {
        return patrolRoutes;
    }

    public Map<String, Boolean> getBuildingExpansions() {
        return buildingExpansions;
    }

    public Map<String, Integer> getVillagerHappiness() {
        return villagerHappiness;
    }
}

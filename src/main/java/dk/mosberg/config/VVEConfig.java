package dk.mosberg.config;

import java.util.HashMap;
import java.util.Map;

/**
 * Central config manager for VVE mod features and settings. Supports toggling and tuning of all
 * major systems.
 */
public class VVEConfig {
    /**
     * Persists the config to disk. Stub implementation.
     */
    public static void saveToDisk() {
        try {
            java.nio.file.Files.writeString(java.nio.file.Path.of("vve_config.json"),
                    new com.google.gson.Gson().toJson(CONFIG));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static final Map<String, Object> CONFIG = new HashMap<>();

    static {
        // Default config values
        CONFIG.put("enableVillageTypes", true);
        CONFIG.put("enableVillagerAI", true);
        CONFIG.put("enableProfessions", true);
        CONFIG.put("enableEconomy", true);
        CONFIG.put("enableDefense", true);
        CONFIG.put("enableReputation", true);
        CONFIG.put("enableQuests", true);
        CONFIG.put("enableCustomizationUI", true);
        CONFIG.put("villageGrowthRate", 1.0);
        CONFIG.put("economyPriceFluctuation", 0.01);
        CONFIG.put("raidDifficulty", 1);
        // Gameplay toggles
        CONFIG.put("enableVillageExpansion", true);
        CONFIG.put("villagerAIComplexity", "normal");
        CONFIG.put("enableSeasonalEvents", true);
        CONFIG.put("enableRaids", true);
        CONFIG.put("enableBandits", true);
        // Difficulty settings
        CONFIG.put("raidIntensity", 1);
        CONFIG.put("resourceConsumption", 1);
        CONFIG.put("villagerMortality", true);
        CONFIG.put("economicDifficulty", "normal");
        // Performance options
        CONFIG.put("villagerAITickRate", 20);
        CONFIG.put("maxVillagePopulation", 50);
        CONFIG.put("structureGenerationDensity", 1);
        CONFIG.put("pathfindingComplexity", "normal");
        // Customization
        CONFIG.put("tradePriceScaling", 1.0);
        CONFIG.put("villagerPersonalityVariety", "normal");
        CONFIG.put("hardcoreVillageMode", false);
        CONFIG.put("enableShopSystem", true);
        CONFIG.put("enableTreasury", true);
        CONFIG.put("enableVillageThemes", true);
        CONFIG.put("enablePersonalitySystem", true);
        CONFIG.put("enableManagementMenu", true);
        CONFIG.put("festivalFrequency", 1);
        CONFIG.put("allowPlayerOwnedShops", true);
        CONFIG.put("allowVillagerRelationships", true);
        CONFIG.put("allowVillagerFamilies", true);
        CONFIG.put("allowVillagerRequests", true);
        CONFIG.put("allowVillagerDialogue", true);
        CONFIG.put("allowVillagerGoals", true);
        CONFIG.put("allowVillagerSkills", true);
        CONFIG.put("allowVillagerTraits", true);
        CONFIG.put("allowVillageCustomization", true);
        CONFIG.put("allowVillageManagerBlock", true);
        CONFIG.put("allowVillageLandmarks", true);
        CONFIG.put("allowVillageWalls", true);
        CONFIG.put("allowVillagePathExpansion", true);
        CONFIG.put("allowVillageExpansions", true);
    }

    public static Object get(String key) {
        return CONFIG.get(key);
    }

    public static void set(String key, Object value) {
        CONFIG.put(key, value);
    }

    public static boolean isEnabled(String key) {
        Object v = CONFIG.get(key);
        return v instanceof Boolean ? (Boolean) v : false;
    }
}

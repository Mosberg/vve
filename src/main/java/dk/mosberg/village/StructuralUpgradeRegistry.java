package dk.mosberg.village;

import java.util.HashMap;
import java.util.Map;

/**
 * Registry for structural upgrades and specialized buildings in villages.
 */
public class StructuralUpgradeRegistry {
    private static final Map<String, StructuralUpgrade> UPGRADES = new HashMap<>();

    public static void registerUpgrade(String id, StructuralUpgrade upgrade) {
        UPGRADES.put(id, upgrade);
    }

    public static StructuralUpgrade getUpgrade(String id) {
        return UPGRADES.get(id);
    }

    public static Map<String, StructuralUpgrade> getAllUpgrades() {
        return UPGRADES;
    }
}

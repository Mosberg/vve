package dk.mosberg.defense;

import java.util.HashMap;
import java.util.Map;

/**
 * Central registry and manager for village defense and threat mechanics. Handles raids, patrols,
 * threat escalation, and defense upgrades.
 */
public class DefenseManager {
    static {
        try {
            Class.forName("dk.mosberg.defense.BuiltinDefense");
            dk.mosberg.defense.BuiltinDefense.registerAll();
        } catch (Throwable ignored) {
        }
    }
    private static final Map<String, ThreatType> THREATS = new HashMap<>();
    private static final Map<String, DefenseUpgrade> UPGRADES = new HashMap<>();

    public static void registerThreat(String id, ThreatType threat) {
        THREATS.put(id, threat);
    }

    public static ThreatType getThreat(String id) {
        return THREATS.get(id);
    }

    public static void registerUpgrade(String id, DefenseUpgrade upgrade) {
        UPGRADES.put(id, upgrade);
    }

    public static DefenseUpgrade getUpgrade(String id) {
        return UPGRADES.get(id);
    }
}

package dk.mosberg.villager;

import java.util.HashMap;
import java.util.Map;

/**
 * Central registry for villager AI behaviors and routines. Allows extensible registration of new
 * behaviors and daily routines.
 */
public class VillagerAIRegistry {
    private static final Map<String, VillagerBehavior> BEHAVIORS = new HashMap<>();
    private static final Map<String, VillagerRoutine> ROUTINES = new HashMap<>();

    public static void registerBehavior(String id, VillagerBehavior behavior) {
        BEHAVIORS.put(id, behavior);
    }

    public static VillagerBehavior getBehavior(String id) {
        return BEHAVIORS.get(id);
    }

    public static void registerRoutine(String id, VillagerRoutine routine) {
        ROUTINES.put(id, routine);
    }

    public static VillagerRoutine getRoutine(String id) {
        return ROUTINES.get(id);
    }
}

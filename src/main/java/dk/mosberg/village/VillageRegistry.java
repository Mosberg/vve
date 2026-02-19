package dk.mosberg.village;

import java.util.HashMap;
import java.util.Map;

/**
 * Central registry for all village types and core village data models. Extend this to register new
 * village types, professions, and core systems.
 */
public class VillageRegistry {
    static {
        try {
            Class.forName("dk.mosberg.village.BuiltinVillageTypes");
            dk.mosberg.village.BuiltinVillageTypes.registerAll();
        } catch (Throwable ignored) {
        }
    }
    private static final Map<String, VillageType> VILLAGE_TYPES = new HashMap<>();

    public static void registerVillageType(String id, VillageType type) {
        VILLAGE_TYPES.put(id, type);
    }

    public static VillageType getVillageType(String id) {
        return VILLAGE_TYPES.get(id);
    }

    public static Map<String, VillageType> getAllVillageTypes() {
        return VILLAGE_TYPES;
    }
}

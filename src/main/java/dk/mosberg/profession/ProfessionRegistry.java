package dk.mosberg.profession;

import java.util.HashMap;
import java.util.Map;

/**
 * Central registry for villager professions and progression. Allows extensible registration of new
 * professions and their levels.
 */
public class ProfessionRegistry {
    static {
        try {
            Class.forName("dk.mosberg.profession.BuiltinProfessions");
            dk.mosberg.profession.BuiltinProfessions.registerAll();
        } catch (Throwable ignored) {
        }
    }
    private static final Map<String, VillagerProfession> PROFESSIONS = new HashMap<>();

    public static void registerProfession(String id, VillagerProfession profession) {
        PROFESSIONS.put(id, profession);
    }

    public static VillagerProfession getProfession(String id) {
        return PROFESSIONS.get(id);
    }

    public static Map<String, VillagerProfession> getAllProfessions() {
        return PROFESSIONS;
    }
}

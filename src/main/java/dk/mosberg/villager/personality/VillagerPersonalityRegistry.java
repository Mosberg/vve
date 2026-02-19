package dk.mosberg.villager.personality;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Registry for villager personalities.
 */
public class VillagerPersonalityRegistry {
    private static final Map<String, VillagerPersonality> PERSONALITIES = new HashMap<>();

    public static void registerPersonality(String id, VillagerPersonality personality) {
        PERSONALITIES.put(id, personality);
    }

    public static VillagerPersonality getPersonality(String id) {
        return PERSONALITIES.get(id);
    }

    public static Map<String, VillagerPersonality> getAllPersonalities() {
        return PERSONALITIES;
    }

    public static String getPersonality(UUID uuid) {
        // Convert UUID to string and lookup personality
        String id = uuid.toString();
        VillagerPersonality personality = PERSONALITIES.get(id);
        if (personality != null) {
            return personality.getTraits().isEmpty() ? "Unknown" : personality.getTraits().get(0);
        }
        System.out.printf("Personality lookup for UUID %s: not found\n", id);
        return "Unknown";
    }
}

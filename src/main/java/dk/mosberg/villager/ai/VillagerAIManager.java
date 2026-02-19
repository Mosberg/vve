package dk.mosberg.villager.ai;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Villager AI memory and behavior system.
 */
public class VillagerAIManager {
    private static final Map<String, VillagerMemory> memories = new HashMap<>(); // villagerId ->
                                                                                 // memory
    private static final Map<String, List<String>> relationships = new HashMap<>(); // villagerId ->
                                                                                    // friends/rivals
    private static final Map<String, String> family = new HashMap<>(); // villagerId -> familyId
    private static final Map<String, String> weatherReaction = new HashMap<>(); // villagerId ->
                                                                                // reaction
    private static final Map<String, String> dailyRoutine = new HashMap<>(); // villagerId ->
                                                                             // routine
    private static final Map<String, String> festivalParticipation = new HashMap<>(); // villagerId
                                                                                      // -> festival

    public static void setMemory(String villagerId, VillagerMemory memory) {
        memories.put(villagerId, memory);
    }

    public static VillagerMemory getMemory(String villagerId) {
        return memories.get(villagerId);
    }

    public static void setRelationship(String villagerId, List<String> relations) {
        relationships.put(villagerId, relations);
    }

    public static List<String> getRelationships(String villagerId) {
        return relationships.get(villagerId);
    }

    public static void setFamily(String villagerId, String familyId) {
        family.put(villagerId, familyId);
    }

    public static String getFamily(String villagerId) {
        return family.get(villagerId);
    }

    public static void setWeatherReaction(String villagerId, String reaction) {
        weatherReaction.put(villagerId, reaction);
    }

    public static String getWeatherReaction(String villagerId) {
        return weatherReaction.get(villagerId);
    }

    public static void setDailyRoutine(String villagerId, String routine) {
        dailyRoutine.put(villagerId, routine);
    }

    public static String getDailyRoutine(String villagerId) {
        return dailyRoutine.get(villagerId);
    }

    public static void setFestivalParticipation(String villagerId, String festival) {
        festivalParticipation.put(villagerId, festival);
    }

    public static String getFestivalParticipation(String villagerId) {
        return festivalParticipation.get(villagerId);
    }
}

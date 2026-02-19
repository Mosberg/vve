package dk.mosberg.villager.personality;

import dk.mosberg.data.JsonDataLoader;
import dk.mosberg.data.VillagerBackstory;
import dk.mosberg.data.VillagerGoals;
import dk.mosberg.data.VillagerPreferences;

public class VillagerPersonalityManager {
    private final VillagerBackstory backstoryConfig;
    private final VillagerPreferences preferencesConfig;
    private final VillagerGoals goalsConfig;

    public VillagerPersonalityManager() {
        backstoryConfig =
                JsonDataLoader.load("data/vve/villager_backstories.json", VillagerBackstory.class);
        preferencesConfig = JsonDataLoader.load("data/vve/villager_preferences.json",
                VillagerPreferences.class);
        goalsConfig = JsonDataLoader.load("data/vve/villager_goals.json", VillagerGoals.class);
    }

    // Example: Generate personality for a villager
    public VillagerPersonality generate(String biome, String profession, String culture) {
        // TODO: Implement logic using configs
        // Example: select backstory, preferences, goals based on biome/profession/culture
        return new VillagerPersonality(culture, culture, culture, null, null, null, null, null,
                null, 0);
    }

    // Example: Evaluate gift effect on reputation
    public int evaluateGift(String item) {
        // TODO: Implement logic using preferencesConfig
        return 0;
    }
}

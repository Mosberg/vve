package dk.mosberg.villager.personality;

import java.util.Arrays;
import java.util.Collections;

/**
 * Registers sample built-in villager personalities and traits.
 */
public class BuiltinVillagerPersonalities {
    public static final VillagerPersonality BRAVE_FARMER = new VillagerPersonality("John", "Smith",
            "Raised in the frontier, always ready to defend his crops.",
            Arrays.asList("brave", "hardworking"), Arrays.asList("farming", "combat"),
            Arrays.asList("wheat", "iron tools"), Arrays.asList("bandits", "lazy workers"),
            Arrays.asList("grow the biggest farm", "protect the village"),
            Collections.singletonMap("dialogue", "I won't let bandits take our harvest!"), 0);
    public static final VillagerPersonality CURIOUS_SCRIBE = new VillagerPersonality("Ella",
            "Wright", "Loves books and ancient ruins, always asking questions.",
            Arrays.asList("curious", "kind"), Arrays.asList("crafting", "trading"),
            Arrays.asList("books", "scrolls"), Arrays.asList("ignorance", "fire"),
            Arrays.asList("discover secrets", "help villagers learn"),
            Collections.singletonMap("dialogue", "Have you seen the ruins beneath the village?"),
            0);

    public static void registerAll() {
        VillagerPersonalityRegistry.registerPersonality("brave_farmer", BRAVE_FARMER);
        VillagerPersonalityRegistry.registerPersonality("curious_scribe", CURIOUS_SCRIBE);
    }
}

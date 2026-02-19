package dk.mosberg.profession;

import java.util.Arrays;
import java.util.Collections;

/**
 * Registers all built-in professions described in the README.
 */
public class BuiltinProfessions {
    @SuppressWarnings("null")
    public static final VillagerProfession HUNTER = new VillagerProfession(
            "hunter", "Hunter",
            Arrays.asList(
                    new ProfessionLevel("Novice", 1, Arrays.asList("sell_pelts"),
                            Arrays.asList("track_animals"), Collections.emptyMap()),
                    new ProfessionLevel("Expert", 2, Arrays.asList("set_traps"),
                            Arrays.asList("improved_tracking"), Collections.emptyMap())),
            Collections.singletonMap("description", "Tracks animals, sets traps, sells pelts."));
    @SuppressWarnings("null")
    public static final VillagerProfession ENGINEER = new VillagerProfession("engineer", "Engineer",
            Arrays.asList(
                    new ProfessionLevel("Novice", 1, Arrays.asList("build_basic_redstone"),
                            Arrays.asList("simple_contraptions"), Collections.emptyMap()),
                    new ProfessionLevel("Master", 2, Arrays.asList("build_advanced_redstone"),
                            Arrays.asList("complex_contraptions"), Collections.emptyMap())),
            Collections.singletonMap("description",
                    "Builds redstone contraptions for the village."));
    @SuppressWarnings("null")
    public static final VillagerProfession BREWER = new VillagerProfession("brewer", "Brewer",
            Arrays.asList(
                    new ProfessionLevel("Novice", 1, Arrays.asList("brew_basic_potions"),
                            Arrays.asList("simple_brews"), Collections.emptyMap()),
                    new ProfessionLevel("Expert", 2, Arrays.asList("brew_rare_potions"),
                            Arrays.asList("unique_brews"), Collections.emptyMap())),
            Collections.singletonMap("description", "Creates unique potions for trade."));
    @SuppressWarnings("null")
    public static final VillagerProfession SCRIBE = new VillagerProfession("scribe", "Scribe",
            Arrays.asList(
                    new ProfessionLevel("Novice", 1, Arrays.asList("sell_books"),
                            Arrays.asList("enchant_scrolls"), Collections.emptyMap()),
                    new ProfessionLevel("Master", 2, Arrays.asList("sell_scrolls"),
                            Arrays.asList("rare_enchants"), Collections.emptyMap())),
            Collections.singletonMap("description", "Sells enchanted books and scrolls."));
    @SuppressWarnings("null")
    public static final VillagerProfession CHEF = new VillagerProfession("chef", "Chef",
            Arrays.asList(
                    new ProfessionLevel("Novice", 1, Arrays.asList("cook_meals"),
                            Arrays.asList("simple_buffs"), Collections.emptyMap()),
                    new ProfessionLevel("Master", 2, Arrays.asList("cook_feasts"),
                            Arrays.asList("special_buffs"), Collections.emptyMap())),
            Collections.singletonMap("description", "Cooks specialty meals with buffs."));
    @SuppressWarnings("null")
    public static final VillagerProfession GUARD_CAPTAIN =
            new VillagerProfession("guard_captain", "Guard Captain",
                    Arrays.asList(
                            new ProfessionLevel("Novice", 1, Arrays.asList("organize_patrols"),
                                    Arrays.asList("basic_drills"), Collections.emptyMap()),
                            new ProfessionLevel("Master", 2, Arrays.asList("lead_defense"),
                                    Arrays.asList("advanced_drills"), Collections.emptyMap())),
                    Collections.singletonMap("description",
                            "Organizes patrols and defense drills."));

    public static void registerAll() {
        ProfessionRegistry.registerProfession(HUNTER.getId(), HUNTER);
        ProfessionRegistry.registerProfession(ENGINEER.getId(), ENGINEER);
        ProfessionRegistry.registerProfession(BREWER.getId(), BREWER);
        ProfessionRegistry.registerProfession(SCRIBE.getId(), SCRIBE);
        ProfessionRegistry.registerProfession(CHEF.getId(), CHEF);
        ProfessionRegistry.registerProfession(GUARD_CAPTAIN.getId(), GUARD_CAPTAIN);
    }
}

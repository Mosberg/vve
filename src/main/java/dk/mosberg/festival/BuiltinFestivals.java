package dk.mosberg.festival;

import java.util.Collections;

/**
 * Registers built-in festivals and story events for seasonal rewards and story arcs.
 */
public class BuiltinFestivals {
    public static final Festival SEASONAL_FESTIVAL = new Festival("seasonal_festival",
            "Seasonal Festival", Collections.singletonMap("reward", "unique_item"));
    public static final Festival HARVEST_FESTIVAL = new Festival("harvest_festival",
            "Harvest Festival", Collections.singletonMap("reward", "food_buff"));
    public static final StoryEvent VILLAGE_FOUNDING = new StoryEvent("village_founding",
            "Village Founding", Collections.singletonMap("phase", 1));
    public static final StoryEvent BANDIT_WAR =
            new StoryEvent("bandit_war", "Bandit War", Collections.singletonMap("phase", 2));
    public static final StoryEvent ANCIENT_RUINS =
            new StoryEvent("ancient_ruins", "Ancient Ruins", Collections.singletonMap("phase", 3));

    public static void registerAll() {
        FestivalManager.registerFestival(SEASONAL_FESTIVAL.getId(), SEASONAL_FESTIVAL);
        FestivalManager.registerFestival(HARVEST_FESTIVAL.getId(), HARVEST_FESTIVAL);
        FestivalManager.registerStoryEvent(VILLAGE_FOUNDING.getId(), VILLAGE_FOUNDING);
        FestivalManager.registerStoryEvent(BANDIT_WAR.getId(), BANDIT_WAR);
        FestivalManager.registerStoryEvent(ANCIENT_RUINS.getId(), ANCIENT_RUINS);
    }
}

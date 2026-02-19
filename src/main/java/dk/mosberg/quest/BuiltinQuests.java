package dk.mosberg.quest;

import java.util.Collections;

/**
 * Registers all built-in quest types and story arcs for the village.
 */
public class BuiltinQuests {
    public static final QuestType DELIVERY = new QuestType("delivery", "Delivery Quest",
            Collections.singletonMap("targetType", "item"));
    public static final QuestType CRAFTING = new QuestType("crafting", "Crafting Request",
            Collections.singletonMap("targetType", "crafted_item"));
    public static final QuestType ESCORT = new QuestType("escort", "Escort Mission",
            Collections.singletonMap("targetType", "npc"));
    public static final QuestType MONSTER_HUNT = new QuestType("monster_hunt", "Monster Hunt",
            Collections.singletonMap("targetType", "monster"));
    public static final QuestType PROJECT = new QuestType("project", "Village Project",
            Collections.singletonMap("targetType", "structure"));

    public static final StoryArc FOUNDING =
            new StoryArc("founding", "Village Founding", Collections.singletonMap("phase", 1));
    public static final StoryArc DIPLOMACY = new StoryArc("diplomacy", "Rival Village Diplomacy",
            Collections.singletonMap("phase", 2));
    public static final StoryArc BANDIT_WAR =
            new StoryArc("bandit_war", "Bandit War", Collections.singletonMap("phase", 3));
    public static final StoryArc ANCIENT_RUINS =
            new StoryArc("ancient_ruins", "Ancient Ruins", Collections.singletonMap("phase", 4));
    public static final StoryArc FESTIVAL =
            new StoryArc("festival", "Seasonal Festival", Collections.singletonMap("phase", 5));

    public static void registerAll() {
        QuestManager.registerQuest(DELIVERY.getId(), DELIVERY);
        QuestManager.registerQuest(CRAFTING.getId(), CRAFTING);
        QuestManager.registerQuest(ESCORT.getId(), ESCORT);
        QuestManager.registerQuest(MONSTER_HUNT.getId(), MONSTER_HUNT);
        QuestManager.registerQuest(PROJECT.getId(), PROJECT);
        QuestManager.registerStoryArc(FOUNDING.getId(), FOUNDING);
        QuestManager.registerStoryArc(DIPLOMACY.getId(), DIPLOMACY);
        QuestManager.registerStoryArc(BANDIT_WAR.getId(), BANDIT_WAR);
        QuestManager.registerStoryArc(ANCIENT_RUINS.getId(), ANCIENT_RUINS);
        QuestManager.registerStoryArc(FESTIVAL.getId(), FESTIVAL);
    }
}

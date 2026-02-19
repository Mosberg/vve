package dk.mosberg.quest;

import java.util.HashMap;
import java.util.Map;

/**
 * Central registry and manager for quests and story arcs. Supports registration and lookup of quest
 * types and story arcs.
 */
public class QuestManager {
    static {
        try {
            Class.forName("dk.mosberg.quest.BuiltinQuests");
            dk.mosberg.quest.BuiltinQuests.registerAll();
        } catch (Throwable ignored) {
        }
    }
    private static final Map<String, QuestType> QUESTS = new HashMap<>();
    private static final Map<String, StoryArc> STORY_ARCS = new HashMap<>();

    public static void registerQuest(String id, QuestType quest) {
        QUESTS.put(id, quest);
    }

    public static QuestType getQuest(String id) {
        return QUESTS.get(id);
    }

    public static void registerStoryArc(String id, StoryArc arc) {
        STORY_ARCS.put(id, arc);
    }

    public static StoryArc getStoryArc(String id) {
        return STORY_ARCS.get(id);
    }
}

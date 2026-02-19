package dk.mosberg.festival;

import java.util.HashMap;
import java.util.Map;

/**
 * Festival and story event manager for seasonal rewards and story arcs.
 */
public class FestivalManager {
    private static final Map<String, Festival> festivals = new HashMap<>(); // festivalId ->
                                                                            // Festival
    private static final Map<String, StoryEvent> storyEvents = new HashMap<>(); // eventId ->
                                                                                // StoryEvent

    public static void registerFestival(String festivalId, Festival festival) {
        festivals.put(festivalId, festival);
    }

    public static Festival getFestival(String festivalId) {
        return festivals.get(festivalId);
    }

    public static void registerStoryEvent(String eventId, StoryEvent event) {
        storyEvents.put(eventId, event);
    }

    public static StoryEvent getStoryEvent(String eventId) {
        return storyEvents.get(eventId);
    }
}

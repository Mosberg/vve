package dk.mosberg.villager.ai;

import java.util.Map;

/**
 * Villager memory model for remembering player actions and events.
 */
public class VillagerMemory {
    private final Map<String, Object> actions; // actionId -> details
    private final Map<String, Object> events; // eventId -> details

    public VillagerMemory(Map<String, Object> actions, Map<String, Object> events) {
        this.actions = actions;
        this.events = events;
    }

    public Map<String, Object> getActions() {
        return actions;
    }

    public Map<String, Object> getEvents() {
        return events;
    }
}

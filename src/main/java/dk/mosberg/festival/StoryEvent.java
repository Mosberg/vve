package dk.mosberg.festival;

import java.util.Map;

/**
 * Story event data model for story arcs and unique events.
 */
public class StoryEvent {
    private final String id;
    private final String name;
    private final Map<String, Object> properties;

    public StoryEvent(String id, String name, Map<String, Object> properties) {
        this.id = id;
        this.name = name;
        this.properties = properties;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }
}

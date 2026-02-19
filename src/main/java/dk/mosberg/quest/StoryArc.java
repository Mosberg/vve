package dk.mosberg.quest;

import java.util.Map;

/**
 * Represents a story arc (e.g., village founding, diplomacy, bandit war, ancient ruins, festival).
 * Extend with more properties for story progression and triggers.
 */
public class StoryArc {
    private final String id;
    private final String displayName;
    private final Map<String, Object> properties;

    public StoryArc(String id, String displayName, Map<String, Object> properties) {
        this.id = id;
        this.displayName = displayName;
        this.properties = properties;
    }

    public String getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }
}

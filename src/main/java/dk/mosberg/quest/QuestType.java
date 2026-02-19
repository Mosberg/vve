package dk.mosberg.quest;

import java.util.Map;

/**
 * Represents a quest type (e.g., delivery, crafting, escort, monster hunt, project). Extend with
 * more properties for quest logic and rewards.
 */
public class QuestType {
    private final String id;
    private final String displayName;
    private final Map<String, Object> properties;

    public QuestType(String id, String displayName, Map<String, Object> properties) {
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

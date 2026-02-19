package dk.mosberg.defense;

import java.util.Map;

/**
 * Represents a threat to the village (e.g., raid, monster attack, bandit camp). Extend with more
 * properties for threat escalation and event logic.
 */
public class ThreatType {
    private final String id;
    private final String displayName;
    private final Map<String, Object> properties;

    public ThreatType(String id, String displayName, Map<String, Object> properties) {
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

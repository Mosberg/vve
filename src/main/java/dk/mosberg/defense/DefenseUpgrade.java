package dk.mosberg.defense;

import java.util.Map;

/**
 * Represents a defense upgrade for the village (e.g., guard tower, patrol route, alarm bell).
 * Extend with more properties for upgrade effects and requirements.
 */
public class DefenseUpgrade {
    private final String id;
    private final String displayName;
    private final Map<String, Object> properties;

    public DefenseUpgrade(String id, String displayName, Map<String, Object> properties) {
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

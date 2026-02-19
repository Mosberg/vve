package dk.mosberg.festival;

import java.util.Map;

/**
 * Festival data model for seasonal events and rewards.
 */
public class Festival {
    private final String id;
    private final String name;
    private final Map<String, Object> properties;

    public Festival(String id, String name, Map<String, Object> properties) {
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

package dk.mosberg.defense.raid;

import java.util.Map;

/**
 * Data model for a multi-stage raid.
 */
public class Raid {
    private final String id;
    private final String name;
    private final int stages;
    private final Map<String, Object> properties;

    public Raid(String id, String name, int stages, Map<String, Object> properties) {
        this.id = id;
        this.name = name;
        this.stages = stages;
        this.properties = properties;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getStages() {
        return stages;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }
}

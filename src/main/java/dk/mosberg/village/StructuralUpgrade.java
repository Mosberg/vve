package dk.mosberg.village;

import java.util.List;
import java.util.Map;

/**
 * Represents a structural upgrade or specialized building for a village.
 */
public class StructuralUpgrade {
    private final String id;
    private final String name;
    private final List<String> features;
    private final Map<String, Object> properties;

    public StructuralUpgrade(String id, String name, List<String> features,
            Map<String, Object> properties) {
        this.id = id;
        this.name = name;
        this.features = features;
        this.properties = properties;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getFeatures() {
        return features;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }
}

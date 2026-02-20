package dk.mosberg.village;

import java.util.List;
import java.util.Map;

/**
 * Represents a type of village (e.g., Frontier, Harbor, Mountain Monastery). Extend this class to
 * add custom generation, structures, and behaviors.
 */
public class VillageType {
    private final String id;
    private final String displayName;
    private final List<String> defaultStructures;
    private final Map<String, Object> properties;

    public VillageType(String id, String displayName, List<String> defaultStructures,
            Map<String, Object> properties) {
        this.id = id;
        this.displayName = displayName;
        this.defaultStructures = defaultStructures;
        this.properties = properties;
    }

    // New constructor for config-based registration
    public VillageType(dk.mosberg.data.VillageType dataType) {
        this.id = dataType.id;
        this.displayName = dataType.name;
        this.defaultStructures = dataType.features;
        this.properties = new java.util.HashMap<>();
        this.properties.put("biomes", dataType.biomes);
        this.properties.put("rarity", dataType.rarity);
    }

    public String getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public List<String> getDefaultStructures() {
        return defaultStructures;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }
}

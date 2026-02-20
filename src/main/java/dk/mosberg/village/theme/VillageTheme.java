package dk.mosberg.village.theme;

import java.util.Map;

/**
 * Village theme data model.
 */
public class VillageTheme {
    private final String id;
    private final String name;
    private final Map<String, Object> properties;

    public VillageTheme(String id, String name, Map<String, Object> properties) {
        this.id = id;
        this.name = name;
        this.properties = properties;
    }

    // New constructor for config-based registration
    public VillageTheme(String id, String name, java.util.List<String> blocks,
            java.util.List<String> decor) {
        this.id = id;
        this.name = name;
        this.properties = new java.util.HashMap<>();
        this.properties.put("blocks", blocks);
        this.properties.put("decor", decor);
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

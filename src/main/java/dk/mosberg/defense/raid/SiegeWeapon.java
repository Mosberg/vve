package dk.mosberg.defense.raid;

import java.util.Map;

/**
 * Data model for a siege weapon used in raids.
 */
public class SiegeWeapon {
    private final String id;
    private final String name;
    private final Map<String, Object> properties;

    public SiegeWeapon(String id, String name, Map<String, Object> properties) {
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

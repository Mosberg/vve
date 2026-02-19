package dk.mosberg.profession;

import java.util.List;
import java.util.Map;

/**
 * Represents a villager profession (e.g., Hunter, Engineer, Brewer, Scribe, Chef, Guard Captain).
 * Supports profession progression and custom abilities.
 */
public class VillagerProfession {
    private final String id;
    private final String displayName;
    private final List<ProfessionLevel> levels;
    private final Map<String, Object> properties;

    public VillagerProfession(String id, String displayName, List<ProfessionLevel> levels,
            Map<String, Object> properties) {
        this.id = id;
        this.displayName = displayName;
        this.levels = levels;
        this.properties = properties;
    }

    public String getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public List<ProfessionLevel> getLevels() {
        return levels;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }
}

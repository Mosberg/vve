package dk.mosberg.profession;

import java.util.List;
import java.util.Map;

/**
 * Represents a single level within a profession (e.g., Novice, Apprentice, Master). Each level can
 * unlock new trades, tools, abilities, or projects.
 */
public class ProfessionLevel {
    private final String name;
    private final int level;
    private final List<String> unlockedTrades;
    private final List<String> unlockedAbilities;
    private final Map<String, Object> properties;

    public ProfessionLevel(String name, int level, List<String> unlockedTrades,
            List<String> unlockedAbilities, Map<String, Object> properties) {
        this.name = name;
        this.level = level;
        this.unlockedTrades = unlockedTrades;
        this.unlockedAbilities = unlockedAbilities;
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public List<String> getUnlockedTrades() {
        return unlockedTrades;
    }

    public List<String> getUnlockedAbilities() {
        return unlockedAbilities;
    }

    public Map<String, Object> getProperties() {
        return properties;
    }
}

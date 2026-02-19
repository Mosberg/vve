package dk.mosberg.economy;

import java.util.Map;

/**
 * Represents a tradeable good in the village economy (e.g., wheat, pelts, potions). Extend with
 * more properties as needed for advanced trading.
 */
public class TradeGood {
    private final String id;
    private final String displayName;
    private final Map<String, Object> properties;

    public TradeGood(String id, String displayName, Map<String, Object> properties) {
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

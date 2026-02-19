package dk.mosberg.economy;

import java.util.Map;

/**
 * Player-owned shop data model.
 */
public class PlayerShop {
    private final String id;
    private final String owner;
    private final Map<String, Integer> inventory; // itemId -> quantity
    private final Map<String, Integer> prices; // itemId -> price

    public PlayerShop(String id, String owner, Map<String, Integer> inventory,
            Map<String, Integer> prices) {
        this.id = id;
        this.owner = owner;
        this.inventory = inventory;
        this.prices = prices;
    }

    public String getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public Map<String, Integer> getInventory() {
        return inventory;
    }

    public Map<String, Integer> getPrices() {
        return prices;
    }
}

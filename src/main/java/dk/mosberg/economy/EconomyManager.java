package dk.mosberg.economy;

import java.util.HashMap;
import java.util.Map;

/**
 * Central registry and manager for dynamic economy and trading. Handles prices, supply/demand, and
 * villager trades.
 */
public class EconomyManager {
    private static final Map<String, PlayerShop> PLAYER_SHOPS = new HashMap<>();

    public static void registerPlayerShop(String shopId, PlayerShop shop) {
        PLAYER_SHOPS.put(shopId, shop);
    }

    public static PlayerShop getPlayerShop(String shopId) {
        return PLAYER_SHOPS.get(shopId);
    }

    public static Map<String, PlayerShop> getAllPlayerShops() {
        return PLAYER_SHOPS;
    }

    private static final Map<String, TradeGood> GOODS = new HashMap<>();
    private static final Map<String, Double> PRICES = new HashMap<>();
    private static final Map<String, Integer> SUPPLY = new HashMap<>();
    private static final Map<String, Integer> DEMAND = new HashMap<>();

    public static void registerGood(String id, TradeGood good, double basePrice) {
        GOODS.put(id, good);
        PRICES.put(id, basePrice);
        SUPPLY.put(id, 100); // Default supply
        DEMAND.put(id, 100); // Default demand
    }

    public static double getPrice(String id) {
        int supply = SUPPLY.getOrDefault(id, 100);
        int demand = DEMAND.getOrDefault(id, 100);
        double base = PRICES.getOrDefault(id, 1.0);
        // Simple dynamic pricing: price increases as demand > supply
        return base * (1.0 + 0.01 * (demand - supply));
    }

    public static void adjustSupply(String id, int delta) {
        SUPPLY.put(id, SUPPLY.getOrDefault(id, 100) + delta);
    }

    public static void adjustDemand(String id, int delta) {
        DEMAND.put(id, DEMAND.getOrDefault(id, 100) + delta);
    }

    public static TradeGood getGood(String id) {
        return GOODS.get(id);
    }
}

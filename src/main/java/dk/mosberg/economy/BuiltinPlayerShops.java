package dk.mosberg.economy;

import java.util.Collections;

/**
 * Registers sample built-in player shops and seasonal goods.
 */
public class BuiltinPlayerShops {
    public static final PlayerShop WINTER_FURS_SHOP = new PlayerShop("winter_furs_shop", "player1",
            Collections.singletonMap("fur", 20), Collections.singletonMap("fur", 15));
    public static final PlayerShop SUMMER_CROPS_SHOP = new PlayerShop("summer_crops_shop",
            "player2", Collections.singletonMap("wheat", 50), Collections.singletonMap("wheat", 5));

    public static void registerAll() {
        EconomyManager.registerPlayerShop(WINTER_FURS_SHOP.getId(), WINTER_FURS_SHOP);
        EconomyManager.registerPlayerShop(SUMMER_CROPS_SHOP.getId(), SUMMER_CROPS_SHOP);
    }
}

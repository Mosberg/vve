package dk.mosberg.economy;

import java.util.Collections;

/**
 * Registers all built-in trade goods for the dynamic economy.
 */
public class BuiltinTradeGoods {
    public static final TradeGood WHEAT =
            new TradeGood("wheat", "Wheat", Collections.singletonMap("category", "crop"));
    public static final TradeGood PELT =
            new TradeGood("pelt", "Pelt", Collections.singletonMap("category", "material"));
    public static final TradeGood POTION =
            new TradeGood("potion", "Potion", Collections.singletonMap("category", "brew"));
    public static final TradeGood BOOK =
            new TradeGood("book", "Book", Collections.singletonMap("category", "enchanted"));
    public static final TradeGood MEAL =
            new TradeGood("meal", "Meal", Collections.singletonMap("category", "food"));

    public static void registerAll() {
        EconomyManager.registerGood(WHEAT.getId(), WHEAT, 1.0);
        EconomyManager.registerGood(PELT.getId(), PELT, 5.0);
        EconomyManager.registerGood(POTION.getId(), POTION, 10.0);
        EconomyManager.registerGood(BOOK.getId(), BOOK, 8.0);
        EconomyManager.registerGood(MEAL.getId(), MEAL, 3.0);
    }
}

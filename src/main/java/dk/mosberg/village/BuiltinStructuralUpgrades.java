package dk.mosberg.village;

import java.util.Arrays;
import java.util.Collections;

/**
 * Registers all built-in structural upgrades and specialized buildings for villages.
 */
public class BuiltinStructuralUpgrades {
    public static final StructuralUpgrade MULTI_STORY_HOUSE =
            new StructuralUpgrade("multi_story_house", "Multi-Story House",
                    Arrays.asList("extra_rooms", "balcony", "attic"),
                    Collections.singletonMap("upgradeable", true));
    public static final StructuralUpgrade GARDEN = new StructuralUpgrade("garden",
            "Decorative Garden", Arrays.asList("flowers", "hedges", "orchard"),
            Collections.singletonMap("beauty", 10));
    public static final StructuralUpgrade TANNERY = new StructuralUpgrade("tannery", "Tannery",
            Arrays.asList("leather_processing", "trade_goods"),
            Collections.singletonMap("specialized", true));
    public static final StructuralUpgrade BREWERY = new StructuralUpgrade("brewery", "Brewery",
            Arrays.asList("potion_brewing", "trade_goods"),
            Collections.singletonMap("specialized", true));
    public static final StructuralUpgrade BAKERY =
            new StructuralUpgrade("bakery", "Bakery", Arrays.asList("bread_baking", "trade_goods"),
                    Collections.singletonMap("specialized", true));
    public static final StructuralUpgrade CARPENTRY_SHOP = new StructuralUpgrade("carpentry_shop",
            "Carpentry Shop", Arrays.asList("woodworking", "trade_goods"),
            Collections.singletonMap("specialized", true));
    public static final StructuralUpgrade VILLAGE_WALL =
            new StructuralUpgrade("village_wall", "Village Wall",
                    Arrays.asList("defense", "upgradeable"), Collections.singletonMap("tier", 1));
    public static final StructuralUpgrade PATH_EXPANSION = new StructuralUpgrade("path_expansion",
            "Automatic Path Expansion", Arrays.asList("growth", "navigation"),
            Collections.singletonMap("auto_expand", true));
    public static final StructuralUpgrade LANDMARK = new StructuralUpgrade("landmark",
            "Unique Landmark", Arrays.asList("statue", "fountain", "communal_well"),
            Collections.singletonMap("unique", true));
    public static final StructuralUpgrade MANAGER_BLOCK = new StructuralUpgrade("manager_block",
            "Village Manager Block", Arrays.asList("construction_oversee", "upgrade_control"),
            Collections.singletonMap("core", true));

    public static void registerAll() {
        StructuralUpgradeRegistry.registerUpgrade(MULTI_STORY_HOUSE.getId(), MULTI_STORY_HOUSE);
        StructuralUpgradeRegistry.registerUpgrade(GARDEN.getId(), GARDEN);
        StructuralUpgradeRegistry.registerUpgrade(TANNERY.getId(), TANNERY);
        StructuralUpgradeRegistry.registerUpgrade(BREWERY.getId(), BREWERY);
        StructuralUpgradeRegistry.registerUpgrade(BAKERY.getId(), BAKERY);
        StructuralUpgradeRegistry.registerUpgrade(CARPENTRY_SHOP.getId(), CARPENTRY_SHOP);
        StructuralUpgradeRegistry.registerUpgrade(VILLAGE_WALL.getId(), VILLAGE_WALL);
        StructuralUpgradeRegistry.registerUpgrade(PATH_EXPANSION.getId(), PATH_EXPANSION);
        StructuralUpgradeRegistry.registerUpgrade(LANDMARK.getId(), LANDMARK);
        StructuralUpgradeRegistry.registerUpgrade(MANAGER_BLOCK.getId(), MANAGER_BLOCK);
    }
}

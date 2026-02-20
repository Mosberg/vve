package dk.mosberg;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import dk.mosberg.block.VVEBlocks;
import dk.mosberg.defense.BuiltinDefense;
import dk.mosberg.defense.raid.BuiltinRaids;
import dk.mosberg.economy.BuiltinPlayerShops;
import dk.mosberg.economy.BuiltinTradeGoods;
import dk.mosberg.festival.BuiltinFestivals;
import dk.mosberg.profession.BuiltinProfessions;
import dk.mosberg.quest.BuiltinQuests;
import dk.mosberg.village.BuiltinStructuralUpgrades;
import dk.mosberg.village.BuiltinVillageTypes;
import dk.mosberg.village.theme.BuiltinVillageThemes;
import dk.mosberg.villager.personality.BuiltinVillagerPersonalities;
import net.fabricmc.api.ModInitializer;

public class VVE implements ModInitializer {
    public static final String MOD_ID = "vve";

    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        // Centralized config loading
        var villageTypesConfig = dk.mosberg.data.JsonDataLoader.loadConfig(
                "data/vve/village_types.json", dk.mosberg.data.VillageTypesConfig.class);
        var villageThemesConfig = dk.mosberg.data.JsonDataLoader.loadConfig(
                "data/vve/village_themes.json", dk.mosberg.data.VillageThemesConfig.class);
        var villagerProfessionsConfig =
                dk.mosberg.data.JsonDataLoader.loadConfig("data/vve/villager_professions.json",
                        dk.mosberg.data.VillagerProfessionsConfig.class);
        var villagerPreferencesConfig =
                dk.mosberg.data.JsonDataLoader.loadConfig("data/vve/villager_preferences.json",
                        dk.mosberg.data.VillagerPreferencesConfig.class);

        // Register the village manager block
        VVEBlocks.register();
        // Register all built-in festivals and story events
        BuiltinFestivals.registerAll();
        // Register all built-in advanced raids, siege weapons, elite pillagers
        BuiltinRaids.registerAll();
        // Register all built-in player shops
        BuiltinPlayerShops.registerAll();
        // Register all built-in villager personalities
        BuiltinVillagerPersonalities.registerAll();
        // Register all built-in village themes using config
        BuiltinVillageThemes.registerAll(villageThemesConfig);
        // Register all built-in village types using config
        BuiltinVillageTypes.registerAll(villageTypesConfig);
        // Register all built-in professions using config
        BuiltinProfessions.registerAll(villagerProfessionsConfig);
        // Register all built-in trade goods
        BuiltinTradeGoods.registerAll();
        // Register all built-in threats and defense upgrades
        BuiltinDefense.registerAll();
        // Register all built-in quest types and story arcs
        BuiltinQuests.registerAll();
        // Register all built-in structural upgrades
        BuiltinStructuralUpgrades.registerAll();
        // Reputation system is now available
        // Config system is now available
        LOGGER.info("Registered built-in configs and initialized systems.");
    }
}

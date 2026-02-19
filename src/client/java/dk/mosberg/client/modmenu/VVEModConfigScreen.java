package dk.mosberg.client.modmenu;

import dk.mosberg.config.VVEConfig;
import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

public class VVEModConfigScreen extends Screen {
    private final Screen parent;

    public VVEModConfigScreen(Screen parent) {
        super(Text.literal("VVE Mod Config"));
        this.parent = parent;
    }

    @Override
    protected void init() {
        ConfigBuilder builder = ConfigBuilder.create().setParentScreen(parent)
                .setTitle(Text.literal("Village & Villager Expansion Config"));

        ConfigCategory features = builder.getOrCreateCategory(Text.literal("Features"));
        ConfigEntryBuilder entryBuilder = builder.entryBuilder();

        features.addEntry(entryBuilder
                .startBooleanToggle(Text.literal("Enable Village Types"),
                        VVEConfig.isEnabled("enableVillageTypes"))
                .setDefaultValue(true)
                .setSaveConsumer(val -> VVEConfig.set("enableVillageTypes", val)).build());
        features.addEntry(entryBuilder
                .startBooleanToggle(Text.literal("Enable Villager AI"),
                        VVEConfig.isEnabled("enableVillagerAI"))
                .setDefaultValue(true)
                .setSaveConsumer(val -> VVEConfig.set("enableVillagerAI", val)).build());
        features.addEntry(entryBuilder
                .startBooleanToggle(Text.literal("Enable Professions"),
                        VVEConfig.isEnabled("enableProfessions"))
                .setDefaultValue(true)
                .setSaveConsumer(val -> VVEConfig.set("enableProfessions", val)).build());
        features.addEntry(entryBuilder
                .startBooleanToggle(Text.literal("Enable Economy"),
                        VVEConfig.isEnabled("enableEconomy"))
                .setDefaultValue(true).setSaveConsumer(val -> VVEConfig.set("enableEconomy", val))
                .build());
        features.addEntry(entryBuilder
                .startBooleanToggle(Text.literal("Enable Defense"),
                        VVEConfig.isEnabled("enableDefense"))
                .setDefaultValue(true).setSaveConsumer(val -> VVEConfig.set("enableDefense", val))
                .build());
        features.addEntry(entryBuilder
                .startBooleanToggle(Text.literal("Enable Reputation"),
                        VVEConfig.isEnabled("enableReputation"))
                .setDefaultValue(true)
                .setSaveConsumer(val -> VVEConfig.set("enableReputation", val)).build());
        features.addEntry(entryBuilder
                .startBooleanToggle(Text.literal("Enable Quests"),
                        VVEConfig.isEnabled("enableQuests"))
                .setDefaultValue(true).setSaveConsumer(val -> VVEConfig.set("enableQuests", val))
                .build());
        features.addEntry(entryBuilder
                .startBooleanToggle(Text.literal("Enable Customization UI"),
                        VVEConfig.isEnabled("enableCustomizationUI"))
                .setDefaultValue(true)
                .setSaveConsumer(val -> VVEConfig.set("enableCustomizationUI", val)).build());

        ConfigCategory tuning = builder.getOrCreateCategory(Text.literal("Tuning"));
        tuning.addEntry(entryBuilder
                .startDoubleField(Text.literal("Village Growth Rate"),
                        (Double) VVEConfig.get("villageGrowthRate"))
                .setDefaultValue(1.0).setMin(0.1).setMax(10.0)
                .setSaveConsumer(val -> VVEConfig.set("villageGrowthRate", val)).build());
        tuning.addEntry(entryBuilder
                .startDoubleField(Text.literal("Economy Price Fluctuation"),
                        (Double) VVEConfig.get("economyPriceFluctuation"))
                .setDefaultValue(0.01).setMin(0.0).setMax(1.0)
                .setSaveConsumer(val -> VVEConfig.set("economyPriceFluctuation", val)).build());
        tuning.addEntry(entryBuilder
                .startIntField(Text.literal("Raid Difficulty"),
                        (Integer) VVEConfig.get("raidDifficulty"))
                .setDefaultValue(1).setMin(0).setMax(10)
                .setSaveConsumer(val -> VVEConfig.set("raidDifficulty", val)).build());

        builder.setSavingRunnable(() -> {
            // Persist config to disk
            VVEConfig.saveToDisk();
        });

        this.client.setScreen(builder.build());
    }
}

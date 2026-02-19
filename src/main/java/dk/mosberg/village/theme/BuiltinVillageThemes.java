package dk.mosberg.village.theme;

import java.util.Collections;

/**
 * Registers all built-in village themes described in the README.
 */
public class BuiltinVillageThemes {
    public static final VillageTheme RUSTIC = new VillageTheme("rustic", "Rustic",
            Collections.singletonMap("style", "wood, stone, cozy"));
    public static final VillageTheme MAGICAL = new VillageTheme("magical", "Magical",
            Collections.singletonMap("style", "enchanted, mystical, glowing"));
    public static final VillageTheme INDUSTRIAL = new VillageTheme("industrial", "Industrial",
            Collections.singletonMap("style", "metal, machinery, utilitarian"));
    public static final VillageTheme NOMADIC = new VillageTheme("nomadic", "Nomadic",
            Collections.singletonMap("style", "tents, mobility, temporary"));
    public static final VillageTheme MARITIME = new VillageTheme("maritime", "Maritime",
            Collections.singletonMap("style", "docks, ships, water"));

    public static void registerAll() {
        VillageThemeRegistry.registerTheme(RUSTIC.getId(), RUSTIC);
        VillageThemeRegistry.registerTheme(MAGICAL.getId(), MAGICAL);
        VillageThemeRegistry.registerTheme(INDUSTRIAL.getId(), INDUSTRIAL);
        VillageThemeRegistry.registerTheme(NOMADIC.getId(), NOMADIC);
        VillageThemeRegistry.registerTheme(MARITIME.getId(), MARITIME);
    }
}

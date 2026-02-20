package dk.mosberg.village.theme;

/**
 * Registers all built-in village themes described in the README.
 */
public class BuiltinVillageThemes {
    public static void registerAll(dk.mosberg.data.VillageThemesConfig config) {
        if (config == null || config.village_themes == null)
            return;
        config.village_themes.forEach((id, theme) -> {
            VillageThemeRegistry.registerTheme(id,
                    new VillageTheme(id, id, theme.blocks, theme.decor));
        });
    }
}

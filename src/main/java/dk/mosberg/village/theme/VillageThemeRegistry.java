package dk.mosberg.village.theme;

import java.util.HashMap;
import java.util.Map;

/**
 * Village theme registry and data model.
 */
public class VillageThemeRegistry {
    private static final Map<String, VillageTheme> THEMES = new HashMap<>();

    public static void registerTheme(String id, VillageTheme theme) {
        THEMES.put(id, theme);
    }

    public static VillageTheme getTheme(String id) {
        return THEMES.get(id);
    }

    public static Map<String, VillageTheme> getAllThemes() {
        return THEMES;
    }
}

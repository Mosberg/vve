package dk.mosberg.data;

import java.util.List;
import java.util.Map;

public class VillagerPreferences {
    public static class ItemValue {
        public String item;
        public int value;
    }
    public static class CultureGroup {
        public List<ItemValue> likes;
        public List<ItemValue> dislikes;
    }
    public static class ProfessionSpecific {
        public List<ItemValue> likes;
        public List<ItemValue> dislikes;
    }

    public Map<String, CultureGroup> culture_groups;
    public Map<String, ProfessionSpecific> profession_specific;
    public Map<String, Integer> gift_values;
}

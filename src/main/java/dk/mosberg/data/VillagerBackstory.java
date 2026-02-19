package dk.mosberg.data;

import java.util.List;
import java.util.Map;

public class VillagerBackstory {
    public static class Template {
        public String id;
        public double rarity;
        public String text;
        public List<String> triggers;
        public List<String> traits;
    }
    public static class CultureGroup {
        public double weight;
        public List<Template> templates;
    }

    public Map<String, CultureGroup> culture_groups;
    public List<Template> universal;
    public Map<String, List<String>> placeholders;
}

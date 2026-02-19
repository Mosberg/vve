package dk.mosberg.data;

import java.util.List;
import java.util.Map;

public class VillagerGoals {
    public static class GoalType {
        public double weight;
        public String description;
        public List<String> quests;
        public List<String> progress;
    }
    public static class ProfessionGoal {
        public String id;
        public String description;
        public Map<String, Integer> requirements;
    }

    public Map<String, GoalType> goal_types;
    public Map<String, List<ProfessionGoal>> profession_goals;
    public CompletionRewards completion_rewards;

    public static class CompletionRewards {
        public int reputation;
        public boolean special_trades;
        public boolean unique_dialogue;
    }
}

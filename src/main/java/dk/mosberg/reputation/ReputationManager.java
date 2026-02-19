package dk.mosberg.reputation;

import java.util.HashMap;
import java.util.Map;

/**
 * Manages player reputation and influence in villages. Supports reputation levels, actions, and
 * effects.
 */
public class ReputationManager {
    private static final Map<String, Integer> PLAYER_REP = new HashMap<>(); // playerId -> rep
    static {
        // For test isolation, always clear PLAYER_REP
        PLAYER_REP.clear();
    }

    public enum ReputationLevel {
        OUTCAST, STRANGER, FRIEND, ALLY, CHAMPION, HONORARY_VILLAGER
    }

    public static int getReputation(String playerId) {
        return PLAYER_REP.getOrDefault(playerId, 0);
    }

    public static void adjustReputation(String playerId, int delta) {
        PLAYER_REP.put(playerId, getReputation(playerId) + delta);
    }

    public static ReputationLevel getLevel(String playerId) {
        int rep = getReputation(playerId);
        if (rep < -50)
            return ReputationLevel.OUTCAST;
        if (rep < 0)
            return ReputationLevel.STRANGER;
        if (rep < 50)
            return ReputationLevel.FRIEND;
        if (rep < 100)
            return ReputationLevel.ALLY;
        if (rep < 200)
            return ReputationLevel.CHAMPION;
        return ReputationLevel.HONORARY_VILLAGER;
    }
}

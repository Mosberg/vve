package dk.mosberg.defense;

import java.util.Collections;

/**
 * Registers all built-in threats and defense upgrades for the village.
 */
public class BuiltinDefense {
    public static final ThreatType RAID =
            new ThreatType("raid", "Raid", Collections.singletonMap("stages", 3));
    public static final ThreatType MONSTER_ATTACK = new ThreatType("monster_attack",
            "Monster Attack", Collections.singletonMap("creature", "night"));
    public static final ThreatType BANDIT_CAMP =
            new ThreatType("bandit_camp", "Bandit Camp", Collections.singletonMap("growth", true));
    public static final ThreatType ROGUE_MAGE = new ThreatType("rogue_mage", "Rogue Mage",
            Collections.singletonMap("corruption", true));

    public static final DefenseUpgrade GUARD_TOWER =
            new DefenseUpgrade("guard_tower", "Guard Tower", Collections.singletonMap("tier", 1));
    public static final DefenseUpgrade PATROL_ROUTE = new DefenseUpgrade("patrol_route",
            "Patrol Route", Collections.singletonMap("length", 100));
    public static final DefenseUpgrade ALARM_BELL =
            new DefenseUpgrade("alarm_bell", "Alarm Bell", Collections.singletonMap("radius", 32));
    public static final DefenseUpgrade REINFORCED_GATE = new DefenseUpgrade("reinforced_gate",
            "Reinforced Gate", Collections.singletonMap("strength", 3));

    public static void registerAll() {
        DefenseManager.registerThreat(RAID.getId(), RAID);
        DefenseManager.registerThreat(MONSTER_ATTACK.getId(), MONSTER_ATTACK);
        DefenseManager.registerThreat(BANDIT_CAMP.getId(), BANDIT_CAMP);
        DefenseManager.registerThreat(ROGUE_MAGE.getId(), ROGUE_MAGE);
        DefenseManager.registerUpgrade(GUARD_TOWER.getId(), GUARD_TOWER);
        DefenseManager.registerUpgrade(PATROL_ROUTE.getId(), PATROL_ROUTE);
        DefenseManager.registerUpgrade(ALARM_BELL.getId(), ALARM_BELL);
        DefenseManager.registerUpgrade(REINFORCED_GATE.getId(), REINFORCED_GATE);
    }
}

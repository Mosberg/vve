package dk.mosberg.defense.raid;

import java.util.HashMap;
import java.util.Map;

/**
 * Advanced raid mechanics: multi-stage raids, siege weapons, elite pillager units.
 */
public class RaidManager {
    private static final Map<String, Raid> raids = new HashMap<>(); // raidId -> Raid
    private static final Map<String, SiegeWeapon> siegeWeapons = new HashMap<>(); // weaponId ->
                                                                                  // SiegeWeapon
    private static final Map<String, ElitePillager> elitePillagers = new HashMap<>(); // unitId ->
                                                                                      // ElitePillager

    public static void registerRaid(String raidId, Raid raid) {
        raids.put(raidId, raid);
    }

    public static Raid getRaid(String raidId) {
        return raids.get(raidId);
    }

    public static void registerSiegeWeapon(String weaponId, SiegeWeapon weapon) {
        siegeWeapons.put(weaponId, weapon);
    }

    public static SiegeWeapon getSiegeWeapon(String weaponId) {
        return siegeWeapons.get(weaponId);
    }

    public static void registerElitePillager(String unitId, ElitePillager pillager) {
        elitePillagers.put(unitId, pillager);
    }

    public static ElitePillager getElitePillager(String unitId) {
        return elitePillagers.get(unitId);
    }
}

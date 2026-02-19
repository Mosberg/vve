package dk.mosberg.defense.raid;

import java.util.Collections;

/**
 * Registers built-in raids, siege weapons, and elite pillager units.
 */
public class BuiltinRaids {
    public static final Raid MULTISTAGE_RAID = new Raid("multistage_raid", "Multi-Stage Raid", 3,
            Collections.singletonMap("strategy", "phased_attack"));
    public static final SiegeWeapon PILLAGER_RAM =
            new SiegeWeapon("pillager_ram", "Pillager Ram", Collections.singletonMap("damage", 10));
    public static final SiegeWeapon FIRE_ARROW =
            new SiegeWeapon("fire_arrow", "Fire Arrow", Collections.singletonMap("burn", true));
    public static final ElitePillager ELITE_PILLAGER = new ElitePillager("elite_pillager",
            "Elite Pillager", Collections.singletonMap("armorTier", 2));

    public static void registerAll() {
        RaidManager.registerRaid(MULTISTAGE_RAID.getId(), MULTISTAGE_RAID);
        RaidManager.registerSiegeWeapon(PILLAGER_RAM.getId(), PILLAGER_RAM);
        RaidManager.registerSiegeWeapon(FIRE_ARROW.getId(), FIRE_ARROW);
        RaidManager.registerElitePillager(ELITE_PILLAGER.getId(), ELITE_PILLAGER);
    }
}

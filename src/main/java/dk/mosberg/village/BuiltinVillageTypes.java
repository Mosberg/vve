package dk.mosberg.village;

import java.util.Arrays;
import java.util.Collections;

/**
 * Registers all built-in village types described in the README.
 */
public class BuiltinVillageTypes {
    public static final VillageType FRONTIER = new VillageType("frontier", "Frontier Village",
            Arrays.asList("watchtower", "hunting_cabin"),
            Collections.singletonMap("biome", "plains"));
    public static final VillageType HARBOR = new VillageType("harbor", "Harbor Village",
            Arrays.asList("dock", "fishing_hut", "shipwright", "trading_pier"),
            Collections.singletonMap("biome", "ocean"));
    public static final VillageType MONASTERY = new VillageType("monastery", "Mountain Monastery",
            Arrays.asList("library", "shrine", "monk_quarters"),
            Collections.singletonMap("biome", "mountain"));
    public static final VillageType FOREST = new VillageType("forest", "Forest Enclave",
            Arrays.asList("treehouse", "rope_bridge"), Collections.singletonMap("biome", "forest"));
    public static final VillageType NOMAD = new VillageType("nomad", "Nomad Camp",
            Arrays.asList("tent", "campfire"), Collections.singletonMap("biome", "savanna"));

    public static void registerAll() {
        VillageRegistry.registerVillageType(FRONTIER.getId(), FRONTIER);
        VillageRegistry.registerVillageType(HARBOR.getId(), HARBOR);
        VillageRegistry.registerVillageType(MONASTERY.getId(), MONASTERY);
        VillageRegistry.registerVillageType(FOREST.getId(), FOREST);
        VillageRegistry.registerVillageType(NOMAD.getId(), NOMAD);
    }
}

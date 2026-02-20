package dk.mosberg.village;

/**
 * Registers all built-in village types described in the README.
 */
public class BuiltinVillageTypes {
    public static void registerAll(dk.mosberg.data.VillageTypesConfig config) {
        if (config == null || config.village_types == null)
            return;
        for (dk.mosberg.data.VillageType type : config.village_types) {
            VillageRegistry.registerVillageType(type.id, new VillageType(type));
        }
    }

    public static void registerAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerAll'");
    }
}

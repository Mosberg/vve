package dk.mosberg.profession;

/**
 * Registers all built-in professions described in the README.
 */
public class BuiltinProfessions {
    public static void registerAll(dk.mosberg.data.VillagerProfessionsConfig config) {
        if (config == null || config.villager_professions == null)
            return;
        for (dk.mosberg.data.VillagerProfession prof : config.villager_professions) {
            ProfessionRegistry.registerProfession(prof.id, new VillagerProfession(prof.id,
                    prof.name, prof.trades, prof.abilities, prof.progression));
        }
    }

    public static void registerAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerAll'");
    }
}

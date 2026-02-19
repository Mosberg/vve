package dk.mosberg.villager;

/**
 * Represents a daily routine (e.g., morning, work, evening, festival). Extend this class to
 * implement custom routines.
 */
public abstract class VillagerRoutine {
    private final String id;

    public VillagerRoutine(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public abstract void execute(VillagerContext context);
}

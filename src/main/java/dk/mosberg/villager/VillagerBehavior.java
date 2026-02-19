package dk.mosberg.villager;

/**
 * Represents a single villager AI behavior (e.g., remember player actions, form friendships).
 * Extend this class to implement custom behaviors.
 */
public abstract class VillagerBehavior {
    private final String id;

    public VillagerBehavior(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public abstract void perform(VillagerContext context);
}

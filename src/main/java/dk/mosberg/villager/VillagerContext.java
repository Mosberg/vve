package dk.mosberg.villager;

import java.util.HashMap;
import java.util.Map;

/**
 * Context object passed to behaviors and routines, containing villager state, memory, and
 * environment. Extend as needed for more simulation detail.
 */
public class VillagerContext {
    private final Map<String, Object> memory = new HashMap<>();

    public Object getMemory(String key) {
        return memory.get(key);
    }

    public void setMemory(String key, Object value) {
        memory.put(key, value);
    }

    private net.minecraft.world.World world;
    private net.minecraft.entity.Entity villagerEntity;

    public net.minecraft.world.World getWorld() {
        return world;
    }

    public void setWorld(net.minecraft.world.World world) {
        this.world = world;
    }

    public net.minecraft.entity.Entity getVillagerEntity() {
        return villagerEntity;
    }

    public void setVillagerEntity(net.minecraft.entity.Entity villagerEntity) {
        this.villagerEntity = villagerEntity;
    }
}

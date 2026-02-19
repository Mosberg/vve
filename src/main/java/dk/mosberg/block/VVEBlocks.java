package dk.mosberg.block;

import dk.mosberg.VVE;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public final class VVEBlocks {
    public static Block VILLAGE_MANAGER;

    private VVEBlocks() {
        // Private constructor to prevent instantiation
    }

    @SuppressWarnings("null")
    public static void register() {
        @SuppressWarnings("unchecked")
        var blockRegistry = (net.minecraft.registry.Registry<Block>) (Object) Registries.BLOCK;
        @SuppressWarnings("unchecked")
        var itemRegistry = (net.minecraft.registry.Registry<Item>) (Object) Registries.ITEM;

        Identifier id = Identifier.of(VVE.MOD_ID, "village_manager");
        RegistryKey<Block> blockKey = RegistryKey.of(RegistryKeys.BLOCK, id);
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, id);

        VILLAGE_MANAGER = Registry.register(blockRegistry, blockKey,
                new VillageManagerBlock(AbstractBlock.Settings.create().registryKey(blockKey)
                        .strength(2.0f).requiresTool()));
        Registry.register(itemRegistry, itemKey,
                new BlockItem(VILLAGE_MANAGER, new Item.Settings().registryKey(itemKey)));
    }
}

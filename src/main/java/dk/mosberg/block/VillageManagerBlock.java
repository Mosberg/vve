package dk.mosberg.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.World;

/**
 * Village Manager Block implementation.
 */
public class VillageManagerBlock extends Block {
    // Static block and item instances (initialized in register method)
    public static VillageManagerBlock VILLAGE_MANAGER_BLOCK;
    public static BlockItem VILLAGE_MANAGER_BLOCK_ITEM;

    public VillageManagerBlock(Settings settings) {
        super(settings);
    }


    public ActionResult onUse(BlockState state, World world, net.minecraft.util.math.BlockPos pos,
            PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient()) {
            // Send packet to client to open management menu
            // (Stub: actual networking code needed)
            System.out.println("Triggering management menu open on client");
        }
        return ActionResult.SUCCESS;
    }

    // Registration logic for block and item
    public static void register() {
        Identifier id = Identifier.of("vve:village_manager_block");
        VILLAGE_MANAGER_BLOCK = new VillageManagerBlock(Block.Settings.create().strength(4.0f));
        VILLAGE_MANAGER_BLOCK_ITEM = new BlockItem(VILLAGE_MANAGER_BLOCK, new Item.Settings());
        Registry.register(Registries.BLOCK, id, VILLAGE_MANAGER_BLOCK);
        Registry.register(Registries.ITEM, id, VILLAGE_MANAGER_BLOCK_ITEM);
        // Call this from your mod's initialization
    }
}

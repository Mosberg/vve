package dk.mosberg.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.World;

/**
 * Village Manager Block implementation.
 */
public class VillageManagerBlock extends Block {
    // Static block and item instances (initialized in register method)
    public static Block VILLAGE_MANAGER_BLOCK;
    public static BlockItem VILLAGE_MANAGER_BLOCK_ITEM;

    public VillageManagerBlock(Settings settings) {
        super(settings);
    }


    public ActionResult onUse(BlockState state, World world, net.minecraft.util.math.BlockPos pos,
            PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!world.isClient()) {
            // TODO: Send packet to client to open management menu
            // TODO: (Stub: actual networking code needed)
            System.out.println("Triggering management menu open on client");
        }
        return ActionResult.SUCCESS;
    }
}

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
            if (player instanceof net.minecraft.server.network.ServerPlayerEntity serverPlayer) {
                dk.mosberg.network.VVENetworking.sendOpenManagementMenu(serverPlayer);
            }
        }
        return ActionResult.SUCCESS;
    }
}

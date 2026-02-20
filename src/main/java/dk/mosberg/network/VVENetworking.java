package dk.mosberg.network;

import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.server.network.ServerPlayerEntity;

public class VVENetworking {
    @SuppressWarnings("null")
    public static void registerPayloads() {
        // Register the S2C payload type and codec
        PayloadTypeRegistry.playS2C().register(OpenManagementMenuS2CPayload.ID,
                OpenManagementMenuS2CPayload.PAYLOAD_CODEC);
    }

    public static void registerServerReceivers() {
        // No server receivers for open menu (server->client only)
    }

    public static void sendOpenManagementMenu(ServerPlayerEntity player) {
        if (player != null) {
            ServerPlayNetworking.send(player, new OpenManagementMenuS2CPayload());
        }
    }
}

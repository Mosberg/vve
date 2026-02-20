package dk.mosberg.network;

import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;

public record OpenManagementMenuS2CPayload() implements CustomPayload {
    public static final CustomPayload.Id<OpenManagementMenuS2CPayload> ID =
            CustomPayload.id("vve/open_management_menu");
    public static final PacketCodec<RegistryByteBuf, OpenManagementMenuS2CPayload> PAYLOAD_CODEC =
            PacketCodec.unit(new OpenManagementMenuS2CPayload());

    @Override
    public CustomPayload.Id<OpenManagementMenuS2CPayload> getId() {
        return ID;
    }

    // If you need to read/write this payload, add static methods like:
    public static OpenManagementMenuS2CPayload read(RegistryByteBuf buf) {
        // No data to read for this payload
        return new OpenManagementMenuS2CPayload();
    }

    public void write(RegistryByteBuf buf) {
        // No data to write for this payload
    }
}

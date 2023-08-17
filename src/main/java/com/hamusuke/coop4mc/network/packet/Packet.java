package com.hamusuke.coop4mc.network.packet;

import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.minecraft.network.PacketByteBuf;

public interface Packet {
    PacketByteBuf write(PacketByteBuf buf);
}

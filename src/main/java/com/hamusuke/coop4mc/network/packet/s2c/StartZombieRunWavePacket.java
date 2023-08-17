package com.hamusuke.coop4mc.network.packet.s2c;

import com.hamusuke.coop4mc.network.packet.Packet;
import net.minecraft.network.PacketByteBuf;

public class StartZombieRunWavePacket implements Packet {
    @Override
    public PacketByteBuf write(PacketByteBuf buf) {
        return buf;
    }
}

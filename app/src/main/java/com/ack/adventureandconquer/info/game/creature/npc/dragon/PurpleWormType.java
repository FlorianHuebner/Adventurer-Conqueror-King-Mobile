package com.ack.adventureandconquer.info.game.creature.npc.dragon;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;

/**
 * Created by saskyrar on 18/01/15.
 */
public class PurpleWormType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return false;
    }
}
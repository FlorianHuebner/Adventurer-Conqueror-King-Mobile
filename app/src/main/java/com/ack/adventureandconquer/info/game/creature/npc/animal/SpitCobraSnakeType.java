package com.ack.adventureandconquer.info.game.creature.npc.animal;

import com.ack.adventureandconquer.info.game.creature.npc.IsNpcType;

/**
 * Created by saskyrar on 17/01/15.
 */
public class SpitCobraSnakeType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return false;
    }
}
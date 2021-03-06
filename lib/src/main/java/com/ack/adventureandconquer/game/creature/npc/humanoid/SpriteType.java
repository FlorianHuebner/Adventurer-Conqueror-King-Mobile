package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class SpriteType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 30;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return Sprite.getWing();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Wing";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return Sprite.getLair();
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Lair";
    }
}

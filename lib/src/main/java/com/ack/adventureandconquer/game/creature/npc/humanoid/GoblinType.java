package com.ack.adventureandconquer.game.creature.npc.humanoid;

import com.ack.adventureandconquer.game.creature.npc.IsNpcType;
import com.ack.adventureandconquer.game.creature.npc.Npc;

import java.util.List;

/**
 * Created by saskyrar on 17/01/15.
 */
public class GoblinType implements IsNpcType {
    @Override
    public boolean isLair(int number) {
        return number <= 40;
    }

    @Override
    public List<Npc> getNormalWildnessEncounter() {
        return Goblin.getWarband();
    }

    @Override
    public String getNormalWildnessEncounterName() {
        return "Warband";
    }

    @Override
    public List<Npc> getLairWildnessEncounter() {
        return Goblin.getVillage();
    }

    @Override
    public String getLairWildnessEncounterName() {
        return "Village";
    }
}

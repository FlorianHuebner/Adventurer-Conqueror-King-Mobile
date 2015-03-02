package com.ack.adventureandconquer.info.game.proficiency;

import com.ack.adventureandconquer.info.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Running extends Proficiency {
    @Override
    public String getName() {
        return RUNNING;
    }

    @Override
    public String getDescription() {
        return "The character’s base movement speed is increased by 30' when wearing " +
                "chainmail or lighter armor.";
    }
}

package com.ack.adventureandconquer.game.proficiency;

import com.ack.adventureandconquer.game.Proficiency;

/**
 * Created by saskyrar on 02/03/15.
 */
public class Prophecy extends Proficiency {
    @Override
    public String getName() {
        return PROPHECY;
    }

    @Override
    public String getDescription() {
        return "The character is subject to premonitions and dreams of the past and future. " +
                "The Judge will make these visions both cryptic and useful. Once per week, " +
                "the character can commune (as the spell).";
    }
}

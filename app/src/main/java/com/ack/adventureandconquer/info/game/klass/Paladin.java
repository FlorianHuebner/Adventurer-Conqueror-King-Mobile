package com.ack.adventureandconquer.info.game.klass;

/**
 * Created by saskyrar on 03/03/15.
 */
public class Paladin extends CharacterClass {
    @Override
    protected long getLevel2Experience() {
        return 1850;
    }

    @Override
    protected long getLevel3Experience() {
        return 3700;
    }

    @Override
    protected long getLevel4Experience() {
        return 7400;
    }

    @Override
    protected long getLevel5Experience() {
        return 14800;
    }

    @Override
    protected long getLevel6Experience() {
        return 29600;
    }

    @Override
    protected long getLevel7Experience() {
        return 60000;
    }

    @Override
    protected long getLevel8Experience() {
        return 120000;
    }

    @Override
    protected long getLevel9Experience() {
        return 240000;
    }

    @Override
    protected long getLevel10Experience() {
        return 360000;
    }

    @Override
    protected long getLevel11Experience() {
        return 480000;
    }

    @Override
    protected long getLevel12Experience() {
        return 600000;
    }

    @Override
    protected long getLevel13Experience() {
        return 720000;
    }

    @Override
    protected long getLevel14Experience() {
        return 840000;
    }

    @Override
    protected String getLevel1Title() {
        return "Bulwark";
    }

    @Override
    protected String getLevel2Title() {
        return "Warder";
    }

    @Override
    protected String getLevel3Title() {
        return "Defender";
    }

    @Override
    protected String getLevel4Title() {
        return "Protector";
    }

    @Override
    protected String getLevel5Title() {
        return "Guardian";
    }

    @Override
    protected String getLevel6Title() {
        return "Sentinel";
    }

    @Override
    protected String getLevel7Title() {
        return "Justiciar";
    }

    @Override
    protected String getLevel8Title() {
        return "Paladin";
    }

    @Override
    protected String getLevel9Title() {
        return "Paladin Lord";
    }

    @Override
    protected String getLevel10Title() {
        return "Paladin Lord (X)";
    }

    @Override
    protected String getLevel11Title() {
        return "Paladin Lord (XI)";
    }

    @Override
    protected String getLevel12Title() {
        return "Paladin Lord (XII)";
    }

    @Override
    protected String getLevel13Title() {
        return "Paladin Lord (XIII)";
    }

    @Override
    protected String getLevel14Title() {
        return "Lord Protector";
    }

    @Override
    public int getPetrificationParalysisSaving() {
        return getSaving(15);
    }

    @Override
    public int getPoisonDeathSaving() {
        return getSaving(14);
    }

    @Override
    public int getBlastBreathSaving() {
        return getSaving(16);
    }

    @Override
    public int getStaffsWandsSaving() {
        return getSaving(16);
    }

    @Override
    public int getSpellsSaving() {
        return getSaving(17);
    }

    @Override
    public int getAttackThrow() {
        return getSaving(10);
    }

    private int getSaving(int startingPoint) {

        switch (getLevel()) {
            case 1:
                return startingPoint;
            case 2:
            case 3:
                return startingPoint - 1;
            case 4:
                return startingPoint - 2;
            case 5:
            case 6:
                return startingPoint - 3;
            case 7:
                return startingPoint - 4;
            case 8:
            case 9:
                return startingPoint - 5;
            case 10:
                return startingPoint - 6;
            case 11:
            case 12:
                return startingPoint - 7;
            case 13:
                return startingPoint - 8;
            case 14:
                return startingPoint - 9;
            default:
                return -1;
        }
    }
}

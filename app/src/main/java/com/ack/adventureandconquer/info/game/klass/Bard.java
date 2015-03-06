package com.ack.adventureandconquer.info.game.klass;

/**
 * Created by saskyrar on 25/02/15.
 */
public class Bard extends CharacterClass {
    @Override
    protected long getLevel2Experience() {
        return 1400;
    }

    @Override
    protected long getLevel3Experience() {
        return 2800;
    }

    @Override
    protected long getLevel4Experience() {
        return 5600;
    }

    @Override
    protected long getLevel5Experience() {
        return 11200;
    }

    @Override
    protected long getLevel6Experience() {
        return 22400;
    }

    @Override
    protected long getLevel7Experience() {
        return 45000;
    }

    @Override
    protected long getLevel8Experience() {
        return 90000;
    }

    @Override
    protected long getLevel9Experience() {
        return 190000;
    }

    @Override
    protected long getLevel10Experience() {
        return 290000;
    }

    @Override
    protected long getLevel11Experience() {
        return 390000;
    }

    @Override
    protected long getLevel12Experience() {
        return 490000;
    }

    @Override
    protected long getLevel13Experience() {
        return 590000;
    }

    @Override
    protected long getLevel14Experience() {
        return 690000;
    }

    @Override
    protected String getLevel1Title() {
        return "Reciter";
    }

    @Override
    protected String getLevel2Title() {
        return "Versifier";
    }

    @Override
    protected String getLevel3Title() {
        return "Archivist";
    }

    @Override
    protected String getLevel4Title() {
        return "Annalist";
    }

    @Override
    protected String getLevel5Title() {
        return "Chronicler";
    }

    @Override
    protected String getLevel6Title() {
        return "Panegyrist";
    }

    @Override
    protected String getLevel7Title() {
        return "Skald";
    }

    @Override
    protected String getLevel8Title() {
        return "Rhapsodist";
    }

    @Override
    protected String getLevel9Title() {
        return "Bard";
    }

    @Override
    protected String getLevel10Title() {
        return "Bard (X)";
    }

    @Override
    protected String getLevel11Title() {
        return "Bard (XI)";
    }

    @Override
    protected String getLevel12Title() {
        return "Bard (XII)";
    }

    @Override
    protected String getLevel13Title() {
        return "Bard (XIII)";
    }

    @Override
    protected String getLevel14Title() {
        return "Master Bard";
    }

    @Override
    public int getPetrificationParalysisSaving() {
        return getSaving(13);
    }

    @Override
    public int getPoisonDeathSaving() {
        return getSaving(13);
    }

    @Override
    public int getBlastBreathSaving() {
        return getSaving(16);
    }

    @Override
    public int getStaffsWandsSaving() {
        return getSaving(14);
    }

    @Override
    public int getSpellsSaving() {
        return getSaving(15);
    }

    @Override
    public int getAttackThrow() {
        return getSaving(10);
    }

    private int getSaving(int startingPoint) {

        switch (getLevel()) {
            case 1:
            case 2:
                return startingPoint;
            case 3:
            case 4:
                return startingPoint - 1;
            case 5:
            case 6:
                return startingPoint - 2;
            case 7:
            case 8:
                return startingPoint - 3;
            case 9:
            case 10:
                return startingPoint - 4;
            case 11:
            case 12:
                return startingPoint - 5;
            case 13:
            case 14:
                return startingPoint - 6;
            default:
                return -1;
        }
    }
}

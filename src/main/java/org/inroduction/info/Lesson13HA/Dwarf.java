package org.inroduction.info.Lesson13HA;

public class Dwarf extends Warrior {

    protected boolean hasWeapon;

    private int axeStrength;

    public Dwarf(String gender, int strength, String name, int protection, boolean hasWeapon, int axeStrength) {
        super(gender, strength, name, protection);
        this.hasWeapon = hasWeapon;
        this.axeStrength = axeStrength;
    }

    @Override
    public void hit() {
        System.out.println("I hit with axe with " + (strength + axeStrength) + " points");
    }

    @Override
    public String toString() {
        return "Dwarf{" +
                "axeStrength=" + axeStrength +
                '}';
    }
}

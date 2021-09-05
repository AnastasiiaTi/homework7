package org.inroduction.info.Lesson13HA;

public class Archer extends Elf {

    private int bowStrength;

    public Archer(String gender, int strength, String name, int protection, boolean hasWeapon, int bowStrength) {
        super(gender, strength, name, protection, hasWeapon);
        this.bowStrength = bowStrength;
    }

    @Override
    public void hit() {
        System.out.println("I hit with bow with " + (strength + bowStrength) + " points");
    }

    @Override
    public String toString() {
        return "Archer{" +
                "bowStrength=" + bowStrength +
                '}';
    }
}

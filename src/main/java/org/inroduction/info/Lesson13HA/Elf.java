package org.inroduction.info.Lesson13HA;

public class Elf extends Warrior {

    protected boolean hasWeapon;

    public Elf(String gender, int strength, String name, int protection, boolean hasWeapon) {
        super(gender, strength, name, protection);
        this.hasWeapon = hasWeapon;
    }

    @Override
    public String toString() {
        return "Elf{" +
                "strength=" + strength +
                '}';
    }
}

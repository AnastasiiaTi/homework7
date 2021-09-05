package org.inroduction.info.Lesson13HA;

public class Solution {
    private Warrior[] warriorArray = new Warrior[13];

    public static void main(String[] args) {

        Warrior elfOne = new Elf("male", 10, "elfOne", 12, false);
        Warrior elfTwo = new Elf("male", 7, "elfTwo", 13, false);

        Warrior archerOne = new Archer("female", 10, "archerOne", 22, true, 20);
        Warrior archerTwo = new Archer("male", 10, "archerTwo", 24, true, 20);
        Warrior archerThree = new Archer("female", 10, "archerThree", 20, true, 20);

        Warrior swordMan1 = new SwordMan("male", 10, "swordManOne", 44, true, 30);
        Warrior swordMan2 = new SwordMan("female", 12, "swordManTwo", 56, true, 30);
        Warrior swordMan3 = new SwordMan("female", 9, "swordManThree", 30, true, 30);
        Warrior swordMan4 = new SwordMan("male", 11, "swordManFour", 23, true, 30);
        Warrior swordMan5 = new SwordMan("male", 8, "swordManFive", 43, true, 30);

        Warrior dwarf1 = new Dwarf("female", 22, "dwarf1", 33, true, 40);
        Warrior dwarf2 = new Dwarf("male", 38, "dwarf2", 36, true, 40);
        Warrior dwarf3 = new Dwarf("female", 30, "dwarf3", 19, true, 40);

        Solution solution = new Solution();
        solution.setWarriors(elfOne, elfTwo, archerOne, archerTwo, archerThree, swordMan1, swordMan2, swordMan3, swordMan4, swordMan5, dwarf1, dwarf2, dwarf3);

        for (Warrior warriorElement : solution.warriorArray) {
            warriorElement.sayHello();
            warriorElement.attack();
            System.out.println();
        }
    }

    private void setWarriors(Warrior... warriors) {
        for (int i = 0; i < warriorArray.length; i++) {
            warriorArray[i] = warriors[i];
        }
    }
}

package org.inroduction.info.Lesson13HA;


public class Warrior {

    private int height;
    private int age;
    private String gender;
    protected int strength;
    private String name;
    protected int protection;

    public Warrior(String gender, int strength, String name, int protection) {
        this.gender = gender;
        this.strength = strength;
        this.name = name;
        this.protection = protection;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run() {

    }

    public void eat() {

    }

    public void sayHello() {
        System.out.println("Hello! My name is " + name + " I am " + gender);
    }

    public void hit() {
        System.out.println("I hit with " + strength + " points");
    }

    public void attack() {
        System.out.println("I attack!");
        hit();
    }

    public void defend() {
        System.out.println("I defend!");
        System.out.println("I defend with " + protection + " points");
    }
}

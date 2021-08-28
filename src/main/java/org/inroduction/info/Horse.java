package org.inroduction.info;

public class Horse {

    private final String name;
    private int bet;
    private int raceTime;
    private int speed;

    public Horse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getBet() {
        return bet;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public int getRaceTime() {
        return raceTime;
    }

    public void setRaceTime(int raceTime) {
        this.raceTime = raceTime;
    }

    public int getSpeed() {
        return speed;
    }

    public int calculateHorseSpeed(int racetrackLength) {
         return speed = racetrackLength/raceTime;
    }
}

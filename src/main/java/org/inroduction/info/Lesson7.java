package org.inroduction.info;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Lesson7 {

    public static Horse[] HORSES = new Horse[10];

    public static void main(String[] args) throws IOException {

        Horse horse1 = new Horse("Hector");
        Horse horse2 = new Horse("Heracles");
        Horse horse3 = new Horse("Mary");
        Horse horse4 = new Horse("Eliza");
        Horse horse5 = new Horse("Bonny");
        Horse horse6 = new Horse("Sugar");
        Horse horse7 = new Horse("Mino");
        Horse horse8 = new Horse("Ferra");
        Horse horse9 = new Horse("Kiko");
        Horse horse10 = new Horse("Alberico");

        setHorses(horse1, horse2, horse3, horse4, horse5, horse6, horse7, horse8, horse9, horse10);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Hello! You can bet money on these horses: ");
        printArray(HORSES);

        System.out.println("You can bet money on 3 horses: ");
        int counter = 1;

        while (true) {

            if (counter == 4) {
                startRace();
                break;
            }
            System.out.println("Choose the horse " + (counter));

            String inputData = reader.readLine();

            if ("EXIT".equalsIgnoreCase(inputData)) {
                System.out.println("Goodbye!");
                break;
            }

            Horse horse = getHorse(inputData);
            if (horse == null) {
                System.out.println("Wrong data");
                continue;
            }

            setBets(horse, reader);
            counter++;

        }

        reader.close();
    }

    private static void setBets(Horse horse, BufferedReader reader) throws IOException {
        System.out.println("Please insert your bet");
        int amountOfMoney = checkForCorrect(reader.readLine());

        horse.setBet(amountOfMoney);
    }

    private static void setHorses(Horse... horses) {
        for (int i = 0; i < horses.length; i++) {
            HORSES[i] = horses[i];
        }
    }

    private static Horse getHorse(String inputData) {
        for (Horse horse : HORSES) {
            if (horse.getName().equalsIgnoreCase(inputData))
                return horse;
        }
        return null;
    }

    private static Horse getFastestHorse() {
        Horse horseWinner = HORSES[0];
        int min = horseWinner.getRaceTime();
        for (Horse horse : HORSES
        ) {
            int raceTime = horse.getRaceTime();
            if (raceTime < min) {
                min = raceTime;
                horseWinner = horse;
            }
        }
        return horseWinner;
    }

    private static int checkForCorrect(String inputNumber) {
        try {
            return Integer.parseInt(inputNumber);
        } catch (Exception exception) {
            System.out.println("Incorrect input");
            return -1;
        }
    }

    public static void setTime() {
        for (Horse horse : HORSES) {
            int time = new Random().nextInt(20);
            horse.setRaceTime(time);
        }
    }

    public static void startRace() {
        setTime();

        Horse horseWithMinimumTime = getFastestHorse();
        System.out.println("Winner is " + horseWithMinimumTime.getName());
        if (horseWithMinimumTime.getBet() > 0) {
            System.out.println("Your win is " + horseWithMinimumTime.getBet() * 2);
        }

        horseWithMinimumTime.setRaceTime(Integer.MAX_VALUE);
        horseWithMinimumTime = getFastestHorse();

        System.out.println("Second winner is " + horseWithMinimumTime.getName());

        horseWithMinimumTime.setRaceTime(Integer.MAX_VALUE);
        horseWithMinimumTime = getFastestHorse();

        System.out.println("Third winner is " + horseWithMinimumTime.getName());

    }

    public static void printArray(Horse[] horses) {
        for (Horse horse : horses
        ) {
            System.out.println(horse.getName() + ", ");
        }
        System.out.println();
    }
}
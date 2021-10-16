package com.company;

import java.util.Random;
import java.util.Scanner;

public class Dice {

    public static int RollResult(int user) {
        System.out.println(Board.playersNames[user]+": do you want to roll the dice?");
        System.out.println("[type yes to roll]");
        Scanner roll = new Scanner(System.in);
        String yesToRoll = roll.nextLine();
        int test;
        if (yesToRoll.equalsIgnoreCase("yes")) {
            Random r = new Random();

            int result = 0;
            result = r.nextInt(3);
            result++;

            System.out.println("You rolled a: " + result);
            return result;
        }
        else if (yesToRoll.equalsIgnoreCase("yes") == yesToRoll.equalsIgnoreCase("No") ){
            System.out.println("Dude, you need to roll");
            System.out.println(Board.playersNames[user]+": do you want to roll the dice?");
            System.out.println("[type yes to roll]");
            Random newRoll = new Random();
            roll.nextLine();
            int result2 = newRoll.nextInt(3);
            result2++;

            System.out.println("You rolled a: " + result2);
            return result2;
        }
        else {
            System.out.println("Just fine, I wish you good journey, and greetings to all my neighbours please");
            return 0;
        }
    }
}

package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Random random = new Random();
    System.out.println("how many sides do you want the dice have?: ");
    int sides = input.nextInt();
    System.out.println("how many times would you like to roll the dice?: ");
    int rolls = input.nextInt();
    int[] tally = new int[rolls];


    for (int i = 0; i < rolls ; i++) {
        int result = random.nextInt(sides);
        tally[i] = result;
    }
    for (int j = 0; j < sides; j++) {
        for (int i = 0; i < sides; i++) {
            int total = 0;
            if (i == tally[i]) {
                total = total + 1;
            }
    System.out.println("there are " + total + " " + i + "'s");

        }
    }






    }
}

package com.salo;
import java.util.Scanner;
import java.lang.Math;

public class TrainingClass {
    public static int getRandomIntegerBetweenRange (int min, int max){
        return (int)(Math.random() * ( (max - min) + 1) ) + min;
    }

    public static String random (int digits) {
        int min = 0;
        int max = 9;
        StringBuilder randomizeNumber = new StringBuilder();
        int [] digitArray = new int[digits];

        for (int counter = 0; counter < digits; counter++) {

            if (counter == 0) { digitArray[counter] = getRandomIntegerBetweenRange((min + 1), max); }

            else { digitArray[counter] = getRandomIntegerBetweenRange(min, max); }
        }

        for (int i = 0; i < digits; i++) { randomizeNumber.append(String.valueOf(digitArray[i])); }

        return randomizeNumber.toString();
    }

    public static void multiplyEleven () {
        int number;
        int win = 0;
        int tasks = 0;
        Scanner tasksScan = new Scanner(System.in);

        System.out.println("Ok let's start in multiply by 11 :-)\n");

        System.out.print("How many tasks per section? Enter here: ");
        tasks += tasksScan.nextInt();

        System.out.print("With how many digits in the number will we start? Enter here: ");
        int digits = tasksScan.nextInt();

        System.out.println("How does it works?\n" +
                "We will start with " + digits + " digits in number.\n" +
                "Than when you do a " + tasks + " tasks, I will plus a one digit in number. Ok let's start!");

        DelimiterClass.defaultDelimiter();

        for(;;) {

            for (int i = 0; i < tasks; i++) {
                number = Integer.parseInt(random(digits));

                System.out.println("Number for multiplying by 11 is: " + number);

                System.out.print("Print your answer: ");
                int enter = tasksScan.nextInt();

                if (enter == number * 11) {

                    System.out.println("Wow, correct\n");
                    win++;
                }
                else {
                    System.out.println("Lose, right answer is: " + number * 11 + "\n");
                }
            }

            DelimiterClass.questionDelimiter();

            System.out.print("Stop? Enter( y or n ): ");
            String stop = tasksScan.next();

            if (stop.equals("y")) {
                System.out.println("Oki-doki, your score is " + win + "/" + tasks);

                DelimiterClass.endDelimiter();
                return;
            }
            else if (stop.equals("n")) {
                System.out.println("Yeah, show must go on! Your score is " + win + "/" + tasks);
                digits++;

                DelimiterClass.questionDelimiter();
            }
            else {
                System.out.println("Uupsi-dupsi, eror");
                DelimiterClass.endDelimiter();
                break;
            }

        }
    }
    public static void main (int choice){
        choice = 1;
        switch (choice){
            case 1:
                multiplyEleven();
                break;

            case 2:
                break;

            default:
                System.out.println("Eror");
                break;
        }
    }
}

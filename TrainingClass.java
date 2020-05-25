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
        int [] digitArray;
        digitArray = new int[digits];

        for (int counter = 0; counter < digits; counter++) {

            if (counter == 0) { digitArray[counter] = getRandomIntegerBetweenRange((min + 1), max); }

            else { digitArray[counter] = getRandomIntegerBetweenRange(min, max); }
        }

        for (int i = 0; i < digits; i++) { randomizeNumber.append(digitArray[i]); }

        return randomizeNumber.toString();
    }

    public static void multiplyEleven () {
        int number;
        int win = 0;
        int tasksResult = 0;
        int tasks = 0;
        Scanner tasksScan = new Scanner(System.in);

        System.out.println("Ok let's start in multiply by 11 :-)\n");

        System.out.print("How many tasks per section? Enter here: ");
        tasks = tasksScan.nextInt();

        System.out.print("With how many digits in the number will we start? Enter here: ");
        int digits = tasksScan.nextInt();

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
            tasksResult += tasks;

            if (stop.equals("y")) {
                System.out.println("Oki-doki, your score is " + win + "/" + tasksResult);

                DelimiterClass.endDelimiter();
                return;
            }
            else if (stop.equals("n")) {
                System.out.println("Yeah, show must go on! Your score is " + win + "/" + tasksResult);
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

    public static void multiplyTwelve() {

        int number = 0;
        int win = 0;
        int tasksResult = 0;
        int tasks = 0;
        Scanner tasksScan = new Scanner(System.in);

        System.out.println("Ok let's start in multiply by 12 :-)\n");

        System.out.print("How many tasks per section? Enter here: ");
        tasks = tasksScan.nextInt();

        System.out.print("With how many digits in the number will we start? Enter here: ");
        int digits = tasksScan.nextInt();

        DelimiterClass.defaultDelimiter();

        for(;;) {

            for (int i = 0; i < tasks; i++) {
                number = Integer.parseInt(random(digits));
                int multiplyNumber = number * 12;

                System.out.println("Number for multiplying by 12 is: " + number);

                System.out.print("Print your answer: ");
                int enter = tasksScan.nextInt();

                if (enter == multiplyNumber) {

                    System.out.println("Wow, correct\n");
                    win++;
                }
                else {
                    System.out.println("Lose, right answer is: " + multiplyNumber + "\n");
                }
            }

            DelimiterClass.questionDelimiter();

            System.out.print("Stop? Enter( y or n ): ");
            String stop = tasksScan.next();
            tasksResult += tasks;

            if (stop.equals("y")) {
                System.out.println("Oki-doki, your score is " + win + "/" + tasksResult);

                DelimiterClass.endDelimiter();
                return;
            }
            else if (stop.equals("n")) {
                System.out.println("Yeah, show must go on! Your score is " + win + "/" + tasksResult);
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
        switch (choice){
            case 1:
                multiplyEleven();
                break;

            case 2:
                multiplyTwelve();
                break;

            default:
                System.out.println("Eror");
                break;
        }
    }
}

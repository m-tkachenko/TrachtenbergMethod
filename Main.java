package com.salo;
import java.util.Scanner;

import static com.salo.TrainingClass.multiply;

public class Main {
    public static int menuMethod() {
        Scanner funScan = new Scanner(System.in);

        System.out.println("Functions: ");
        System.out.println("\t0. Exit");
        System.out.println("\t1. Multiplying by 11");
        System.out.println("\t2. Multiplying by 12");
        System.out.println("\t3. Multiplying by 6");

        System.out.print("Please input your choice: ");
        int functionChoice = funScan.nextInt();

        DelimiterClass.betweenFunctionsDelimiter();

        return functionChoice;
    }

    public static void main(String[] args) {

    System.out.println("\t\t\t\t\tTrachtenberg Method Learn\n");

    System.out.println("How does it works?\n" +
            "We will start with digits in number.\n" +
            "Than when you do a number of tasks, I will plus a one digit in number. Ok let's start!\n");
    for(;;) {

        int funChoice = menuMethod();

        switch (funChoice){
            case 0:
                System.out.println("Bye-bye, see you later");
                DelimiterClass.endDelimiter();
                return;

            case 1:
                multiply(11);
                break;

            case 2:
                multiply(12);
                break;

            case 3:
                multiply(6);
                break;

            default:
                System.out.println("EROR");
                break;
        }
    }
    }
}

package com.salo;
import java.util.Scanner;

public class Main {
    public static int menuMethod() {
        Scanner funScan = new Scanner(System.in);

        System.out.println("Functions: ");
        System.out.println("\t1. Multiplying by 11");
        System.out.println("\t2. Multiplying by 12");

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

    int funChoice = menuMethod();
    TrainingClass.main(funChoice);
    }
}

package com.salo;
import java.util.Scanner;

public class Main {
    public static int menuMethod() {
        Scanner funScan = new Scanner(System.in);

        System.out.println("Functions: ");
        System.out.println("\t1. Multiplying by 11");

        System.out.print("Please input your choice: ");
        int functionChoice = funScan.nextInt();

        DelimiterClass.betweenFunctionsDelimiter();

        return functionChoice;
    }

    public static void main(String[] args) {

    System.out.println("\t\t\t\t\tTrachtenberg Method Learn\n");

    int funChoice = menuMethod();
    TrainingClass.main(funChoice);
    }
}

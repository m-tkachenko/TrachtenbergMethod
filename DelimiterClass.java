package com.salo;

public class DelimiterClass {

    public static void defaultDelimiter() {
        String delimiter = "";

        for (int i = 0; i < 50; i++) {
            delimiter += "<>";
        }
        System.out.println("\n" + delimiter + "\n");
    }

    public static void questionDelimiter() {
        String delimiter = "";

        for (int i = 0; i < 100; i++) {
            delimiter += "?";
        }
        System.out.println("\n" + delimiter + "\n");
    }

    public static void endDelimiter() {
        String delimiter = "";

        for (int i = 0; i < 100; i++) {
            delimiter += "~";
        }
        System.out.println("\n" + delimiter + "\n");
    }

    public static void betweenFunctionsDelimiter() {
        String delimiter = "";

        for (int i = 0; i < 100; i++) {
            delimiter += "#";
        }

        System.out.println("\n" + delimiter + "\n");
    }
}

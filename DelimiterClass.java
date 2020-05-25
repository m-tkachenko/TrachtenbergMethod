package com.salo;

public class DelimiterClass {

    public static void defaultDelimiter() {
        StringBuilder delimiter = new StringBuilder();

        for (int i = 0; i < 50; i++) {
            delimiter.append("<>");
        }
        System.out.println("\n" + delimiter + "\n");
    }

    public static void questionDelimiter() {
        StringBuilder delimiter = new StringBuilder();

        for (int i = 0; i < 100; i++) {
            delimiter.append("?");
        }
        System.out.println("\n" + delimiter + "\n");
    }

    public static void endDelimiter() {
        StringBuilder delimiter = new StringBuilder();

        for (int i = 0; i < 100; i++) {
            delimiter.append("~");
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

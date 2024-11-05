package org.example;

import java.util.function.Consumer;

public class Challenge3 {
    private static String testString  = "";
    public static Consumer<String> isStringLengthGreaterThanFive = string -> {
        testString = "";
        if (string.length() > 5){
            testString = string.concat("!");
            System.out.println(testString);
        }
    };

    public static String getTestString() {
        return testString;
    }
}

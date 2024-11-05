package org.example;

import java.util.function.Consumer;

public class Challenge3 {
    public static Consumer<String> isStringLengthGreaterThanFive = string -> {
        if (string.length() > 5){
            System.out.println(string.concat("!"));
        }
    };
}

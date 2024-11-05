package org.example;

import java.util.function.Consumer;

public class Challenge1 {
    private static int indexOfAt;

    public static Consumer<String> indexOfAtSign = email -> {
        indexOfAt = email.indexOf("@");

        System.out.println(indexOfAt);
    };

    public static int getIndexOfAt() {
        return indexOfAt;
    }
}

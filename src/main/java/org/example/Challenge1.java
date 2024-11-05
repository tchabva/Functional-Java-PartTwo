package org.example;

import java.util.function.Consumer;

public class Challenge1 {

    public static Consumer<String> indexOfAtSign = email -> System.out.println(email.indexOf("@"));

}

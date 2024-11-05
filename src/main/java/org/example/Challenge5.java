package org.example;

import java.util.function.BiConsumer;

public class Challenge5 {

    public static BiConsumer<String, Integer> niceGreeing = (name, age) ->{
        System.out.printf("Name: %s\nAge: %d\nHello, there I hope you're having a good day", name, age);
    };
}

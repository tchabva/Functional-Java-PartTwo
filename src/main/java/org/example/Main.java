package org.example;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> list = List.of("a@", "testing@test", "test@test");

        Stream stream = Stream.of("a@", "testing@test", "test@test");

        list.forEach(Challenge1.indexOfAtSign);

        System.out.println(Challenge2.emailListSupplier.get());

        try {
            stream.forEach(Challenge3.isStringLengthGreaterThanFive);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Challenge2.emailListSupplier.get().forEach(Challenge4.returnsUsernameFromEmail);

        Challenge5.niceGreeing.accept("Tawanda", 29);

    }
}
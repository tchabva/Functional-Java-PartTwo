package org.example;

import java.util.List;
import java.util.function.Supplier;

public class Challenge2 {

    public static Supplier<List<String>> emailListSupplier = () -> {

        return List.of("simon.morgan@northcoders.com",
               "chris.ward@northcoders.com",
               "info@stackoverflow.com",
               "hannah.montanna@mileycyrus.com");
    };
}

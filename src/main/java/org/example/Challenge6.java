package org.example;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Challenge6 {

    public static Supplier<List<String>> emailSupplierList = () -> {
        List<String> emailList = List.of("simon.morgan@northcoders.com",
                "chris.ward@northcoders.com",
                "info@stackoverflow.com",
                "hannah.montanna@mileycyrus.com");

        return emailList;
    };

    public static Consumer<List<String>> printEmailsInList = emailList ->{
        emailList.forEach(System.out::println);
    };

}

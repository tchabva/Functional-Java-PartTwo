package org.example;

import java.util.ArrayList;
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

        Challenge6.printEmailsInList.accept(Challenge6.emailSupplierList.get());

        List<Integer> numList = new ArrayList<>();
        numList.add(5);
        numList.add(8);
        numList.add(3);
        numList.add(6);
        numList.add(67);

        Challenge7.squareEachNumberInList.andThen(Challenge7.printIntegerList).accept(numList);

        List<Integer> numListTwo = new ArrayList<>();
        numList.add(5);
        numList.add(8);
        numList.add(3);
        numList.add(6);
        numList.add(6);

        List<Integer> numListThree = new ArrayList<>();
        numList.add(5);
        numList.add(8);
        numList.add(3);
        numList.add(6);
        numList.add(6);

        System.out.println();

        Challenge8.compareTwoIntegerLists.accept(numList, numListTwo);
        Challenge8.compareTwoIntegerLists.accept(numListThree, numListTwo);

    }
}
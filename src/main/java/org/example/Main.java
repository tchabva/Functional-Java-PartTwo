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

        List<String> emailList = new ArrayList<>();
        emailList.add("simon.morgan@northcoders.com");
        emailList.add("chris.ward@northcoders.com");
        emailList.add("mario@plumbing.it");
        emailList.add("link@hyrule.co.uk");
        emailList.add("shrek@duloc.com");
        emailList.add("ellie@northcoders.js");
        emailList.add("java@oracle.jvm");
        emailList.add("ziggy@spidersfrommars.co.uk");
        emailList.add("lemmy@motorhead.co,uk");
        emailList.add("me@myhouse.sleep");

        List<String> UKDomainEmail = Challenge9.isValidEmail.apply(emailList, Challenge9.emailEndsWithUKDomain);
        UKDomainEmail.forEach(System.out::println);

        List<String> ComDomainEmail = Challenge9.isValidEmail.apply(emailList, Challenge9.emailEndsWithComDomain);
        ComDomainEmail.forEach(System.out::println);

        System.out.println("--------------------------");

        List<String> invalidDomain = Challenge9.isValidEmail.apply(emailList, Challenge9.emailInvalidDomain);
        invalidDomain.forEach(System.out::println);

    }
}
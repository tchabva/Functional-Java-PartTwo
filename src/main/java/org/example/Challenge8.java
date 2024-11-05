package org.example;

import java.util.List;
import java.util.function.BiConsumer;

public class Challenge8 {
    BiConsumer<List<Integer>, List<Integer>> compareTwoIntegerLists = (listOne, listTwo) ->{
        if (listOne.containsAll(listTwo)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    };
}

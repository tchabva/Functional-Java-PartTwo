package org.example;

import java.util.List;
import java.util.function.BiConsumer;

public class Challenge8 {
   public static BiConsumer<List<Integer>, List<Integer>> compareTwoIntegerLists = (listOne, listTwo) ->{
        if (listOne.equals(listTwo)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    };
}

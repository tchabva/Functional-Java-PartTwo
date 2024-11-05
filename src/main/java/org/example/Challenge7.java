package org.example;

import java.util.List;
import java.util.function.Consumer;

public class Challenge7 {

    public static Consumer<List<Integer>> squareEachNumberInList = numberList ->{
        numberList.replaceAll(integer -> integer * integer);
    };

    public static Consumer<List<Integer>> printIntegerList = numberList ->{
        numberList.forEach(System.out::println);
    };


}

package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FunctionalJavaTesting {

    @Test
    @DisplayName("Returns the value of the index of the at sign in the input string")
    void testIndexOfAtSign(){
        // Arrange
        List<String> list = List.of("a@", "testing@test", "test@test", "test");

        // Act
        Challenge1.indexOfAtSign.accept(list.get(0));
        int resultOne = Challenge1.getIndexOfAt();
        assertEquals(1, resultOne);

        Challenge1.indexOfAtSign.accept(list.get(1));
        int resultTwo = Challenge1.getIndexOfAt();
        assertEquals(7, resultTwo);

        Challenge1.indexOfAtSign.accept(list.get(2));
        int resultThree = Challenge1.getIndexOfAt();
        assertEquals(4, resultThree);

        Challenge1.indexOfAtSign.accept(list.get(3));
        int resultFour = Challenge1.getIndexOfAt();
        assertEquals(-1, resultFour);
    }
}
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

    @Test
    @DisplayName("Confirms that the Supplier returns a list")
    void testEmailListSupplier(){
        assertEquals(4, Challenge2.emailListSupplier.get().size());

    }

    @Test
    @DisplayName("Prints the string with an exclamation mark if the input string has a length greater than 5")
    void testIsStringLengthGreaterThanFive(){
        // Arrange
        List<String> list = List.of("a@", "testing@test", "test@test", "test");

        // Act
        Challenge3.isStringLengthGreaterThanFive.accept(list.get(0));
        String resultOne = Challenge3.getTestString();
        assertEquals("", resultOne);

        Challenge3.isStringLengthGreaterThanFive.accept(list.get(1));
        String resultTwo = Challenge3.getTestString();
        assertEquals("testing@test!", resultTwo);

        Challenge3.isStringLengthGreaterThanFive.accept(list.get(2));
        String resultThree = Challenge3.getTestString();
        assertEquals("test@test!", resultThree);

        Challenge3.isStringLengthGreaterThanFive.accept(list.get(3));
        String resultFour = Challenge3.getTestString();
        assertEquals("", resultFour);
    }

    @Test
    @DisplayName("Prints username from input email string")
    void testReturnsUsernameFromEmail(){
        //Arrange
        List<String> emailList = Challenge2.emailListSupplier.get();

        //Act and Assert
        Challenge4.returnsUsernameFromEmail.accept(emailList.get(0));
        assertEquals("simon.morgan",Challenge4.getUsername());

    }


}
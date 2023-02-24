package com.hackerman.springapp.jarek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrintTest {

    @Test
    void printName(){

        //given
        char initialLetter = 'r';
        String expectedName = "rafal";
        Print print = new Print();

        //when
        String result = print.printName(initialLetter);
        
        //then
        assertEquals(expectedName,result);
    }
    @Test
    void printNameShouldReturnIllegalStateException() {
        // given
        Print print = new Print();
        // when
        Exception exception = assertThrows(RuntimeException.class, () -> {
            print.printName('d');
        });
        String expectedMessage = "Unexpected value: d";
        String actualMessage = exception.getMessage();

        // then
        assertTrue(actualMessage.contains(expectedMessage));
    }

}
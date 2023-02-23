package com.hackerman.springapp.jarek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
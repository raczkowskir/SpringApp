package com.hackerman.springapp.kuba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMethodsTest {

    @Test
    void fullName() {
        //given
        String expectedResult = "John Smith";
        //when
        String fullName = SimpleMethods.fullName("John",true );
        //then
        assertNotEquals(expectedResult, fullName);
    }
}
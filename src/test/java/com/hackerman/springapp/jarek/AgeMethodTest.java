package com.hackerman.springapp.jarek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgeMethodTest {

    @Test
    void totalAge() {
        int x = AgeMethod.totalAge("Jaro");
        assertEquals(4,x);
    }
}
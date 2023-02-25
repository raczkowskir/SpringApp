package com.hackerman.springapp.jarek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JarekTest {

        @Test
        void getAge() {
            //given
            int x = 35;
            //then
            assertEquals(35,x);
        }
}

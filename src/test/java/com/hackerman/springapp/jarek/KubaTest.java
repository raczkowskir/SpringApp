package com.hackerman.springapp.jarek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KubaTest {

        @Test
        void getAge() {
            //given
            int x = 38;
            //then
            assertEquals(38,x);
        }
}

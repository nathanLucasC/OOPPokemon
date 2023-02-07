package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("Test 1")
    public void test1(){
        int numbers[] = {5,4,3,2,1};
        int[] expected = new int[] {1,2,3,4,5};
        Assertions.assertArrayEquals(expected, Main.sort(numbers));
    }

    @Test
    @DisplayName("Test 2")
    public void test2(){
        int numbers[] = {756,-34,55,345,-333,54};
        int[] expected = new int[] {-333,-34,54,55,345,756};
        Assertions.assertArrayEquals(expected, Main.sort(numbers));
    }



}
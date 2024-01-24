package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    //Coding: Unit Test
    //Write a test for a method that calculates the sum of two integers.
    @Test
    void when1Plus1_thenReturn2() {
        // GIVEN
        int a = 1;
        int b = 1;
        int expected = 2;
        // WHEN
        int actual = Main.sum(a, b);
        // THEN
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void add_when3Plus3_thenReturn6() {
        // GIVEN
        int a = 3;
        int b = 3;
        int expected = a + b;
        // WHEN
        int actual = Main.sum(a, b);
        // THEN
        assertEquals(expected, actual);
    }

    //Write a test for a method that checks if a given number is even.
    @Test
    void checkEven_when3_thenReturnFalse() {
        // GIVEN
        int number = 3;
        // WHEN
        boolean actual = Main.checkEven(number);
        // THEN
        assertFalse(actual);
    }

    @Test
    void checkEven_when4_thenReturnTrue() {
        // GIVEN
        int number = 4;
        // WHEN
        boolean actual = Main.checkEven(number);
        // THEN
        assertTrue(actual);
    }

    //Write a test for a method that calculates the product of two integers.
    @Test
    void when3Times2_thenReturn6() {
        // GIVEN
        int a = 3;
        int b = 2;
        int expected = 6;
        // WHEN
        int actual = Main.multiply(a, b);
        // THEN
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void calcProduct_when3times3_thenReturn9() {
        // GIVEN
        int a = 3;
        int b = 3;
        int expected = a * b;
        // WHEN
        int actual = Main.multiply(a, b);
        // THEN
        assertEquals(expected, actual);
    }

    //Write a test for a method that converts a given string to uppercase.
    @Test
    void convertUppercase_whenNeueFische_thenReturnNEUEFISCHE() {
        // GIVEN
        String a = "NeueFische";
        String expected = "NEUEFISCHE";
        // WHEN
        String actual = Main.convertUppercase(a);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void string_toUppercase_whenWhYiSThIsSoWeIrD_thenReturnWHYISTHISSOWEIRD() {
        // GIVEN
        String test = "WhYiSThIsSoWeIrD";
        String expected = "WHYISTHISSOWEIRD";
        // WHEN
        String actual = Main.convertUppercase(test);
        // THEN
        assertEquals(expected, actual);
    }

    //Write a test for a method that checks if a given number is positive.
    @Test
    void checkPositive_when4_thenReturnTrue() {
        // GIVEN
        int number = 4;
        // WHEN
        boolean actual = Main.checkPositive(number);
        // THEN
        assertTrue(actual);
    }

    @Test
    void checkPositive_whenMinus5_thenReturnFalse() {
        // GIVEN
        int number = -5;
        // WHEN
        boolean actual = Main.checkPositive(number);
        // THEN
        assertFalse(actual);
    }

    @Test
    void isPositive_whenZero_thenReturnFalse() {
        // GIVEN
        int a = 0;
        // WHEN
        boolean actual = Main.checkPositive(a);
        // THEN
        assertFalse(actual);
    }
}
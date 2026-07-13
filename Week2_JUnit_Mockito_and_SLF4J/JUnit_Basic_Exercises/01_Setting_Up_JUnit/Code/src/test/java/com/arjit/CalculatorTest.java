package com.arjit;

import org.junit.Test;

import static org.junit.Assert.*;
import com.arjit.Calculator;


public class CalculatorTest {

    @Test
    public void add() {
        Calculator calculator = new Calculator();

        assertEquals(20, calculator.add(10, 10));
    }
}
package com.example.com.testing;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by raul on 09/11/2016.
 */
public class CalculatorUnitTest {
    @Test
    public void sumItems_isCorrect() throws Exception {
        CalculatorHelper calculatorHelper = new CalculatorHelper();

        assertEquals(0, calculatorHelper.sumItems(-1, 1));
        assertEquals(2, calculatorHelper.sumItems(1, 1));
        assertEquals(10, calculatorHelper.sumItems(5, 5));
        assertEquals(21436, calculatorHelper.sumItems(12312, 9124));
    }

    @Test
    public void multiplyItems_isCorrect() throws Exception {
        CalculatorHelper calculatorHelper = new CalculatorHelper();

        //assertEquals(0, calculatorHelper.multiplyItems(44232, 0));
        //assertEquals(0, calculatorHelper.multiplyItems(0, 2131));
        //assertEquals(722409, calculatorHelper.multiplyItems(339, 2131));
        //assertEquals(-9246409, calculatorHelper.multiplyItems(-4339, 2131));
        //assertEquals(-9246409, calculatorHelper.multiplyItems(4339, -2131));
        assertEquals(9246409, calculatorHelper.multiplyItems(-4339, -2131));
    }

    @Test
    public void powerItems_isCorrect() throws Exception {
        CalculatorHelper calculatorHelper = new CalculatorHelper();

        assertEquals(2187, calculatorHelper.powerItems(3, 7));
        assertEquals(1048576, calculatorHelper.powerItems(2, 20));
        assertEquals(1, calculatorHelper.powerItems(1, 5003031));
    }
}
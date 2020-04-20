package com.bl.demo;

import org.junit.Assert;
import org.junit.Test;

public class ArithmeticOperationTest {
    @Test
    public void givenTwoInteger_WhenAdd_ShouldReturnAddition() {
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        int addition = arithmeticOperation.additionOfNumber(2,3);
        Assert.assertEquals(5,addition);
    }

    @Test
    public void givenTwoInteger_WhenSubtract_ShouldReturnSubtraction() {
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        int subtraction = arithmeticOperation.subtractionOfNumber(3,2);
        Assert.assertEquals(1,subtraction);
    }
}

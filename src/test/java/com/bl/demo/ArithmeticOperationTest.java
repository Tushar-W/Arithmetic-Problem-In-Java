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
}

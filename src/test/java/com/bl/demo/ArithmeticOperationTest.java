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

    @Test
    public void givenTwoInteger_WhenMultiply_ShouldReturnMultiplication() {
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        int multiplication = arithmeticOperation.multiplicationOfNumber(3,2);
        Assert.assertEquals(6,multiplication);
    }

    @Test
    public void givenTwoInteger_WhenDivide_ShouldReturnDivision() {
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        int division = arithmeticOperation.divisionOfNumber(5,5);
        Assert.assertEquals(1,division);
    }

    @Test
    public void givenTwoInteger_WhenMod_ShouldReturnModulus() {
        ArithmeticOperation arithmeticOperation = new ArithmeticOperation();
        int modulus = arithmeticOperation.modulusOfNumber(5,5);
        Assert.assertEquals(0,modulus);
    }
}

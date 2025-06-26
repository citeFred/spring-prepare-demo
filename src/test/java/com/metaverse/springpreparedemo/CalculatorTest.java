package com.metaverse.springpreparedemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    @DisplayName("더하기 테스트")
    void test1() {
        // given
        Calculator calculator = new Calculator();
        int num1 = 8;
        int num2 = 2;
        double result;

        // when
        result = calculator.operate(8, "+", 2);

        // then
        System.out.println("test1 result:" +result);
        Assertions.assertEquals(10, result);
    }

    @Test
    @DisplayName("나누기 테스트")
    void test2() {
        // given
        Calculator calculator = new Calculator();
        int num1 = 8;
        int num2 = 2;
        double result;

        // when
        result = calculator.operate(8, "/", 2);

        // then
        System.out.println("test2 result = " + result);
        Assertions.assertEquals(4, result);
    }
}
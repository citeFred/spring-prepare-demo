package com.metaverse.springpreparedemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@Nested
@DisplayName("계산기 테스트")
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
        result = calculator.operate(num1, "+", num2);

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
        result = calculator.operate(num1, "/", num2);

        // then
        System.out.println("test2 result = " + result);
        Assertions.assertEquals(4, result);
    }

    @Test
    @DisplayName("빼기 테스트")
    void test3() {
        // given
        Calculator calculator = new Calculator();
        int num1 = 10;
        int num2 = 3;
        double result;

        // when
        result = calculator.operate(num1, "-", num2);

        // then
        System.out.println("test3 result = " + result);
        Assertions.assertEquals(7, result);
    }

    @Test
    @DisplayName("곱셈 테스트")
    void test4() {
        // given
        Calculator calculator = new Calculator();
        int num1 = 5;
        int num2 = 4;
        double result;

        // when
        result = calculator.operate(num1, "*", num2);

        // then
        System.out.println("test4 result = " + result);
        Assertions.assertEquals(20, result);
    }

    @Test
    @DisplayName("나누기 Null 테스트")
    void test5() {
        // given
        Calculator calculator = new Calculator();
        int num1 = 5;
        int num2 = 0;

        // when
        Double result = calculator.operate(num1, "/", num2);

        // then
        System.out.println("test5 result = " + result);
        Assertions.assertNull(result);
    }

    @Test
    @DisplayName("잘못된 연산자 예외 테스트")
    void test6() {
        // given
        Calculator calculator = new Calculator();
        int num1 = 10;
        int num2 = 5;
        String op = "%"; // 잘못된 연산자

        // when & then
        IllegalArgumentException thrown = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> calculator.operate(num1, op, num2)
        );
        Assertions.assertEquals("잘못된 연산자입니다.", thrown.getMessage());
    }
}
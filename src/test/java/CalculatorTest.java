package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

public class CalculatorTest {
    // HW JC №6 Тест программы Калькулятор (HW JC №1 Калькулятор)
    Calculator sut = new Calculator();
    
    @Test
    public void testPlus() {
        // arrange (given)
    int a = 10, b = 20, expected = 30;
        // act (when)
        int result = sut.plus.apply(a, b);
        // assert (then)
        Assertions.assertEquals(expected, result);
    }


    @Test
    public void testMinus() {
        // arrange (given)
        int a = 10, b = 20, expected = -10;
        // act (when)
        int result = sut.minus.apply(a, b);
        // assert (then)
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testMultiply() {
        // arrange (given)
        int a = 10, b = 20, expected = 200;
        // act (when)
        int result = sut.multiply.apply(a, b);

        // assert (then)
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("mySource")
    public void testAddWithParameters(int a, int b, int expected) {
        // act
        int result = sut.devide.apply(a, b);
        // assert
        Assertions.assertEquals(expected, result);
    }


    public static Stream<Arguments> mySource() {
        return Stream.of(
                Arguments.of( 8, 4, 2),
                Arguments.of( 16, 8, 2),
                Arguments.of( 32, 16, 2),
                Arguments.of( 64, 32, 2)
        );
    }}

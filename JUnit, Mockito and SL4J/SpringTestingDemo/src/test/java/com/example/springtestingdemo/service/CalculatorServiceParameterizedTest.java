package com.example.springtestingdemo.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceParameterizedTest {

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "10, 20, 30",
            "-1, 1, 0"
    })
    void testAddMultiple(int a, int b, int expected) {
        CalculatorService service = new CalculatorService();
        assertEquals(expected, service.add(a, b));
    }
}

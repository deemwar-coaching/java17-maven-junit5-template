package tools.templates;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();
    @Test
    void add() {

        assertEquals(3, calculator.add(1, 2));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1, 2",  // a = 1, b = 1, expected = 2
            "2, 3, 5",  // a = 2, b = 3, expected = 5
            "5, -3, 2", // a = 5, b = -3, expected = 2
            "0, 0, 0"   // a = 0, b = 0, expected = 0
    })
    void testAdd(int a, int b, int expected) {

        assertEquals(expected, calculator.add(a, b));
    }}
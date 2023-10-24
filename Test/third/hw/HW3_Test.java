package third.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import seminars.third.hw.HW3;

import static org.junit.jupiter.api.Assertions.*;

class SomeServiceTest {
    private HW3 hw3;

    @BeforeEach
    void setUp() {
        hw3 = new HW3();
    }

    @Test
    void evenOddNumber() {
        assertTrue(hw3.evenOddNumber(2));
        assertFalse(hw3.evenOddNumber(1));
    }

    @Test
    void evenOddNumberZero() {
        assertTrue(hw3.evenOddNumber(0));
    }

    @Test
    void evenOddNumberNegative() {
        assertTrue(hw3.evenOddNumber(-2));
        assertFalse(hw3.evenOddNumber(-1));
    }

    @Test
    void numberInInterval() {
        assertTrue(hw3.numberInInterval(26));
        assertTrue(hw3.numberInInterval(99));
        assertFalse(hw3.numberInInterval(24));
        assertFalse(hw3.numberInInterval(101));
    }

    @Test
    void numberInIntervalLeftBorder() {
        assertFalse(hw3.numberInInterval(25));
    }

    @Test
    void numberInIntervalNegative() {
        assertFalse(hw3.numberInInterval(-1));
    }

    @Test
    void numberInIntervalZero() {
        assertFalse(hw3.numberInInterval(0));
    }
}

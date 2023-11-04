package by.shcherba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void Task2() {
        boolean expected = true;
        boolean actual = Task2.checkPoint(4, 0);
        assertEquals(expected, actual);
    }
}
package by.shcherba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void findMinK() {
        int[] arr = {4, 5, 6, 2, 8, 3};
        int expected = 2;
        int actual = Task5.findMinK(arr);
        assertEquals(expected, actual);
    }
}
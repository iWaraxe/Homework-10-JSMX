package com.coherentsolutions;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayUtilitiesTest {
    @Test
    public void testFindMax() {
        ArrayUtilities au = new ArrayUtilities();
        assertEquals(3, au.findMax(new int[]{1, 2, 3}));
    }
    // Other test methods
}

package com.coherentsolutions;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringManipulatorTest {
    @Test
    public void testReverse() {
        StringManipulator sm = new StringManipulator();
        assertEquals("tac", sm.reverse("cat"));
    }
    // Other test methods
}

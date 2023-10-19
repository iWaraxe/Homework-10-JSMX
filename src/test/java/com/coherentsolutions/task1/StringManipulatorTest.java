package com.coherentsolutions.task1;

import com.coherentsolutions.task1.StringManipulator;
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

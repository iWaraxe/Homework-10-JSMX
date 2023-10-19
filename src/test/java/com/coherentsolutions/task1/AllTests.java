package com.coherentsolutions;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CalculatorTest.class,
        StringManipulatorTest.class,
        ArrayUtilitiesTest.class
})
public class AllTests {
    // This class remains empty, used only as a holder for the above annotations
}

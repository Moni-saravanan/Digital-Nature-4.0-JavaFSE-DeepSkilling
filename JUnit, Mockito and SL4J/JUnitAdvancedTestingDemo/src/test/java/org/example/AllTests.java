package org.example;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        EvenCheckerTest.class,
        ExceptionThrowerTest.class,
        PerformanceTesterTest.class,
        OrderedTests.class
})
public class AllTests {
}

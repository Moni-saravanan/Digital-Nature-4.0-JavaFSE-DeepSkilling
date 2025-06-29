package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class PerformanceTesterTest {

    @Test
    @Timeout(value = 1, unit = TimeUnit.SECONDS)
    void testPerformTaskTimeout() throws InterruptedException {
        PerformanceTester tester = new PerformanceTester();
        tester.performTask();  // This should not exceed 1 second
    }
}

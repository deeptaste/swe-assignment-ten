package edu.miu;

import edu.miu.component.test.ArrayReverserTestCases;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Main {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(ArrayReverserTestCases.class);

        System.out.println("Total number of tests: " + result.getRunCount());
        System.out.println("Total number of tests failed: " + result.getFailureCount());
        System.out.println("Total number of tests ignored: " + result.getIgnoreCount());
        System.out.println("Total number of tests successful: " + (result.getRunCount() - result.getFailureCount() - result.getIgnoreCount()));
        System.out.println("Total execution time: " + result.getRunTime() + " ms");
    }
}

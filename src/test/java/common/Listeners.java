package common;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    // This class implements ITestListener to listen to test events.
    // You can override methods from ITestListener to perform actions on test start, success, failure, etc.
    // For example, you can log messages, take screenshots, or send notifications.

    // Example method to handle test start
//    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test started: " + result.getName());
    }

    // Example method to handle test success
//    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed: " + result.getName());
    }

    // Example method to handle test failure
//    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed: " + result.getName());
    }

    // You can add more methods as needed for other events like skipped tests, configuration failures, etc.
}

package Wrapper;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import rok.qa.Utilities.BaseClass;

public class Asert extends BaseClass {

	public static void assertEquals(Object actual, Object expected, String message) {
        try {
            Assert.assertEquals(actual, expected, message);
        } catch (AssertionError e) {
            handleAssertionFailure(e, message);
        }
    }

    public static void assertTrue(boolean condition, String message) {
        try {
            Assert.assertTrue(condition, message);
        } catch (AssertionError e) {
            handleAssertionFailure(e, message);
        }
    }

    public static void assertFalse(boolean condition, String message) {
        try {
            Assert.assertFalse(condition, message);
        } catch (AssertionError e) {
            handleAssertionFailure(e, message);
        }
    }

    private static void handleAssertionFailure(AssertionError e, String message) {
        System.out.println("Assertion Failed: " + message);
        throw e;
    }


}

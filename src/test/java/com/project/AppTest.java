package com.project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void testLogin1() {
        App myApp = new App();
        int result = myApp.userLogin("abc", "abc123");

        System.out.println("testLogin1 -> Username: abc, Password: abc123");
        System.out.println("Expected Result: 0, Actual Result: " + result);

        Assert.assertEquals(result, 0);
    }

    @Test
    public void testLogin2() {
        App myApp = new App();
        int result = myApp.userLogin("abc", "abc@123");

        System.out.println("testLogin2 -> Username: abc, Password: abc@123");
        System.out.println("Expected Result: 1, Actual Result: " + result);

        Assert.assertEquals(result, 1);
    }

    @Test
    public void testLogin3() {
        App myApp = new App();
        int result = myApp.userLogin("abc", "abc@123");

        System.out.println("testLogin3 -> Username: abc, Password: abc@123");
        System.out.println("Expected Result: 1, Actual Result: " + result);

        Assert.assertEquals(result, 1);
    }
}

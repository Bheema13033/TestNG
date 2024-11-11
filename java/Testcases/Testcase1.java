package Testcases;

import org.testng.annotations.Test;

public class Testcase1 {
    @Test(priority = 1)
    void Setup() {
        System.out.println("opening browser");
    }

    @Test(priority = 2)
    void Login() {
        System.out.println("enter url");
    }

    @Test(priority = 3)
    void TearDOwn() {
        System.out.println("close");
    }
}

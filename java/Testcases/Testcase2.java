package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase2 {
    @Test(priority = 1)
    void Setup() {
        System.out.println("opening browser");
    }

    @Test(priority = 2)
    void SearchCustomer() {
        System.out.println("customers");
    }

    @Test(priority = 3)
    void AddCustomer() {
        System.out.println("customer added");

    }

    @Test(priority = 4)
    void Login() {
        System.out.println("enter url");
    }
}

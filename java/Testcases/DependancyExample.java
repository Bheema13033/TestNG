package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependancyExample {
    @Test
    void StartCar()
    {
        System.out.println("car is started");
    }
    @Test(dependsOnMethods = {"StartCar"})
    void cardrive()
    {
        System.out.println("car is driving");
    }
    @Test(dependsOnMethods = {"cardrive"})
    void Stopcar()
    {
        System.out.println("car is stopped");
    }
    @Test(dependsOnMethods = {"Stopcar"})
    void park()
    {
        System.out.println("car is paking");
    }
}

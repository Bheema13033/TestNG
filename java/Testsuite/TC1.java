package Testsuite;

import org.testng.annotations.*;

public class TC1 {
    @BeforeClass
    void beforeclass(){
        System.out.println("before class");
    }
    @AfterClass
    void afterclass(){
        System.out.println("after class");
    }
    @BeforeMethod
    void beforemetod(){
        System.out.println("before method");
    }
    @AfterMethod
    void aftermethod(){
        System.out.println("after method");
    }
    @Test
    void test1(){
        System.out.println("its test1");
    }
    @Test
    void test2(){
        System.out.println("its test2");
    }
@BeforeTest

void beforetest(){
    System.out.println("its wil execute before test");
}
@AfterTest
    void aftertest(){
        System.out.println("it will execute after test");
    }
}

package Testsuite;

import org.testng.annotations.*;

public class TC2 {

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
    void test3(){
        System.out.println("its test3");
    }
    @Test
    void test4(){
        System.out.println("its test4");
    }

@BeforeSuite
    void beforetestcuite(){
        System.out.println("its before testsuite");
    }
    @AfterSuite
    void aftertestsuite(){
        System.out.println("its after testsuite");
    }
}

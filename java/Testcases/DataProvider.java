package Testcases;

import org.testng.annotations.Test;

public class DataProvider {
    @Test(dataProvider = "LogindataProvider")
    public void loginTest(String email,String pwd){
        System.out.println(email+"  "+pwd);
    }
   @org.testng.annotations.DataProvider(name="LogindataProvider")
    public Object[][] getData()
    {
        Object[][] data={{"abc@gmail.com","abc"},{"xyz@gmail.com","xyz"},{"jkl@gmail.com","jkl"}};
        return data;
    }
}

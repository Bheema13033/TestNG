package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Login {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.navigate().to("https://www.facebook.com/");
        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("7829057072");
        driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("Auc@16109");
        driver.findElement(By.name("login")).click();
       WebElement upload= driver.findElement(By.xpath("//span[contains(text(),'Upload Image')]"));
       upload.sendKeys("C:\\Users\\Qapitol\\Desktop\\download.PNG");
        driver.close();

    }
}

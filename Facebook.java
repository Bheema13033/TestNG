package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.time.Duration;

public class Facebook {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.navigate().to("https://www.facebook.com/r.php");
        driver.findElement(By.name("firstname")).sendKeys("Bheema");
        driver.findElement(By.name("lastname")).sendKeys("nayak");

        WebElement Elementday =driver.findElement(By.xpath("//select[@name=\"birthday_day\"]"));

        Select s1=new Select(Elementday);
        s1.selectByValue("10");
        WebElement Elementmonth =driver.findElement(By.xpath("//select[@name=\"birthday_month\"]"));

        Select s2=new Select(Elementmonth);
        s2.selectByVisibleText("Apr");
        WebElement Elementyear =driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
        Select s3=new Select(Elementyear);
        s3.selectByValue("1996");
        WebElement radio=driver.findElement(By.xpath("//input[@value=\"2\"]"));

        radio.click();
        driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("tbheema102@gmail.com");
        driver.findElement(By.xpath("//input[@name=\"reg_passwd__\"]")).sendKeys("Auc@16109");
        driver.findElement(By.xpath("//button[@class=\"_6j mvm _6wk _6wl _58mi _3ma _6o _6v\"]")).click();



    }
}

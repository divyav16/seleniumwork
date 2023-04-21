package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDemo1 {
    public static void main(String[] args) {

      WebDriverManager.chromedriver().setup();
      WebDriver driver =new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demo.nopcommerce.com/registerresult/1?returnUrl=/");

      driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
      driver.findElement(By.id("gender-female")).click();
      driver.findElement(By.id("FirstName")).sendKeys("Divya");
      driver.findElement(By.name("LastName")).sendKeys("Vandra");
      driver.findElement(By.className("valid")).sendKeys("26");
      driver.findElement(By.name("DateOfBirthMonth")).sendKeys("July");
      driver.findElement(By.name("DateOfBirthYear")).sendKeys("1985");
      driver.findElement(By.id("Email")).sendKeys("divyavandra11@gmail.com");
      driver.findElement(By.id("Company")).sendKeys("Hello");
      driver.findElement(By.id("Password")).sendKeys("swaminarayana");
      driver.findElement(By.id("ConfirmPassword")).sendKeys("swaminarayana");
      try {
        Thread.sleep(10000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }

      driver.findElement(By.linkText("Register")).click();


      driver.close();



    }
}
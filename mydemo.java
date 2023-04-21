package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mydemo {

    public static void main(String[] args) {

        //1.set your path by dependancy.
        WebDriverManager.chromedriver().setup();
        //2.instance
        WebDriver driver = new ChromeDriver();
        //3.get url
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"gender-female\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("divya");
        driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("vandra");
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("23");
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("july");
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1985");
        driver.findElement(By.xpath("//*[@id=\"Company\"]")).sendKeys("Hello");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[3]/div[2]/div/label")).click();
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("saibaba86");
        driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("saibaba86");
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();


        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("divyavandra1@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("saibaba86");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
        //button[@class='button-1 search-box-button']
        driver.close();



    }

}

package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class k_DropDown extends l_Utils{
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.className("ico-register")).click();

//        1.
//        driver.findElement(By.name("DateOfBirthDay")).sendKeys("40");
//        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("May");
//        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1985");

//        2.
        WebElement Day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement Month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement Year = driver.findElement(By.name("DateOfBirthYear"));

//        Day.sendKeys("12");
//        Month.sendKeys("March");
//        Year.sendKeys("1986");

//        Select select = new Select(Day);
//        select.selectByIndex(19);
//        Select select1 = new Select(Month);
//        select1.selectByVisibleText("June");
//        Select select2 = new Select(Year);
//        select2.selectByValue("1985");



//        3. Generic Method - Reusable method which can be used with different date.
          selectValueFromDropDown(Day,"25");
          selectValueFromDropDown(Month,"March");
          selectValueFromDropDown(Year,"1987");






    }


}

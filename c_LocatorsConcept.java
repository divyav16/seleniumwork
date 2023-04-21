package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c_LocatorsConcept {
/*
- Everything is Web elements on the page
- To interact with each element, Automation Script require locators.
- There are 8 locators available in selenium

1. ID
2. ClassName(Class)
3. Xpath
4. CSS Selector
5. LinkText
6. Partial Link Text
7. TagName
8. Full Path
9. name
 */

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");


        driver.findElement(By.linkText("Register")).click();

        driver.findElement(By.id("FirstName")).sendKeys("Tester");
    }

}

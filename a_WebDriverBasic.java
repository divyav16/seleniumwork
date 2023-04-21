package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a_WebDriverBasic {

    public static void main(String[] args) {

//        2. Set up the chromedriver - Path
        System.setProperty("webdriver.chrome.driver","C:\\Software\\Driver\\chromedriver.exe");
//        1. Create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        3. Navigate to the Webpage
        driver.get("https://demo.nopcommerce.com/");
//        4. Get Page Title
//        i.
//        String PageTitle=driver.getTitle();
//        System.out.println("Page Title is:"+PageTitle);
//        ii.
//        System.out.println("Page Title is:"+driver.getTitle());
//        5.Expected vs Actual - Validation
        String ExpectedPageTitle ="nopCommerce demo store";
        if(ExpectedPageTitle.equals(driver.getTitle())  ){
            System.out.println("Page title is correct");
        }else{
            System.out.println("Page title is incorrect");
        }
//        6.Navigation
        driver.findElement(By.className("ico-login")).click();
//        7.Navigate Back
        driver.navigate().back();
//        8.Navigate Forward
        driver.navigate().forward();
//        9. Maximize the window
        driver.manage().window().maximize();
//        10. Refresh the page
        driver.navigate().refresh();
//        11. Get Current Url
        System.out.println("Current Url is: "+driver.getCurrentUrl());
//        12. Close the browser
        driver.close();
//        driver.quit();




    }
}

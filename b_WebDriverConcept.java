package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class b_WebDriverConcept {
    public static void main(String[] args) {
        /*
        In the market there is utility library to launch a browser without any executable file.
        To Overcome setting up driver path - There is an  API bonigarcia
        API saying use me I will do everything for you.
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");



    }
}

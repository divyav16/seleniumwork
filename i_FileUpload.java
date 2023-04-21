package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class i_FileUpload {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("http://cgi-lib.berkeley.edu/ex/fup.html");

        Thread.sleep(1000);
        driver.findElement(By.name("upfile")).sendKeys("C:\\Testing\\error.png");
        Thread.sleep(1000);
        driver.close();
    }
}

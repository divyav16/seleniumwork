package SeleniumLearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class h_AlertHandling {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");


        driver.findElement(By.xpath("//*[@id=\"small-search-box-form\"]/button")).click();

        Alert alert = driver.switchTo().alert();


        System.out.println("Alert Text:"+alert.getText());

        alert.accept();
//        alert.dismiss();

        driver.close();

    }
}

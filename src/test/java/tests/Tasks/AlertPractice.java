package tests.Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        WebElement alert1 = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        alert1.click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
    }
}

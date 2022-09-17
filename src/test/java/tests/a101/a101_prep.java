package tests.a101;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class a101_prep {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.a101.com.tr/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement popup = driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]"));
       // WebElement popup2 = driver.findElement(By.className("closePopupPersona"));

        Thread.sleep(2000);
        if (popup.isDisplayed()) {
            popup.click();
        }
        /*Thread.sleep(2000);
        if (popup2.isDisplayed()) {
            popup2.click();
        }*/

        WebElement giyimtop = driver.findElement(By.xpath("/html/body/section/section[1]/div/div/div/div[1]/div/div/ul/li[4]/a"));
        giyimtop.click();
        WebElement giyim = driver.findElement(By.xpath("//a[.='Dizaltı Çorap']"));
        giyim.click();
    }
}

package tests.a101;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class test {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        driver.get("https://www.a101.com.tr/");

        WebElement popup2 = driver.findElement(By.xpath("//*[@id=\"CybotCookiebotDialog\"]  "));
       // WebElement popupCookie = driver.findElement(By.xpath("//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']"));
        if (popup2.isDisplayed()){
            popup2.click();
       //     popupCookie.click();
        }


        Thread.sleep(5000);

        WebElement giyim = driver.findElement(By.xpath("//a[@href=\'/giyim-aksesuar/\']"));
        giyim.click();

        WebElement woman = driver.findElement(By.xpath("/html/body/section/section[4]/div[3]/div[2]/div/div[1]/div[1]/div[1]/ul/li[6]/a"));
        woman.click();

    }
}

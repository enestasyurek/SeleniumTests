package tests.Tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task5_3 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cydeo.com/radio_buttons");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        uti.findBtn(driver, "sport", "basketball");
        //C #3: Utility method task for (continuation of Task2)
        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/radio_buttons
        //3. Click to “Hockey” radio button
        //4. Verify “Hockey” radio button is selected after clicking.
    }
}

class uti{
    public static void findBtn(WebDriver driver,String attName, String attId){
        List<WebElement> listOfRadio = driver.findElements(By.name("sport"));

        for (WebElement radio : listOfRadio) {
            String Id = radio.getAttribute("id");
            if (Id.equals(attId)){
                radio.click();
                System.out.println(radio.getAttribute("id") +".isSelected() = " + radio.isSelected());
                break;
            }
        }
    }
}
//Create a utility method to handle above logic.
//Method name: clickAndVerifyRadioButton
//Return type: void or boolean
//Method args:
//1. WebDriver
//2. Name attribute as String (for providing which group of radio buttons)
//3. Id attribute as String (for providing which radio button to be clicked)
//
//Method should loop through the given group of radio buttons. When it finds the
//matching option, it should click and verify option is Selected.
//Print out verification: true
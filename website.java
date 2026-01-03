// 2. Program to check if website landed successfully using Title (PASS / FAIL)

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleCheck {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://automationpanda.com/");

        String expectedTitle = "Automation Panda";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)) {
            System.out.println("PASS: Website landed successfully");
        } else {
            System.out.println("FAIL: Website not landed correctly");
        }

        driver.quit();
    }
}

//Output : PASS: Website landed successfully
// Reason: The page title of https://automationpanda.com/ contains "Automation Panda", so the condition evaluates to true.

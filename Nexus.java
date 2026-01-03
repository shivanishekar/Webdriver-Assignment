// 3.Program to check whether page contains "Nexus 6" using Page Source

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSourceCheck {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.demoblaze.com/");

        String pageSource = driver.getPageSource();

        if(pageSource.contains("Nexus 6")) {
            System.out.println("PASS: Nexus 6 is present on the page");
        } else {
            System.out.println("FAIL: Nexus 6 is not present on the page");
        }

        driver.quit();
    }
}
//Output : PASS: Nexus 6 is present on the page
//Reason:
//The Demoblaze homepage contains the product name "Nexus 6" in its page source, so the condition evaluates to true.

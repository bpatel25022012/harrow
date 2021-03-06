package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxTesting {

    public static void main(String[] args) {// do it by heart
        // to open the url with

        String baseUrl = "https://www.harrow.gov.uk/";
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe" );
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize(); // maximize the window
        driver.get(baseUrl);
        String title = driver.getTitle(); // get the page
        System.out.println("Main page " + title);
        driver.quit();

    }
}

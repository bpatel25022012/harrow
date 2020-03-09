package browsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTesting {

    public static void main(String[] args) {

        String baseUrl = "https://www.harrow.gov.uk/";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();// to maximize the windows
        driver.get(baseUrl);
        String title = driver.getTitle(); // get the page
        System.out.println("Main page " + title);
        driver.quit();
    }
}
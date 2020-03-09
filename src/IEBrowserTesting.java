import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserTesting {

    public static void main(String[] args) {

        String baseUrl = "https://www.harrow.gov.uk/";
        System.setProperty("webdriver.ie.driver","driver/IEDriverServer.exe" );
        WebDriver driver = new InternetExplorerDriver();
        driver.manage().window().maximize(); // maximize the window
        driver.get(baseUrl);
        String title = driver.getTitle(); // get the page
        System.out.println("Main page " + title);
        driver.quit();

    }
}

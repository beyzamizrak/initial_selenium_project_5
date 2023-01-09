import com.sun.xml.internal.ws.api.server.WebServiceContextDelegate;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/beyzamizrak/IdeaProjects/initial_selenium_project_5/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.manage().window().fullscreen();


        String title = driver.getTitle();

        System.out.println(title);

        driver.quit();

        driver.get("https://www.techglobalschool.com/");




    }
}

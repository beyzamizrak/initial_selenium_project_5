import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_URL_and_Title_Validation {
    public static void main(String[] args) throws InterruptedException {

        // 1. Set up
        System.setProperty("webdriver.chrome.driver", "/Users/beyzamizrak/IdeaProjects/initial_selenium_project_5/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Validation

        driver.get("https://www.techglobalschool.com/"); // no cashes

       if(driver.getTitle().equals("SDET Bootcamp | TechGlobal")) System.out.println("Title validation PASSED");
       else System.out.println("Title validation FAILED");

       if(driver.getCurrentUrl().equals("https://www.techglobalschool.com/")) System.out.println("URL validation PASSED");
        else System.out.println("URL validation FAILED");









        //3. Teardown

        Thread.sleep(2000);

        driver.quit();

    }
}

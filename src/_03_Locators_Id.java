import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_Locators_Id {
    public static void main(String[] args) throws InterruptedException {


        /*
Go to https://techglobal-training.netlify.app/
Validate the company logo is displayed
 */

        // 1. set up
        System.setProperty("webdriver.chrome.driver", "/Users/beyzamizrak/IdeaProjects/initial_selenium_project_5/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. validation - action
        driver.get("https://techglobal-training.netlify.app/");

        //Thread.sleep(2000);

        // Locate the logo and verify if it is displayed

        WebElement logo = driver.findElement(By.id("logo"));

       if(logo.isDisplayed()) System.out.println("logo validation PASSED");
       else System.out.println("logo validation FAILED");

       System.out.println(logo.isEnabled()); // true
         System.out.println(logo.isSelected()); // false


        // 3. teardown - after actions
        driver.quit();



    }
}

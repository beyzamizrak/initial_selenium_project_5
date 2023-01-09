import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.Waiter;

public class _04_Locators_ClassName_Name {
    public static void main(String[] args) {

        /*
TEST CASE
Go to https://techglobal-training.netlify.app/
Select "Frontend Testing" from the "Practices" dropdown
Select the "Locators" card
Validate the "Kiwi", "Orange" and "Grapes" items are displayed
 */
        // set up using Driver class
        WebDriver driver = Driver.getDriver();

        // action
       try{
           driver.get("https://techglobal-training.netlify.app/");
           Waiter.pause(2);

           driver.findElement(By.id("dropdown-button")).click();
           Waiter.pause(3);

           driver.findElement(By.id("frontend-option")).click();
           Waiter.pause(2);

           driver.findElement(By.id("card-1")).click();
           Waiter.pause(2);

           System.out.println(driver.findElement(By.id("item_kiwi")).isDisplayed());
           System.out.println(driver.findElement(By.name("item_orange")).isDisplayed());
           System.out.println(driver.findElement(By.className("item_grapes")).isDisplayed());






       }
       catch (Exception e){
           System.out.println("TEST FAILED due to: " + e.getMessage());
       }
       finally {
           //
           Driver.quitDriver();
       }









    }
}

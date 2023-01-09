import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.TechGlobalUtil;
import utils.Waiter;

public class _05_Locators_tagName {
    public static void main(String[] args) {
/*
        TEST CASE
        Go to https://techglobal-training.netlify.app/
        Select "Frontend Testing" from the "Practices" dropdown
        Select the "Locators" card
        Validate the "Locators" header

        make sure the header is displayed make sure the text us exactly "Locators"
            */


try {
    // 1 . set up
    WebDriver driver = Driver.getDriver();

    // 2. action
    TechGlobalUtil.getFrontendTesting();

    driver.findElement(By.id("card-1")).click();
    Waiter.pause(2);

    WebElement heading = driver.findElement(By.id("main_heading"));

    if(heading.isDisplayed()) System.out.println("Heading displayed PASSED");
    else System.out.println("Heading displayed FAILED");

    if(heading.getText().equals("Locators")) System.out.println("Heading text PASSED");
    else System.out.println("Heading text FAILED");



}
catch (Exception e){
    System.out.println();
}
finally {
    Driver.quitDriver();
}





    }
}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.TechGlobalUtil;

import java.util.Date;
import java.util.List;

public class Assignment03_TechGlobalTraining {
    public static void main(String[] args) {

        /*
TEST CASE 1
Go to https://techglobal-training.netlify.app/
Select "Frontend Testing" from the "Practices" dropdown
Select the "Xpath-CSS Locators" card
Validate the Programming Languages list items below
Java
JavaScript
C#
 */

        WebDriver driver = Driver.getDriver();

        driver.get("https://techglobal-training.netlify.app/");

        TechGlobalUtil.getFrontendTesting();

        TechGlobalUtil.clickOnCard(2);

        List<WebElement> progLanguages = driver.findElements(By.xpath("((//ul)[1]//li//ul)[1]//li"));

        System.out.println("-------Programming Languages-----------");
        for (WebElement progLanguage : progLanguages) {
            System.out.println(progLanguage.getText());
        }

/*
TEST CASE 2
Go to https://techglobal-training.netlify.app/
Select "Frontend Testing" from the "Practices" dropdown
Select the "Xpath-CSS Locators" card
Validate the Automation Tools list items below
Selenium WebDriver
WebDriverIO
Cypress
Playwright
 */

        List<WebElement> automationTools = driver.findElements(By.xpath("((//ul)[1]//li//ul)[2]//li"));
        System.out.println("-------Automation Tools-----------");
        for (WebElement automationTool : automationTools) {
            System.out.println(automationTool.getText());
        }

        Driver.quitDriver();
    }
}

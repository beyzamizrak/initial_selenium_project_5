import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class Exercise {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.techglobalschool.com/");

        WebElement firstNameInputText = driver.findElement(By.id("input_comp-khwayxk9"));
        WebElement lastNameInputText = driver.findElement(By.id("input_comp-khwaz4h2"));
        WebElement emailInputText = driver.findElement(By.id("input_comp-khwb0zsz"));

        firstNameInputText.sendKeys("John");
        lastNameInputText.sendKeys("Doe");
        emailInputText.sendKeys("john.doe@gmail.com");

        System.out.println(firstNameInputText.getAttribute("value")); //John
        System.out.println(lastNameInputText.getAttribute("value")); // Doe
        System.out.println(emailInputText.getAttribute("value")); // john.doe@gmail.com

        Driver.quitDriver();

    }
}

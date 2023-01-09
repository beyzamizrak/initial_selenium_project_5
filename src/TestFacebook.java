import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class TestFacebook {

    public static void main(String[] args) {

     try{
         WebDriver driver = Driver.getDriver();

         driver.get("https://www.facebook.com/");

         String titleOfFacebook = driver.getTitle();
         String urlFacebook = driver.getCurrentUrl();

         if(titleOfFacebook.equals("Facebook - log in or sign up")) System.out.println("Title validation PASSED");
         else System.out.println("Title validation FAILED");

         if(urlFacebook.equals("https://www.facebook.com/")) System.out.println("Url validation PASSED");
         else System.out.println("Url validation FAILED");

         WebElement facebookLogo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
         if(facebookLogo.isDisplayed()) System.out.println("Logo validation PASSED");
         else System.out.println("Logo validation FAILED");

         WebElement h2 = driver.findElement(By.tagName("h2"));
         if(h2.equals("Connect with friends and the world around you on Facebook.")) System.out.println("h2 validation PASSED");
         else System.out.println("h2 validation FAILED");

         WebElement emailOrPhoneNumber = driver.findElement(By.id("email"));
         if(emailOrPhoneNumber.isDisplayed()) System.out.println("emailBox validation PASSED");
         else System.out.println("emailBox validation FAILED");

         WebElement passwordBox = driver.findElement(By.id("pass"));
         if(passwordBox.isDisplayed()) System.out.println("password box validation PASSED");
         else System.out.println("password box validation FAILED");

         WebElement logIn = driver.findElement(By.xpath("//button[@name='login']"));
         if(logIn.isDisplayed()) System.out.println("login button validation PASSED");
         else System.out.println("login button validation FAILED");

         if(logIn.isEnabled()) System.out.println("login button is enabled PASSED");
         else System.out.println("login button is enabled FAILED");

         WebElement forgotPassword = driver.findElement(By.linkText("Forgot password?"));
         if(forgotPassword.isDisplayed()) System.out.println("forgot password link validation PASSED");
         else System.out.println("forgot password link validation FAILED");

         WebElement createNewAccount = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
         if(createNewAccount.isDisplayed()) System.out.println("create new account button validation PASSED");
         else System.out.println("create new account button validation FAILED");
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

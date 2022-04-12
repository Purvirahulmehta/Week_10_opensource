package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {
    public static void main(String[] args) {
        String baseUrl="https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        WebDriver driver= new FirefoxDriver();//creating the driver object
        driver.get(baseUrl);//opening the given url
        String currentUrl=driver.getCurrentUrl();//get current URL of given Url
        System.out.println("Current URL is:"+ currentUrl);
        String pageSource=driver.getPageSource();//getting page source from given url
        System.out.println("The page source is: " + pageSource);
        WebElement emailField=driver.findElement(By.name("txtUsername"));//entering Email to email field
        emailField.sendKeys("Admin");
        WebElement passwordField=driver.findElement(By.name("txtPassword"));//Entering Password to passwordfield
        passwordField.sendKeys("Admin123");
        driver.close();





    }
}

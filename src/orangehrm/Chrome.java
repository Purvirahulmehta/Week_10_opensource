package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //launch the URL
        driver.get(baseUrl);
        driver.manage().window().maximize();//maximise the windows
        //we give implict time to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        String title = driver.getTitle();//get the title of the wensite
        System.out.println("Title of the website: " + title);//it will print the whole msg in console
        //or sout(title);
        String currentUrl = driver.getCurrentUrl();//get the current Url
        System.out.println("Current Url: " + currentUrl);
        //you can replace the line no 21 and 22 with below code
        //System.out.println("Current URL = " driver.getCurrentUrl());
        String pageSource = driver.getPageSource();//get the pagesource from given URL
        System.out.println("Page source of the given URL: " + pageSource);
        //Entering Email to email field
        WebElement emailField = driver.findElement(By.name("txtUsername"));
        emailField.sendKeys("Admin");
        //Entering Password to password field
        WebElement passwordField = driver.findElement(By.name("txtPassword"));
        passwordField.sendKeys("admin123");
        driver.close();//closing the browser


    }

}

package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
    public static void main(String[] args) {
        String baseUrl= "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        //Launch the URL
        driver.get(baseUrl);
        //get the tittle of the URL
        String title=driver.getTitle();
        System.out.println(title);
        // System.out.println("Title of the webpage: " + title);
        //get the currentUrl
        String currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);
        //you can replace the line no 18,19  to below code
      // System.out.println("Title of the webpage"+ driver.getCurrentUrl());//getting and printing the
        String pageSource = driver.getPageSource();
        System.out.println(pageSource);
       // System.out.println("Page source of the given Url" + driver.getPageSource());replacement of line 22 and 23
        WebElement emailField= driver.findElement(By.name("txtUsername"));
        emailField.sendKeys("Admin");
        WebElement passwordField=driver.findElement(By.name("txtPassword"));
        passwordField.sendKeys("admin123");
        //driver.close();

    }
}

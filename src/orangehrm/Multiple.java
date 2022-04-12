package orangehrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the browser name(firefox=1,chrome=2,edge=3):");
        int a =scanner.nextInt();
        String baseUrl="https://opensource-demo.orangehrmlive.com/";
        if (a==1){
            System.out.println("firefox");
            System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
            WebDriver driver= new FirefoxDriver();
            driver.get(baseUrl);
        }else if (a==2){
            System.out.println("chrome");
            System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.get(baseUrl);
        }else {
            System.out.println("edge");
            System.setProperty("webdriver.edge.driver","driver/msedgedriver.exe");
            WebDriver driver= new EdgeDriver();
            driver.get(baseUrl);


        }

    }
}

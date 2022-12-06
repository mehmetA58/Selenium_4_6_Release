package firstTest;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.manager.SeleniumManager;


public class Selenium_Manager {
    public static void main(String[] args) throws InterruptedException {
        SeleniumManager.getInstance().getDriverPath("chromedriver");
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        driver.navigate().to("http://amazon.com");
        System.out.println(driver.getTitle());
        driver.navigate().back();
        System.out.println(driver.getTitle());
        driver.navigate().forward();
        System.out.println(driver.getTitle());
        driver.navigate().refresh();
        driver.close();
        driver.quit();

        SeleniumManager.getInstance().getDriverPath("IEDriverServer");
        InternetExplorerDriver driver1=new InternetExplorerDriver();
        driver1.get("http://google.com");
        System.out.println(driver1.getTitle());
        driver1.manage().window().maximize();
        driver1.navigate().to("http://amazon.com");
        System.out.println(driver1.getTitle());
        driver1.navigate().back();
        System.out.println(driver1.getTitle());
        driver1.navigate().forward();
        System.out.println(driver1.getTitle());
        driver1.navigate().refresh();
        driver1.quit();















        driver.quit();

    }
}

package firstTest;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class C01 {
    public static void main(String[] args) throws InterruptedException {
     
       WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com.tr");

    }
}

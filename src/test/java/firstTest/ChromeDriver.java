package firstTest;
import org.openqa.selenium.WebDriver;


public class ChromeDriver {
    public static void main(String[] args) throws InterruptedException {

       WebDriver driver=new org.openqa.selenium.chrome.ChromeDriver();


        driver.get("http://google.com");
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.navigate().to("http://amazon.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();

    }
}

package firstTest;
import org.openqa.selenium.WebDriver;



public class Chrome_Driver {
    public static void main(String[] args) throws InterruptedException {

       WebDriver driver=new org.openqa.selenium.chrome.ChromeDriver();


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
        driver.quit();

    }
}

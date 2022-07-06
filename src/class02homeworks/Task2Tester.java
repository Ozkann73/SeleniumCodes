package class02homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task2Tester {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Saban");
        driver.findElement(By.name("lastname")).sendKeys("Sabanoglu");
        driver.findElement(By.name("reg_email__")).sendKeys("sabanoglusaban@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sabanoglusaban@gmail.com");
       driver.findElement(By.id("password_step_input")).sendKeys("SabanogluSaban90");
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(2000);
        Thread.sleep(2000);
        driver.findElement(By.name("_8idr img")).click();





    }
}

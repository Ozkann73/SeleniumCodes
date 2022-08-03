package class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class UploadDocuments {
    public static String url = "https://the-internet.herokuapp.com/";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement fileUploadLink = driver.findElement(By.linkText("File Upload"));
        fileUploadLink.click();

        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys("C:\\Users\\okara\\OneDrive\\Desktop\\SdetBatch13.xlsx");

        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        uploadButton.click();


    }
}

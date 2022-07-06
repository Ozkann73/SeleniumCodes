package class02homeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        /*navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
        fill out the form
        click on register
        close the browser*/
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Roberto");
        driver.findElement(By.id("customer.lastName")).sendKeys("Carlos");
        driver.findElement(By.id("customer.address.street")).sendKeys("36166 Selenium Blvd ");
        driver.findElement(By.id("customer.address.city")).sendKeys("Fremont");
        driver.findElement(By.id("customer.address.state")).sendKeys("CA");
        driver.findElement(By.name("customer.address.zipCode")).sendKeys("95621");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("123456789");
        driver.findElement(By.id("customer.ssn")).sendKeys("897984651");
        driver.findElement(By.id("customer.username")).sendKeys("R.Carlos");
        driver.findElement(By.id("customer.password")).sendKeys("R_carlos2022");
        driver.findElement(By.id("repeatedPassword")).sendKeys("R_carlos2022");
        driver.findElement(By.linkText("Register")).click();
        driver.quit();





    }
}

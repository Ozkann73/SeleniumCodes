package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvencedWindowHandling {
    public static String url = "https://syntaxprojects.com/window-popup-modal-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainpageHandele =driver.getWindowHandle();
        System.out.println(mainpageHandele);

        WebElement igButton = driver.findElement(By.linkText("Follow On Instagram"));
        WebElement fbButton = driver.findElement(By.linkText("Like us On Facebook"));
        WebElement igAndFbButton = driver.findElement(By.linkText("Follow Instagram & Facebook"));
        igButton.click();
        fbButton.click();
        igAndFbButton.click();
        Set<String>allWindowHandles=  driver.getWindowHandles();
        System.out.println(allWindowHandles.size());
        Iterator<String>iterator = allWindowHandles.iterator();
        while (iterator.hasNext()){ // start iterating through the handles
            String handle = iterator.next(); // get one handle
            if (!mainpageHandele.equals(handle)){// set condition where main page is not equal to the handle
            driver.switchTo().window(handle);// switch to that specific handle

            String title = driver.getTitle();// get the title
            System.out.println(title);
            driver.close(); // close the tab
            }

        }
        driver.switchTo().window(mainpageHandele);
        igButton.click();


    }
}

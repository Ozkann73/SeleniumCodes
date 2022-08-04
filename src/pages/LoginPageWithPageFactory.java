package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class LoginPageWithPageFactory extends CommonMethods {
    @FindBy(id="txtUsername")
    public WebElement username;

    @FindBy(xpath = "//input[@name=''txtpassword']")
    public WebElement password;

    @FindBy(css="input#btnLogin")
    public WebElement loginButton;

  /*  @FindBy(css="input#btnLogin")
    public List<WebElement> multipleElements;
*/

    public LoginPageWithPageFactory() {
        PageFactory.initElements(driver,this);
    }
}

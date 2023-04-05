package Final.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    private final String URL = "http://training.skillo-bg.com:4200/users/login";


    @FindBy(css="a[href='/users/register']")
    WebElement registerBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

        public void clickRegisterBtn  () {
        clickElement(registerBtn);
    }

    public void verifyUrl() {
        verifyUrl(URL);
    }
}

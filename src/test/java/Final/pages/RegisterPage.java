
package Final.pages;

        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends BasePage {

    private final String URL = "http://training.skillo-bg.com/users/register";

    @FindBy(xpath = "//h4[text()='Sign up']")
    WebElement signUpHeader;

    @FindBy(name = "username")
    WebElement usernameField;

    @FindBy(css = "input[formcontrolname='email']")
    WebElement emailField;

    @FindBy(name = "password")
    WebElement passwordField;


    @FindBy(name = "verify-password")
    WebElement confirmPasswordField;

    @FindBy(id = "sign-in-button")
    WebElement signInBtn;

    @FindBy(id = "toast-container")
    WebElement toastMsg;
    public RegisterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }


    public void navigate() {
        driver.get(URL);
    }

    public void enterUsername(String username) {
        enterText(usernameField, username);
    }

    public void enterEmail(String email) {
        enterText(emailField, email);
    }
    public void enterPassword(String password) {
        enterText(passwordField, password);
    }
    public void confirmPassword(String password) {
        enterText(confirmPasswordField, password);
    }
    public void clickSignIn() {
        clickElement(signInBtn);
    }
    public String getSignUpHeaderText() {
        return getElementText(signUpHeader);
    }

    public void verifyUrl() {
        verifyUrl(URL);
    }
     public String getToastMsgText() {
         return getElementText(toastMsg);
     }
}

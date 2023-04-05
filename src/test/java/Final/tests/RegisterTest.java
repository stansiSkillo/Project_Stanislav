package Final.tests;


import Final.pages.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class RegisterTest extends BaseTest {


    @DataProvider(name = "user")
    public Object[][] getUsers() {
    return new Object[][]{
    {"danilo4", "danilo4@abv.bg", "09876543", "0987654366"},
   };
   }

    @Test (dataProvider = "user")
    public void RegisterTest (String username, String email, String password, String confirmPassword) {

        System.out.println("1. Go to register page");
        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.navigate();

       System.out.println("2. Is the correct register url opened?");
       RegisterPage registerPage1 = new RegisterPage(driver);
       registerPage1.verifyUrl();

       System.out.println("3. Is the Sign up header displayed?");
       String headerText = registerPage.getSignUpHeaderText();
       Assert.assertEquals(headerText, "Sign up", "Incorrect Sign up header text!");

        System.out.println("4. Enter username");
        registerPage.enterUsername(username);

        System.out.println("5. Enter email");
        registerPage.enterEmail(email);

        System.out.println("5. Enter password");
        registerPage.enterPassword(password);

        System.out.println("6. Confirm password");
        registerPage.confirmPassword(confirmPassword);

        System.out.println("7. Click Sign in button");
        registerPage.clickSignIn();

        System.out.println("8. Check that the message 'Registration failed' appeared");
        String toastContainerText = registerPage.getToastMsgText().trim();
        Assert.assertEquals(toastContainerText, "Registration failed!", "Incorrect Toast message text!");

        System.out.println("9. Check the url is the same (register)");
        registerPage1.verifyUrl();


    }


}

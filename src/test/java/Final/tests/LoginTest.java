package Final.tests;


import Final.pages.*;
import org.testng.Assert;
import org.testng.annotations.*;


public class LoginTest extends BaseTest{


           @Test
       public void loginTest () {

        System.out.println("1. Go to Home page");
        HomePage homePage = new HomePage(driver);
        homePage.navigate();

        System.out.println("2. Go to login");
        Header header = new Header(driver);
        header.goToLogin();

        System.out.println("3. Is the correct login url opened");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.verifyUrl();

        System.out.println("4. Click Register button");
        loginPage.clickRegisterBtn();

        System.out.println("5. Is the Sign up header displayed");
        RegisterPage registerPage = new RegisterPage (driver);
        String headerText = registerPage.getSignUpHeaderText();
        Assert.assertEquals(headerText, "Sign up", "Wrong Sign up header text!");


    }


}

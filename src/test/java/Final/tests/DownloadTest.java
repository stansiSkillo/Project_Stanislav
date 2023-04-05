package Final.tests;

import Final.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.awt.*;
import java.awt.event.KeyEvent;


public class DownloadTest extends BaseTest{
@Test
public void DownloadTest () throws InterruptedException, AWTException {

    System.out.println("1. Go to Home page");
    HomePage homePage = new HomePage(driver);
    homePage.navigate();

    System.out.println("2. Open the final post with a picture");
    WebElement Image =driver.findElement(By.cssSelector("div > img[src='https://i.imgur.com/dudb7OB.jpg']"));
    int width = Image.getSize().getWidth();
    Actions action= new Actions(driver);
    action.moveToElement(Image).moveByOffset((width/2)-2, 0).contextClick(Image).build().perform();

    Thread.sleep(3000);
    System.out.println("3. Save the picture in your default directory");
    Robot robot = new Robot();
    robot.keyPress(KeyEvent.VK_V);
    robot.keyPress(KeyEvent.VK_ENTER);

    }
}



package afs.uitests.LoginTests;

import afs.uitests.BaseTest;
import afs.uitests.PagesModel.BasePage;
import afs.uitests.PagesModel.HomePage;
import afs.uitests.PagesModel.LoginPage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import javax.swing.*;

import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElement;
import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElementLocated;

public class LoginTests extends BaseTest {

    public HomePage Login(String userName, String password, LoginPage page) {
        page.openPage();


        page.userName.sendKeys(userName);
        page.password.sendKeys(password);
        page.loginBtn.click();
        return new HomePage(driver);
    }

    LoginPage loginPage = new LoginPage(driver);

    @Test
    public void simpleLogin() {

        HomePage homePage = Login("admin", "admin", loginPage);
        assertThat(textToBePresentInElement(homePage.HomeButton, "Home"));


    }


}

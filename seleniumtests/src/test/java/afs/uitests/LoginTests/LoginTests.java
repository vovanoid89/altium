package afs.uitests.LoginTests;

import afs.uitests.BaseTest;
import afs.uitests.PagesModel.HomePage;
import afs.uitests.PagesModel.LoginPage;
import org.junit.Test;
import org.openqa.selenium.By;


import static org.openqa.selenium.support.ui.ExpectedConditions.textToBePresentInElement;

public class LoginTests extends BaseTest {

    public HomePage Login(String userName, String password, LoginPage page) {
        page.openPage();


        page.userName.sendKeys(userName);
        page.password.sendKeys(password);
        page.loginBtn.click();
        boolean m = assertThat(textToBePresentInElement(page.multipleLogin, "It looks that your account"));
        if (m == true) {
            page.startNewSession.click();
        } else {
            return new HomePage(driver);
        }
       // return new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
    @Test
    public void simpleLogin() {

        HomePage homePage = Login("admin", "admin", loginPage);
        assertThat(textToBePresentInElement(homePage.HomeButton, "Home"));

    }




package afs.uitests.PagesModel;

import afs.uitests.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {


    public LoginPage(WebDriver driver){
        super(driver);
    }

    public void openPage() {
        getWebDriver().get(BaseUrl + applicationPort);
    }



    @FindBy(id = "UserName")
    public WebElement userName;

    @FindBy(id = "Password")
    public WebElement password;

    @FindBy(css = ".btn.btn-default.btn-primary-vault")
    public WebElement loginBtn;





}

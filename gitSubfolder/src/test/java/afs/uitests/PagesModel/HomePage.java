package afs.uitests.PagesModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    public void openPage() {
        getWebDriver().get(BaseUrl + applicationPort + "/" + PagesAddress.home.applicationUrl);
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[1]/div/aside/div/ul/li[1]/a/span[2]")
    public WebElement HomeButton;


}

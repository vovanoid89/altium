package afs.uitests.PagesModel;

import afs.uitests.ConsiseApi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage extends ConsiseApi {

    private WebDriver driver;
    protected static String applicationPort = ":9780";
    private static String host = "nexus-server-tr";
    protected static String BaseUrl = "http://" + host;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public abstract void openPage();

    @Override
    public WebDriver getWebDriver() {
        return driver;
    }
}

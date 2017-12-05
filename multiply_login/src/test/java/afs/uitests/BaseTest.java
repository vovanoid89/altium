package afs.uitests;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest extends ConsiseApi {

    public static WebDriver driver;


    public BaseTest() {
        System.setProperty("webdriver.chrome.driver", "..\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        // page = new GooglePage(driver);
    }

    public boolean assertThat(ExpectedCondition<Boolean> condition) {
        (new WebDriverWait(getWebDriver(), 4)).until(condition);
        return false;
    }

    @Override
    public WebDriver getWebDriver() {
        return driver;
    }


    @AfterClass
    public static void tearDown() {
        driver.close();
    }

}

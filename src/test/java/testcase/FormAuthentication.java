package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FormAuthenticationPage;

import static support.Browsers.close;
import static support.Browsers.openBrowser;

public class FormAuthentication {

    @BeforeMethod
    public static void setUp() {
        openBrowser();
    }

    @Test
    public static void tc_01() {
        FormAuthenticationPage formPage = new FormAuthenticationPage();
        formPage.open();
        formPage.fillForm("tomsmith", "SuperSecretPassword!");
    }

    @AfterMethod
    public void tearDown() {
        close();
    }
}

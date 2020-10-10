package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormAuthenticationPage {
    private static WebDriver driver;
    private final By usernameTXT = By.id("username");
    private final By passwordTXT = By.id("password");
    private final By loginBTN = By.xpath("//button[@type='submit']");

    public void open() {
        driver.get("https://the-internet.herokuapp.com/login");
    }

    public void fillForm(String username, String password) {
        driver.findElement(usernameTXT).sendKeys(username);
        driver.findElement(passwordTXT).sendKeys(password);
        driver.findElement(loginBTN).click();
    }

}

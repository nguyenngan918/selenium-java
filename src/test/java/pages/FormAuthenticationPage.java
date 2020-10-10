package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormAuthenticationPage {
    private static WebDriver driver;

    private final By usernameTXT = By.id("username");
    private final By passwordTXT = By.id("password");
    private final By loginBTN = By.xpath("//button[@type='submit']");

    public static void open()
    {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
    }

    public static void fillFormAuthen()
    {
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

}

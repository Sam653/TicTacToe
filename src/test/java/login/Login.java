/*
package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Login {

    private WebDriver driver;

    // встановлення Chrome driver
    @BeforeSuite
    public void addDriver() {
        System.setProperty("webdriver.chrome.driver", "c://drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    // відкриття вікна на всю сторінку
    @BeforeTest
    public void profileSetup() {
        driver.manage().window().maximize();
    }

    // принт для перевірки
    @AfterTest
    public void afterCheck() {
        System.out.print("3) Log In works correctly!");
    }

    // закриття браузера після виконання тесту
    @AfterSuite
    public void quitDriver() {
        driver.quit();
    }

    @Test(priority = 0)
    public void loginForm() throws InterruptedException {

        // витягаю інфа для автозаповнювання з класу User
        User user = new User();

        // задаю сторінку. яку треба відкрити
        driver.navigate().to("https://trello.com/login");

        // пошук поля USERNAME
        WebElement userTextBox = driver.findElement(By.name("user"));
        userTextBox.sendKeys(user.getUserEmail());

        // пошук поля PASSWORD
        WebElement passTextBox = driver.findElement(By.name("password"));
        passTextBox.sendKeys(user.getUserPass());

        // пошук кнопки 'Log In'
        WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"login\"]"));
        loginButton.click();

        System.out.println("1) User has logged in!");

        // задаю делей, щоб провантажити сторінку
        Thread.sleep(5000);

        // наведення мишки на картинку юзера і відкриття меню
        WebElement userPicture = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/button[3]"));
        userPicture.click();

        // перевірка наявності імені юзера у меню
        WebElement userRole = driver.findElement(By.xpath("//*[@id=\"layer-manager-popover\"]/div/div[1]"));
        Assert.assertEquals(userRole.getText(), "Sam (sam98164378)", "Sam (sam98164378)");
        System.out.print("2) User has been determined as 'Sam'!");
    }
}*/

package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;

import java.time.Duration;

public class BaseSteps {

    public WebDriver driver;
    public LoginPage loginPage;


    @BeforeClass
    public void OpenChrome(){
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }


//    @AfterClass
//    public void ClosePag(){
//        driver.quit();
//    }
}

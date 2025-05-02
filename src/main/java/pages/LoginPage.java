package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

   public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
     private By LoginField =  By.xpath("//input[@name = 'username']");
     private By PasswordField = By.xpath("//input[@type = 'password']");
     private By LoginButton = By.xpath("//button[@type = 'submit']");

     //Actions

    public String WriteUserName(String Name){
        driver.findElement(LoginField).sendKeys(Name);
        return Name;
    }

    public String WritePassword(String Password){
        driver.findElement(PasswordField).sendKeys(Password);
        return Password;
    }

    public DashBoardPage ClickOnLoginButton(){
        driver.findElement(LoginButton).click();
        return new DashBoardPage(driver);
    }


}

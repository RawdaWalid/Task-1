package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {

    public WebDriver driver;

    public AdminPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    private By NumberOfRecords = By.xpath("(//span[@class = 'oxd-text oxd-text--span'])[1]");
    private By AddNewUserBtn= By.xpath("//button[@class= 'oxd-button oxd-button--medium oxd-button--secondary']");

    //Actions

    public String GetNumberOfRecords(){
        return driver.findElement(NumberOfRecords).getText();
    }

    public AddNewUserPage AddNewUser(){
        driver.findElement(AddNewUserBtn).click();
        return new AddNewUserPage(driver);
    }

}

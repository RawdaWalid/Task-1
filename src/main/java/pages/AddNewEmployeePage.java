package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddNewEmployeePage {
    public WebDriver driver;
    public AddNewEmployeePage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    By EmployeeFirstName = By.xpath("//input[@name = 'firstName']");
    By EmployeeMiddleName = By.xpath("//input[@name = 'middleName']");
    By EmployeeLastName = By.xpath("//input[@name = 'lastName']");
    By EmployeeID = By.xpath("(//input[@class= 'oxd-input oxd-input--active'])[1]");
    By SaveButton = By.xpath("//button[@type= 'submit']");

    //Actions
    public String AddEmployeeFirstName(String FirstName){
        driver.findElement(EmployeeFirstName).sendKeys(FirstName);
        return FirstName;
    }

    public String AddEmployeeMiddleName(String MiddleName){
        driver.findElement(EmployeeMiddleName).sendKeys(MiddleName);
        return MiddleName;
    }

    public String AddEmployeeLastName(String LastName){
        driver.findElement(EmployeeLastName).sendKeys(LastName);
        return LastName;
    }

    public String AddEmployeeID(String ID){
        driver.findElement(EmployeeID).sendKeys(ID);
        return ID;
    }

    public void ClickOnSaveButton(){
        driver.findElement(SaveButton).click();
    }



}

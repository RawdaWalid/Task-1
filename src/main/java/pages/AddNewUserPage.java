package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddNewUserPage {
   public WebDriver driver;

    public AddNewUserPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    //Password and confirm password should be the same ??
    By SelectUserRole = By.xpath("(//div[@tabindex = '0'])[1]");
    By SelectUserRoleAdmin = By.xpath("//*[contains(text(), 'Admin')]");
    By SelectStatus = By.xpath("(//div[@tabindex = '0'])[2]");
    By SelectEnabled = By.xpath("//*[contains(text(), 'Enabled')]");
    By PasswordNewUser = By.xpath("(//input[@type = 'password'])[1]");
    By EmployeeName = By.xpath("//input[@placeholder = 'Type for hints...']");
    By EmployeeOptionsSedoHussein = By.xpath("//div[@role = 'option']//*[text() = 'Sedo Hussein Walid']");
    By UserName = By.xpath("(//input[@autocomplete= 'off'])[1]");
    By ConfirmPassword = By.xpath("(//input[@type = 'password'])[2]");
    By SaveNewUserName =    By.xpath("//button[@type= 'submit']");


    //Actions
    public void ClickSelectUserRoleDropDown() {
     driver.findElement(SelectUserRole).click();
    }

    public void ChooseAdminAndClick(){
     driver.findElement(SelectUserRoleAdmin).click();
    }

    public void ClickSelectStatusDropDown(){
     driver.findElement(SelectStatus).click();
    }

    public void ChooseEnabled(){
     driver.findElement(SelectEnabled).click();
    }

    public String WriteNewPassword(String Password) {
     driver.findElement(PasswordNewUser).sendKeys(Password);
     return Password;
    }

    public void ClickOnEmployeeNameField(){
     driver.findElement(EmployeeName).click();
    }

    public String AddEmployeeName(String employeename){
     driver.findElement(EmployeeName).sendKeys(employeename);
     return employeename;
    }

    public String GetEmployeeNameOptions(){
     return driver.findElement(EmployeeOptionsSedoHussein).getText();
    }

    public void ClickEmployeeNameOptions(){
    driver.findElement(EmployeeOptionsSedoHussein).click();
 }

    public String AddUserName(String username) {
     driver.findElement(UserName).sendKeys(username);
     return username;
    }

     public String ConfirmPassword(String confirmpassword) {
     driver.findElement(ConfirmPassword).sendKeys(confirmpassword);
     return confirmpassword;
    }

     public void ClickSaveNewUserName(){
     driver.findElement(SaveNewUserName).click();
    }






}

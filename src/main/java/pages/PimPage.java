package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PimPage {

    public WebDriver driver;

    public PimPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators
    By AddButtonPimPage = By.xpath("//*[contains(text(), 'Add')]");

    //Actions

    public AddNewEmployeePage AddNewEmployee(){
        driver.findElement(AddButtonPimPage).click();
        return new AddNewEmployeePage(driver);
    }


}

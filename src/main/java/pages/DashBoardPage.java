package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage {

   public WebDriver driver;

    public DashBoardPage(WebDriver driver) {
        this.driver = driver;
    }

    //Locators

    private By AdminSideListButton = By.xpath("//a[@href = '/web/index.php/admin/viewAdminModule']");
    private By PimSideListButton = By.xpath("//a[@href= '/web/index.php/pim/viewPimModule']");

    //Actions

    public AdminPage ClickOnAdminButton(){
        driver.findElement(AdminSideListButton).click();
        return new AdminPage(driver);
    }

    public PimPage ClickOnPimButton(){
        driver.findElement(PimSideListButton).click();
        return new PimPage(driver);
    }
}

package test;

import base.BaseSteps;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class TestCases extends BaseSteps {
//       WebDriver driver;
//       LoginPage loginPage = new LoginPage(driver);
//       DashBoardPage dashBoardPage;
//       AdminPage adminPage;

    @Test
    public void LoginToAdmin() throws InterruptedException {
        loginPage.WriteUserName("Admin");
        loginPage.WritePassword("admin123");
        loginPage.ClickOnLoginButton();
        DashBoardPage dashBoardPage = new DashBoardPage(driver);
        Thread.sleep(5000);
        dashBoardPage.ClickOnPimButton();
        PimPage pimpage = new PimPage(driver);
        pimpage.AddNewEmployee();
        AddNewEmployeePage addNewEmployeePage = new AddNewEmployeePage(driver);
        String FirstName = addNewEmployeePage.AddEmployeeFirstName("Sedo");
        String MiddleName = addNewEmployeePage.AddEmployeeMiddleName("Hussein");
        String LastName = addNewEmployeePage.AddEmployeeLastName("Walid");
        addNewEmployeePage.AddEmployeeID("123456712");
        addNewEmployeePage.ClickOnSaveButton();
        dashBoardPage.ClickOnAdminButton();
        AdminPage adminPage = new AdminPage(driver);
        String NumberOfRecords = adminPage.GetNumberOfRecords();
        System.out.println("The number of records = " + NumberOfRecords);
        String numberOnly = NumberOfRecords.replaceAll("[^0-9]", "");
        int NumberOfRecordsint =Integer.parseInt(numberOnly);
        System.out.println("The number of records = " + NumberOfRecordsint);
        adminPage.AddNewUser();
        AddNewUserPage addNewUserPage = new AddNewUserPage(driver);
        addNewUserPage.ClickSelectUserRoleDropDown();
        addNewUserPage.ChooseAdminAndClick();
        addNewUserPage.ClickSelectStatusDropDown();
        addNewUserPage.ChooseEnabled();
        addNewUserPage.WriteNewPassword("Rawda@0152243903");
        addNewUserPage.ClickOnEmployeeNameField();
        addNewUserPage.AddEmployeeName(FirstName + " " + MiddleName + " " + LastName);
        Thread.sleep(5000);
        String AssertNameOption = addNewUserPage.GetEmployeeNameOptions();
        System.out.println(AssertNameOption);
        addNewUserPage.ClickEmployeeNameOptions();
        addNewUserPage.AddUserName("SedoRawda");
        addNewUserPage.ConfirmPassword("Rawda@0152243903");
        Thread.sleep(5000);
        addNewUserPage.ClickSaveNewUserName();
        dashBoardPage.ClickOnAdminButton();
        String NumberOfRecords2 = adminPage.GetNumberOfRecords();
        System.out.println("The number of records = " + NumberOfRecords);
        String numberOnlyNumberOfRecords2 = NumberOfRecords.replaceAll("[^0-9]", "");
        int NumberOfRecords2int =Integer.parseInt(numberOnlyNumberOfRecords2);
        System.out.println("The number of records = " + NumberOfRecords2int);
        Assert.assertNotEquals(NumberOfRecords2int, NumberOfRecordsint);


    }
}

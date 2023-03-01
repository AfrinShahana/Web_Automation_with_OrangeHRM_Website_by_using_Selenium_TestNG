package testrunner;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.MainDashboardPage;
import pages.LoginPage;
import pages.UserInformationPage;
import org.junit.Assert;
import setup.Setup;
import utils.Utils;

import java.io.IOException;

public class SecondNoUserTestRunner extends Setup {
    MainDashboardPage dashboardPage;
    LoginPage loginPage;
    UserInformationPage userInfoPage;
    @Test(priority = 1, description = "Login With Second User")
    public void doLoginWithSecondUsers() throws IOException, ParseException, InterruptedException {
        loginPage = new LoginPage(driver);
        dashboardPage = new MainDashboardPage(driver);
        JSONObject userObject = Utils.loadJSONFileContainingArray("./src/test/resources/NewUsers.json", 1);
        String username = userObject.get("username").toString();
        String password = userObject.get("password").toString();
        loginPage.doLogin(username, password);
        Thread.sleep(1500);

        // Assertion
//        WebElement headerText = driver.findElement(By.tagName("h6"));
        WebElement headerText = driver.findElement(By.tagName("h6"));
        String header_actual = headerText.getText();
        String header_expected = "Dashboard";
        Assert.assertEquals(header_actual, header_expected);
        Thread.sleep(1500);

    }
    @Test(priority = 2, description = "Insert second user's info ")
    public void updateUserInformation() throws IOException, ParseException, InterruptedException {
        userInfoPage=new UserInformationPage(driver);
//        userInfoPage.userMenu.get(2).click();
        userInfoPage.userMenu.get(2).click();
        Utils.doScroll(driver,500);
        userInfoPage.selectGender();
        Thread.sleep(1500);
        Utils.doScroll(driver,500);
        userInfoPage.selectBloodType();
        Thread.sleep(1500);
        driver.navigate().refresh();
        userInfoPage.selectContact();
        Thread.sleep(1500);

        // Assertion
        WebElement headerText = driver.findElement(By.tagName("h6"));
        String header_actual = headerText.getText();
        String header_expected = "PIM";
        Assert.assertEquals(header_actual, header_expected);
        Thread.sleep(1500);
    }
    @Test(priority = 3,description = "Second User Logout Successfully")
    public void LogOut() {
        MainDashboardPage dashboardPage = new MainDashboardPage(driver);
//        dashboardPage.doLogout();
        dashboardPage.doLogout();
        driver.close();
    }
}

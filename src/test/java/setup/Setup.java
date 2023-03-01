package setup;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import pages.MainDashboardPage;

import java.time.Duration;

public class Setup {
    public WebDriver driver;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

     //@AfterTest
    public void closeDriver() {
        MainDashboardPage dashboardPage = new MainDashboardPage(driver);
        dashboardPage.doLogout();
        driver.close();
    }
}
//kortesilm naaaaaaaaaaa 2 2


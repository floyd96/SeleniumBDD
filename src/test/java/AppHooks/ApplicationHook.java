package AppHooks;

import com.factorry.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ApplicationHook {
    private DriverFactory driverFactory;
    private WebDriver driver;

    @Before(order = 0)
    public void launchBrowser(){
        driverFactory=new DriverFactory();
        driver=driverFactory.init_driver();
    }

    @After(order = 1)
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            // take screenshot:
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(sourcePath, "image/png", screenshotName);

        }
    }
    @After(order = 0)
    public void quitBrowser() {
        driver.quit();
    }
}

package org.fasttrack.pensionPod;

import com.sdl.selenium.utils.config.WebDriverConfig;
import com.sdl.selenium.web.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import projectSteps.HomePageSteps;

import static com.sdl.selenium.web.Browser.CHROME;

public abstract class TestBase {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestBase.class);
    
    public static WebDriver driver;

    static {
        startSuite();
    }



    private static void startSuite() {
        try {
            driver = WebDriverConfig.getWebDriver(CHROME);
        } catch (Exception e) {
            System.out.println("Exception when start suite" + e);
        }
    }

    public void openLoginPage() {
        System.out.println("ready");
        String url = System.getProperty("url");
        driver.get(url);
        System.out.println("-------");
    }


}


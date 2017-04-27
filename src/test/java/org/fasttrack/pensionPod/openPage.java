package org.fasttrack.pensionPod;


import com.sdl.selenium.web.WebLocator;
import data.Users;
import helper.Helper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import projectPages.HomePage;
import projectSteps.HomePageSteps;
import projectSteps.MainPageSteps;

import java.util.List;
import java.util.NoSuchElementException;

public class openPage extends TestBase {
    HomePageSteps homePageSteps = new HomePageSteps();
    MainPageSteps mainPageSteps = new MainPageSteps();
    Helper helper = new Helper();

    @Before
    public void setUp() {

    }

    HomePage homePage = new HomePage();

    @Test
    public void validLoginTest() throws InterruptedException {

        openLoginPage();

        //homePage.setLanguage("Nederlands");
//      homePage.setLanguage("Nederlands");

          homePageSteps.loginFeature();
          homePage.login(helper.getUsername(), helper.getPassword());
        Thread.sleep(4000);
        mainPageSteps.escapePopup();
        Thread.sleep(2000);
        mainPageSteps.clickProfileDropDown();
        Thread.sleep(2000);
        mainPageSteps.clickEditProfile();


    }
    @Test
    public void loginWithWrongCredentials() throws InterruptedException {

        openLoginPage();

        //homePage.setLanguage("Nederlands");
        //homePage.setLanguage("Nederlands");

//        List<String> wellComeMsg = getWellcomeMsg("home", "nl");
//        for (String msgText : wellComeMsg) {
//            WebLocator msg1 = new WebLocator().setText(msgText);
//            msg1.assertReady();
//        }

        homePageSteps.loginFeature();

        homePage.login("abc@abc.ro", "abc");

        homePage.checkMessageFailedLogin("Authentication failed. Please try again.");


    }

    private List<String> getWellcomeMsg(String page, String nl) {
        // Komt u rond tijdens uw pensioen?"
        return null;
    }
//    @After
//    public void tearDown() {
//     //   get screenshot in case test is fail
//        driver.close();
//    }
}
package projectSteps;

import projectPages.HomePage;


public class HomePageSteps {

    HomePage homePage = new HomePage();

    public void loginFeature()
    {
        homePage.clickLoginButton();

    }
}

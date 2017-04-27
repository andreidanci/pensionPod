package projectSteps;

import projectPages.MainPage;


public class MainPageSteps {

    MainPage mainPage = new MainPage();

    public void clickProfileDropDown()
    {
        mainPage.clickDropDownProfile();
    }

    public void clickEditProfile()
    {
        mainPage.clickEditProfileButton();
    }
    public void escapePopup()
    {
        mainPage.skipPopup();
    }
}

package projectPages;


import com.sdl.selenium.web.SearchType;
import com.sdl.selenium.web.WebLocator;
import helper.Helper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class MainPage extends Helper {

    WebDriver driver;

    private WebLocator loginDropDown = new WebLocator().setCls("login dropdown toggle-controls");

    private WebLocator editProfileBtn = new WebLocator().setText("Edit profile ");
    private WebLocator skipButton = new WebLocator().setCls("introjs-button introjs-skipbutton");

    private WebLocator firstNameField = new WebLocator().setAttribute("placeholder", "First name", SearchType.TRIM);

    private WebLocator middleNameField = new WebLocator().setAttribute("placeholder", "Middle name", SearchType.TRIM);

    private WebLocator surName = new WebLocator().setAttribute("placeholder", "Surname", SearchType.TRIM);

    private WebLocator dateOfBirth = new WebLocator().setAttribute("placeholder", "Date of birth", SearchType.TRIM);

    private WebLocator hasPartner = new WebLocator().setCls("hasPartner");


    public void clickDropDownProfile()
    {
        loginDropDown.click();
    }
    public void clickEditProfileButton()
    {
        editProfileBtn.click();
    }

    public void skipPopup()
    {
        skipButton.click();
    }






}

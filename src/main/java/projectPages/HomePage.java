package projectPages;

import com.sdl.selenium.web.SearchType;
import com.sdl.selenium.web.WebLocator;
import com.sdl.selenium.web.form.TextField;
import com.sdl.selenium.web.link.WebLink;
import helper.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class HomePage extends Helper {

    WebDriver driver;

    WebLink loginLink = new WebLink().setText("Log in");

    private WebLink faqButton = new WebLink().setText("FAQ", SearchType.DEEP_CHILD_NODE);


//    @FindBy(css = "span[onmouseover*='English'] > img")
//    private WebElement englishLanguageBtn;

//    @FindBy (css = "div[class='portlet-body']")
//    private WebElement languages;

    private TextField emailField = new TextField().setPlaceholder("Email Address");
//    private WebLocator emailField = new WebLocator().setAttribute("placeholder", "Email Address", SearchType.TRIM);

    private WebLocator passwordField = new WebLocator().setAttribute("placeholder", "Password", SearchType.TRIM);

    private WebLocator secondLogInBtn = new WebLocator().setAttribute("type", "submit", SearchType.TRIM);

    private WebLocator errorMessage = new WebLocator().setText("Authentication failed. Please try again.", SearchType.TRIM).setCls("alert alert-error");

    public void login(String email, String password) throws InterruptedException {

        Thread.sleep(3000);

        emailField.sendKeys(email);

        passwordField.sendKeys(password);

        secondLogInBtn.click();

    }


    public void checkMessageFailedLogin(String message) {

        Assert.assertEquals(errorMessage.getText(), message);

    }

    //=============================== Actions ================================

    public void clickLoginButton() {
        loginLink.click();
    }

    public void setLanguage(String language) {

        //languages.findElement(By.cssSelector("span[onmouseover*='"+language+"'] > img")).click();

        WebLink langBtn = new WebLink().setText(language, SearchType.DEEP_CHILD_NODE);
        langBtn.click();
    }


    //================================ Sync ===================================

    public void waitUntilLoginFieldsAreLoaded() {
        //  new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(emailField));
        //  new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(passwordField));
        //  new WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOf(altElementDeJos));
    }

}

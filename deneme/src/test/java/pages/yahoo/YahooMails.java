package pages.yahoo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class YahooMails {

    public YahooMails(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(linkText = "Sign in")
    public WebElement signINButton;

    @FindBy(id = "login-username")
    public WebElement userNameBox;

    @FindBy(xpath = "//ul[@id='header-nav-bar']/li[1]")
    public WebElement mailButton;

    @FindBy(id = "login-passwd")
    public WebElement passwordBox;

    @FindBy(xpath = "//span[@data-test-id='message-subject']")
    public List<WebElement> listOfSenders;

    @FindBy(xpath = "//button/span[.='Back']")
    public WebElement backButton;




}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ChallengingDOM_Page {

    public ChallengingDOM_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id = 'content']//script")
    public WebElement picture;

    @FindBy(linkText = "baz")
    public WebElement bazButton;

    @FindBy(linkText = "qux")
    public WebElement quxButton;

    @FindBy(linkText = "qux")
    public WebElement quxButton;


}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AddRemoveElement_Page {

    public AddRemoveElement_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='Add Element']")
    public WebElement addElementButton;

    @FindBy(xpath = "//button[@class='added-manually']")
    public WebElement deleteElementButton;
}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Autocomplete_Page {

    public Autocomplete_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

   @FindBy(id = "myCountry")
    public WebElement inputBox;


    @FindBy(xpath = "//input[@type='button']")
    public WebElement submitButton;


    @FindBy(id = "result")
    public WebElement resultMessage;
}

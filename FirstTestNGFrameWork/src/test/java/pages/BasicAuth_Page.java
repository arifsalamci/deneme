package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BasicAuth_Page {

    public BasicAuth_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



}

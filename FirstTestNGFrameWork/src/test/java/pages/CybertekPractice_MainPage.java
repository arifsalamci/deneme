package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class CybertekPractice_MainPage {

    public CybertekPractice_MainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@href='/add_remove_elements/']")
    public WebElement addRemoveElements;

    @FindBy(xpath = "//a[.='Autocomplete']")
    public WebElement autoComplete;

    @FindBy(xpath = "//a[.='Basic Auth']")
    public WebElement basicAuth;

    @FindBy(xpath = "//a[.='Broken Images']")
    public WebElement brokenImage;




}

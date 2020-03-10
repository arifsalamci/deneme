package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GasMileageCalculator_Page {

    public GasMileageCalculator_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "uscodreading")
    public WebElement current_Odometer_Reading;

    @FindBy(id = "uspodreading")
    public WebElement previous_Odometer_Reading;


    @FindBy(id = "usgasputin")
    public WebElement gas_Added_to_the_Tank	;

    @FindBy(id = "usgasprice")
    public WebElement gas_Price;

    @FindBy(xpath = "//table[@id='standard']//tr[5]//td//input")
    public WebElement calculateButton;


    @FindBy(xpath = "//b[.='24 mpg']t")
    public WebElement mpgResult;



}

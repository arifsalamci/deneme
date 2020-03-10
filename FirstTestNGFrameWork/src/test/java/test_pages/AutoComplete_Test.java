package test_pages;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Autocomplete_Page;
import pages.CybertekPractice_MainPage;
import utilities.Driver;

public class AutoComplete_Test {

    Autocomplete_Page autocomplete_page = new Autocomplete_Page();
    CybertekPractice_MainPage cybertekPractice_mainPage = new CybertekPractice_MainPage();

    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get("http://practice.cybertekschool.com/");
    }


    @Test
    public void submitTest(){
        cybertekPractice_mainPage.autoComplete.click();
        String country = "Turkey";
        autocomplete_page.inputBox.sendKeys(country);
        autocomplete_page.submitButton.click();
        String actualResultMessage = autocomplete_page.resultMessage.getText();

        Assert.assertTrue(actualResultMessage.equals("You selected: " + country));



    }
}

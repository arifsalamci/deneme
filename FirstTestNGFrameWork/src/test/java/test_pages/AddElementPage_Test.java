package test_pages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddRemoveElement_Page;
import pages.CybertekPractice_MainPage;
import utilities.Driver;

public class AddElementPage_Test {

    CybertekPractice_MainPage cybertekPractice_mainPage = new CybertekPractice_MainPage();
    AddRemoveElement_Page addRemoveElement_Page = new AddRemoveElement_Page();

    @BeforeMethod
    public void getMainPage(){
        Driver.getDriver().get("http://practice.cybertekschool.com/");
    }

    @Test
    public void addRemoveElements(){
        cybertekPractice_mainPage.addRemoveElements.click();
        addRemoveElement_Page.addElementButton.click();

        Assert.assertTrue(addRemoveElement_Page.deleteElementButton.isDisplayed(), "Delete button is not displayed, verification failed!!");

        addRemoveElement_Page.deleteElementButton.click();

        Assert.assertTrue(addRemoveElement_Page.deleteElementButton.equals(null), "It is displayed.");



    }

    @AfterMethod
    public void tearDown(){
        Driver.quitDriver();
    }

}

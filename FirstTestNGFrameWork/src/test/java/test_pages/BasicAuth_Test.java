package test_pages;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasicAuth_Page;
import utilities.Driver;

public class BasicAuth_Test {


    BasicAuth_Page basicAuth_page = new BasicAuth_Page();


    @BeforeMethod
    public void getMainPage(){
        Driver.getDriver().get("http://practice.cybertekschool.com/");
    }

    @Test
    public void BasitAuth(){
        Driver.getDriver().get("http://admin:admin@practice.cybertekschool.com/basic_auth");
    }
}

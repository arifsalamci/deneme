package test_pages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.BrokenImage_Page;
import pages.CybertekPractice_MainPage;
import utilities.Driver;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class BrokenImage_Test {

    BrokenImage_Page brokenImage_page = new BrokenImage_Page();
    CybertekPractice_MainPage cybertekPractice_mainPage = new CybertekPractice_MainPage();

    @Test
    public void brokenImage() {

        Driver.getDriver().get("http://practice.cybertekschool.com/");
        cybertekPractice_mainPage.brokenImage.click();
        int i = 0;

        SoftAssert soft = new SoftAssert();
       try {
           for (WebElement image : brokenImage_page.listOfImages) {

               String url = image.getAttribute("src");
               URL obj = new URL(url);
               HttpURLConnection con = (HttpURLConnection) obj.openConnection();
               con.setRequestMethod("GET");
               System.out.println(++i + " picture is checking");
               soft.assertTrue(String.valueOf(con.getResponseCode()).equals("200"));
               }
       }catch (Exception e){
           e.printStackTrace();
       }

       soft.assertAll();
    }
}

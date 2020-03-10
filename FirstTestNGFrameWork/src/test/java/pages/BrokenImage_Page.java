package pages;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.List;

public class BrokenImage_Page {

    public BrokenImage_Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(tagName = "img")
    public List<WebElement> listOfImages;



}

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Test;
import org.openqa.selenium.json.Json;

public class CMTeacher {

    @Test
    public void singleTeacher(){

    Response response = RestAssured.get("http://api.cybertektraining.com/student/6749");
    System.out.println(response.getStatusCode());
    System.out.println(response.asString());







    }
}

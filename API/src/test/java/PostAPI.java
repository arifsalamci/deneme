import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import java.io.IOException;

public class PostAPI {


    @Test
    public void teacherFirstName() throws IOException {
        Response response = RestAssured.get("http://api.cybertektraining.com/teacher/448");
        System.out.println(response.asString());

        ObjectMapper mapper = new ObjectMapper();
        CustomResponse cr = mapper.readValue(response.asString(), CustomResponse.class);
        System.out.println(cr.getTeachers().get(0).getFirstName());

    }


}

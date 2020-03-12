import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class TestStudent {



    @Test
    public void getFirstName() throws IOException {
        Response response = RestAssured.get("http://api.cybertektraining.com/student/all");
        System.out.println(response.statusCode());
        ObjectMapper mapper = new ObjectMapper();
        CustomResponse cr = mapper.readValue(response.asString(), CustomResponse.class);

        List<Student> list = cr.getStudents();
        int counter = 0;
        for (Student student: list){
            if(student.getBatch() == 7){
                System.out.println(student.getFirstName());
                counter++;
            }
        }
        System.out.println("Total number of Batch 7 students: " + counter);

    }
}

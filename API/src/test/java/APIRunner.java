import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import okhttp3.RequestBody;

import java.io.IOException;

public class APIRunner {

    private static CustomResponse cr;


    public static void runGet(String uri){
        Response response = RestAssured.get(uri);
        System.out.println("Status: " + response.statusCode());
        System.out.println(response.asString());
        ObjectMapper mapper = new ObjectMapper();

        try{
            cr = mapper.readValue(response.asString(), CustomResponse.class);

        }catch(IOException e){
            System.out.println("JSON COULD NOT MAP PROPERLY");
        }
    }

    public static void runPost(String uri, RequestBody body)  {
        Response response = RestAssured.given().contentType(ContentType.JSON).body(body).when().post(uri);
        System.out.println("Status: "  + response.statusCode());
        ObjectMapper mapper = new ObjectMapper();

        try {
            cr = mapper.readValue(response.asString(), CustomResponse.class);

        }catch (IOException e){
            System.out.println("Json could not map properly");
        }

    }

    public static CustomResponse getResponse(){
        if(cr == null){
            System.out.println("Please run API first");
            throw new RuntimeException();
        }
        return cr;
    }
}

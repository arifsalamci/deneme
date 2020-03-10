package utilities;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import okhttp3.RequestBody;
import org.apache.groovy.json.internal.IO;

import java.io.IOException;

public class APIRunner {

    private static CustomResponse cr;


    public static void runGet(String uri){
        Response response = RestAssured.get(uri);
        System.out.println(response.statusCode());
        ObjectMapper mapper = new ObjectMapper();

        try {
            cr = mapper.readValue(response.asString(), CustomResponse.class);

        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    public static void runPost(String uri, RequestBody body){

        Response response = RestAssured.given().contentType(ContentType.JSON).body(body).when().post(uri);
        System.out.println(response.statusCode());

        ObjectMapper mapper = new ObjectMapper();

        try{

            cr =  mapper.readValue(response.asString(), CustomResponse.class);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static CustomResponse getResponse(){
        if (cr == null){
            System.out.println("Please run API first");
            throw new RuntimeException();
        }
        return cr;
    }
}

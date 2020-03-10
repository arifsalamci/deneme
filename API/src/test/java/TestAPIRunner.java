import org.junit.Test;

import java.util.List;

public class TestAPIRunner {


    @Test
    public void testAPIRunner(){
        APIRunner.runGet("http://api.cybertektraining.com/student/all");
        System.out.println(APIRunner.getResponse());


    }
}

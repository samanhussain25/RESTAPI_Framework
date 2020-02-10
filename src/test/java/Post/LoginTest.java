package Post;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LoginTest {

    @Test
    public String getToken() throws IOException {
       String url = "http://localhost:8081";
       String loginPayload = new String(Files.readAllBytes(Paths.get(System.getProperty("Users.dir")+"/payloads/login.json")));

        RequestSpecification requestSpecification = RestAssured.given().body(loginPayload);
        requestSpecification.contentType("application/json");

        Response response = requestSpecification.post(url);

        System.out.println(response.statusCode());
        String stringResponse = response.asString();
        JsonPath jsonPath = new JsonPath(stringResponse);
        String token = jsonPath.get("sessionID");
        //System.out.println(token);
        return token;


    }


}

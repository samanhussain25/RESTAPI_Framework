package Post;

import base.Base;
import base.BaseAssertion;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utils.URL;

public class CreateTask {

    @Test
    public void createTaskTest(){
        String sessionID = Base.getSessionId();
        String url = URL.getEndPoint("/rest/api/2/issue/");
        String payload = Base.generatePayLoadString("createTask.json");
        Response response = Base.POSTRequest(url, payload, sessionID);
        BaseAssertion.verifyStatusCode(response, 201);

    }
}

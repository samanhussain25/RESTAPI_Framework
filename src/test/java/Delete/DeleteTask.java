package Delete;

import base.Base;
import base.BaseAssertion;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utils.URL;

public class DeleteTask {
    @Test
    public void deleteTaskTest(){
        String sessionID = Base.getSessionId();
        String url = URL.getEndPoint("/rest/api/2/issue/SP-5");
        Response response = Base.DELETERequest(url, sessionID);
        BaseAssertion.verifyStatusCode(response,204);
    }
}


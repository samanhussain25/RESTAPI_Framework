package Post;

import base.Base;
import base.BaseAssertion;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utils.URL;

public class CreateIssue {

    @Test
    public void createIssueTest(){
        String sessionID = Base.getSessionId();
        String payload = Base.generatePayLoadString("createIssue.json");
        String url = URL.getEndPoint("/rest/api/2/issue/");
        Response response = Base.POSTRequest(url, payload, sessionID);
        BaseAssertion.verifyStatusCode(response, 201);
    }


}

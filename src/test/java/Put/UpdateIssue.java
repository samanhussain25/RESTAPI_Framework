package Put;

import base.Base;
import base.BaseAssertion;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utils.URL;

public class UpdateIssue {

    @Test
    public void updateIssueTest(){
        String sessionId = Base.getSessionId();
        String url = URL.getEndPoint("/rest/api/2/issue/SP-1");
        String payload = Base.generatePayLoadString("updateIssue.json");
        Response response = Base.PUTRequest(url, payload, sessionId);
        BaseAssertion.verifyStatusCode(response, 204);
    }
}

package Get;

import base.Base;
import base.BaseAssertion;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utils.URL;

public class GetIssue {
    @Test
    public void getIssueTest(){
       String sessionID = Base.getSessionId();
       String url =  URL.getEndPoint("/rest/api/2/issue/SP-1");
       Response response =  Base.GETRequest(url, sessionID);
        System.out.println(response);
       BaseAssertion.verifyStatusCode(response, 200);


    }
}

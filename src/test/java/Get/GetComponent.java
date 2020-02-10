package Get;

import base.Base;
import base.BaseAssertion;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utils.URL;

public class GetComponent {
    @Test
    public void getComponentTest(){
        String sessionID = Base.getSessionId();
        String url = URL.getEndPoint("/rest/api/2/project/SP/components");
        Response response = Base.GETRequest(url, sessionID);
        BaseAssertion.verifyStatusCode(response, 200);
    }
}

package Post;

import base.Base;
import base.BaseAssertion;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utils.URL;

public class CreateComponent {
    @Test
    public void createComponentTest(){
        String sessionID = Base.getSessionId();
        String payload = Base.generatePayLoadString("createComponent.json");
        String url = URL.getEndPoint("/rest/api/2/component/");
        Response response= Base.POSTRequest(url, payload, sessionID);
        BaseAssertion.verifyStatusCode(response, 201);
    }
}

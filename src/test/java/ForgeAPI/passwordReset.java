package ForgeAPI;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class passwordReset {

    @Test
    public void passwordReset1(){

        RestAssured.useRelaxedHTTPSValidation();

        RestAssured.baseURI = "https://np-api.leaguedata.ca/int1/forge-eapi/v1";


        RequestSpecification httprequest = RestAssured.given().header("client_secret", "33C394254542453b839eCe485C4f055b").header("client_id", "89fefd7ce57943f0ab8f71c11e7ebf8e").header("X-Tenant-ID", "at_sydney").header("Content-Type", "application/json").header("X-Request-Trace-ID", "12345PassResetTrace123").header("X-Context-ID", "011119919");
        String payload= "{\n" +
                "  \"loginIdentifier\": \"1234560123000069900\",\n" +
                "  \"password\": \"12224\"\n" +
                "}";
        Response response = httprequest.body(payload).post("/authentication/password/reset");
        ResponseBody responsebody = response.getBody();
        String resopnse1= responsebody.asString();
        System.out.println(resopnse1);

        int statuscode = response.getStatusCode();
        Assert.assertEquals(200,statuscode);
    }
}

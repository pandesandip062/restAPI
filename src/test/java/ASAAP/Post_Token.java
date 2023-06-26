package ASAAP;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Post_Token {

    @Test
    public void post_token(){

        RestAssured.useRelaxedHTTPSValidation();

        RestAssured.baseURI = "https://np-api.leaguedata.ca:443/int1/asapp-eapi/v1";


        RequestSpecification httprequest = RestAssured.given().header("Username","asapp-user").header("Password","secret@123").header("client_secret", "33C394254542453b839eCe485C4f055b").header("cuId", "2").header("Authorization", "Basic YXNhcHAtdXNlcjpzZWNyZXRAMTIz").header("Content-Type", "application/x-www-form-urlencoded").formParam("username","00201051");
        Response response = httprequest.post("/oauth/token");
        ResponseBody responsebody = response.getBody();
        String resopnse1= responsebody.asString();
        System.out.println(resopnse1);

    }
}

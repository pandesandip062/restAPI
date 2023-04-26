package ASAAP;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.util.HashMap;

public class putParty {
 HashMap hasmap = new HashMap();
    @Test
    public void PutParty() {


        RestAssured.useRelaxedHTTPSValidation();

        RestAssured.baseURI = "https://np-api.leaguedata.ca:443/int1/asapp-eapi/v1";


        RequestSpecification httprequest = RestAssured.given().header("Username", "asapp-user").header("Password", "secret@123").header("client_secret", "33C394254542453b839eCe485C4f055b").header("cuId", "2").header("Authorization", "Basic YXNhcHAtdXNlcjpzZWNyZXRAMTIz").header("Content-Type", "application/x-www-form-urlencoded").formParam("username", "00201123");
        Response response = httprequest.post("/oauth/token");
        ResponseBody responsebody = response.getBody();
        String resopnse1 = responsebody.asString();
        // System.out.println(resopnse1);

        JsonPath jsonpathview = responsebody.jsonPath();

        String accesstoken = jsonpathview.get("access_token");
        String ac1 = "Bearer "+accesstoken;

        RestAssured.baseURI = "https://np-api.leaguedata.ca/int1/asapp-eapi";



        RequestSpecification httprequest1 = RestAssured.given().header("Content-Type", "application/json").header("Authorization",ac1);
        Response response1 = httprequest1.body(new File(".//Datafiles/putbody.json")).put("/v1/PartyMessage");
        ResponseBody responsebody1 = response1.getBody();
        String resopnse2 = responsebody1.asString();
        System.out.println(resopnse2);

        JsonPath jsonpath= responsebody1.jsonPath();
        String statusMessage = jsonpath.getJsonObject("partyMessage.messageContext.statusList.status[0].statusMessage");
        Assert.assertEquals(statusMessage,"RECORD UPDATED");

        String memberID = jsonpath.getJsonObject("partyMessage.partyList.party[0].id");
        Assert.assertEquals(memberID,"011767354");

        int statuscode = response1.getStatusCode();
        Assert.assertEquals(statuscode,201);



    }




}
package Biller;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class AddBiller {

    HashMap hashmap = new HashMap();
    @Test
    public  void Add_Biller(){

        RestAssured.useRelaxedHTTPSValidation();

        RestAssured.baseURI = "https://np-api.leaguedata.ca/int1/forge-eapi/v1";


        RequestSpecification httprequest = RestAssured.given().header("client_secret", "33C394254542453b839eCe485C4f055b").header("client_id", "89fefd7ce57943f0ab8f71c11e7ebf8e").header("X-Tenant-ID", "at_sydney").header("Content-Type", "application/json").header("X-Request-Trace-ID", "1").header("X-Context-ID", "011616931");
//        String payload= "{\n" +
//          "  \"vendorId\": \"110\",\n" +
//          "  \"vendorMemberAccount\": \"0000802390\",\n" +
//          "  \"nickname\": \"rushi1\"\n" +
//          "}";
                hashmap.put("vendorId","110");
                hashmap.put("vendorMemberAccount","0000701220");
                hashmap.put("nickname","rushi1");

        Response response = httprequest.body(hashmap).post("/bill-payment/payee");
        ResponseBody responsebody = response.getBody();
        String resopnse1= responsebody.asString();
        System.out.println(resopnse1);

        int statuscode = response.getStatusCode();
        Assert.assertEquals(200,statuscode);




    }
}

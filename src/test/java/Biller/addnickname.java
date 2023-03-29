package Biller;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

public class addnickname {
    @Test
    public void Add_Biller() {

        RestAssured.useRelaxedHTTPSValidation();

        RestAssured.baseURI = "https://np-api.leaguedata.ca/int1/forge-eapi";


        RequestSpecification httprequest = RestAssured.given().header("client_secret", "33C394254542453b839eCe485C4f055b").header("client_id", "89fefd7ce57943f0ab8f71c11e7ebf8e").header("X-Tenant-ID", "at_sydney").header("X-Request-Trace-ID", "1").header("X-Context-ID", "011616931");

        JSONObject body = new JSONObject();
        body.put("nickname", "akshay");


//        httprequest.header("Content-Type", "application/Json");
//
//        Response response = httprequest.request(Method.PUT, "/v1/accounts/0112000023/preferences/nickname");
//        ResponseBody responsebody = response.getBody();
//        String resopnse1 = responsebody.asString();
//        System.out.println(resopnse1);


        String payload= "{\n" +
                "  \"nickname\": \"Aadhhyy\",\n" +
                "  \"approvalInfo\": {\n" +
                "    \"approverUmids\": [\n" +
                "      \"string\"    ],\n" +
                "    \"initiatorDelegateId\": \"string\"  }\n" +
                "}";
        Response response = httprequest.body(payload).put("/v1/accounts/0112000023/preferences/nickname");
        ResponseBody responsebody = response.getBody();
        String resopnse1= responsebody.asString();
        System.out.println(resopnse1);

        int statuscode = response.getStatusCode();
        Assert.assertEquals(200,statuscode);
    }
}
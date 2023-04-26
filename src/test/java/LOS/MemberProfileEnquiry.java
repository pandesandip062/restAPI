package LOS;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Scanner;

public class MemberProfileEnquiry {

    public RequestSpecification httprequest;
    public RequestSpecification httprequest2;
    public Response response;
    public Response response2;
    public ResponseBody responsebody;

    public ResponseBody responsebody2;
    public JsonPath jsonPath;


    public void setup() {
        RestAssured.useRelaxedHTTPSValidation();


        String a ="int1";

        if (a.equals("int1")) {
            RestAssured.baseURI = "https://np-api.leaguedata.ca:443/int1/horizon-los-eapi/v1/";
            httprequest = RestAssured.given().header("client_secret", "2c8aBcF9Dd2B461381159FCE475466A8").header("client_id", "a86bcd23876c42fb875f59cf26c5aeaf").header("cuID", "2");
            response = httprequest.get("members/011442304");
            responsebody = response.getBody();
            String resopnse1 = responsebody.asString();
            System.out.println(resopnse1);
        } else if (a.equals("uat")) {
            RestAssured.baseURI = "https://np-api.leaguedata.ca:443/uat/horizon-los-eapi/v1/";
            httprequest = RestAssured.given().header("client_secret", "2c8aBcF9Dd2B461381159FCE475466A8").header("client_id", "a86bcd23876c42fb875f59cf26c5aeaf").header("cuID", "2");
            response = httprequest.get("members/011338529");
            responsebody = response.getBody();
            String resopnse1 = responsebody.asString();
            System.out.println(resopnse1);

        }
    }
        @Test
        public void memberid(){
              jsonPath = response.jsonPath();
            String MemberId = jsonPath.get("member[0].memberNumber");
            Assert.assertEquals("011442304", MemberId);

        }

    }


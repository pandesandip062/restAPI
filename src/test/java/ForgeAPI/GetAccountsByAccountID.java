package ForgeAPI;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetAccountsByAccountID  {


    @Test
    public void GetAccountbyAccountID(){
        RestAssured.useRelaxedHTTPSValidation();

        RestAssured.baseURI="https://np-api.leaguedata.ca/int1/forge-eapi/v1/accounts";

        RequestSpecification httprequest = RestAssured.given().header("client_secret", "33C394254542453b839eCe485C4f055b").header("client_id", "89fefd7ce57943f0ab8f71c11e7ebf8e").header("X-Tenant-ID", "at_sydney").header("Content-Type", "application/json").header("X-Request-Trace-ID", "1").header("X-Context-ID", "010000016");

        Response response = httprequest.request(Method.GET,"0112000016");

        ResponseBody responsebody = response.getBody();
        String resopnse1= responsebody.asString();
        System.out.println(resopnse1);

        JsonPath jsonpath = responsebody.jsonPath();

        String accountID = jsonpath.get("data.accountId");
        Assert.assertEquals(accountID,"0112000016");

        String name = jsonpath.get("data.accountHolders[0].name");
        Assert.assertEquals(name,"Johny0 sk Smith1");

        String relationShip = jsonpath.get("data.accountHolders[0].relationship");

        String accountType = jsonpath.get("data.accountType");
        Assert.assertEquals(accountType,"SAVINGS");

        String status = jsonpath.get("data.status");
        Assert.assertEquals(status,"OPEN");





    }


    }





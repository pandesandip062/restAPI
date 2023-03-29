package ForgeAPI;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetAccounts {

    @Test
    public void test1() {
        RestAssured.useRelaxedHTTPSValidation();

        RestAssured.baseURI = "https://np-api.leaguedata.ca/int1/forge-eapi/v1";


        RequestSpecification httprequest = RestAssured.given().header("client_secret", "33C394254542453b839eCe485C4f055b").header("client_id", "89fefd7ce57943f0ab8f71c11e7ebf8e").header("X-Tenant-ID", "at_sydney").header("Content-Type", "application/json").header("X-Request-Trace-ID", "1").header("X-Context-ID", "011442304");


        Response response = httprequest.request(Method.GET, "/accounts");

        ResponseBody responsebody = response.getBody();
        String resonsebody1 = responsebody.asString();
        System.out.println("response is" + resonsebody1);

        JsonPath jsonpathview = responsebody.jsonPath();
        String accountID = jsonpathview.get("data.accounts[0].accountId");
        Assert.assertEquals(accountID, "0115755089");

        String accountType = jsonpathview.get("data.accounts[0].accountType");
        Assert.assertEquals(accountType,"SAVINGS");

        String status = jsonpathview.get("data.accounts[0].status");
        Assert.assertEquals(status,"OPEN");

        String name = jsonpathview.get("data.accounts[0].accountHolders[0].name");
        Assert.assertEquals(name,"Sandip Balaji Pande");






    }




    }


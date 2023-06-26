package ASAAP;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.reporters.EmailableReporter;

import javax.print.attribute.standard.MediaSize;

public class GetPartybyid {

    @Test
    public void GetpartyByID() {


        RestAssured.useRelaxedHTTPSValidation();

        RestAssured.baseURI = "https://np-api.leaguedata.ca:443/int1/asapp-eapi/v1";


        RequestSpecification httprequest = RestAssured.given().header("Username", "asapp-user").header("Password", "secret@123").header("client_secret", "33C394254542453b839eCe485C4f055b").header("cuId", "2").header("Authorization", "Basic YXNhcHAtdXNlcjpzZWNyZXRAMTIz").header("Content-Type", "application/x-www-form-urlencoded").formParam("username", "00201051");
        Response response = httprequest.post("/oauth/token");
        ResponseBody responsebody = response.getBody();
        String resopnse1 = responsebody.asString();
        System.out.println(resopnse1);

        JsonPath jsonpathview = responsebody.jsonPath();

        String accesstoken = jsonpathview.get("access_token");
        String ac1 = "Bearer "+accesstoken;
        System.out.println(accesstoken);

        String tokentype = jsonpathview.get("token_type");

        Assert.assertEquals(tokentype,"bearer");

        System.out.println(ac1);



        RestAssured.baseURI = "https://np-api.leaguedata.ca/int1/asapp-eapi/v1";

        RequestSpecification httprequest1 =  RestAssured.given().header("Content-Type", "application/json").header("Authorization","Bearer ewogICJ0eXAiOiAiSldUIiwKICAiYWxnIjogIkhTMjU2Igp9.ewogICJzdWIiOiAiMDAyMDEwNTEiLAogICJuYW1lIjogIkFTQUFQIFRlc3RlcjEiLAogICJpYXQiOiAxNjg4NDc0OTM3LAogICJleHAiOiAxNjg4NDc4NTM3LAogICJpbnN0aXR1dGlvbiI6ICIwMDIiCn0.MxHk2ZWpBqSQzO6fGBtSs5wqtVLelO65MfCe4fcEssY");
        Response response1 = httprequest1.request(Method.GET,"/PartyMessage/011442304");

        ResponseBody responsebody1 = response1.getBody();
        String resonsebody1 = responsebody1.asString();
        System.out.println("response is" + resonsebody1);

        JsonPath jsonpathview1 = responsebody1.jsonPath();
        String taxIdtype = jsonpathview1.get("partyMessage.partyList.party[0].taxInformationList.taxInformation[0].taxIdType");
        Assert.assertEquals(taxIdtype,"Compnay");

        String taxID = jsonpathview1.get("partyMessage.partyList.party[0].taxInformationList.taxInformation[1].taxId");
        Assert.assertEquals(taxID, "1234");

        String OtherTaxIdtype = jsonpathview1.get("partyMessage.partyList.party[0].taxInformationList.taxInformation[1].otherTaxIdType");
        Assert.assertEquals(OtherTaxIdtype,"SIN");

        String FN = jsonpathview1.get("partyMessage.partyList.party[0].characteristics.individual.firstName");
        Assert.assertEquals(FN,"Sandip");

        String MN = jsonpathview1.get("partyMessage.partyList.party[0].characteristics.individual.middleName");
        Assert.assertEquals(MN,"Balaji");

        String LN = jsonpathview1.get("partyMessage.partyList.party[0].characteristics.individual.lastName");
        Assert.assertEquals(LN,"Pande");

//        String prefix = jsonpathview1.get("partyMessage.partyList.party[0].characteristics.individual.prefix");
//        Assert.assertEquals(prefix,"null");

        String bday = jsonpathview1.get("partyMessage.partyList.party[0].characteristics.individual.birthdate");
        Assert.assertEquals(bday,"2023-02-01");

        String empoccuptaion = jsonpathview1.get("partyMessage.partyList.party[0].characteristics.individual.employmentList.employment[0].employeeOccupation");
        Assert.assertEquals(empoccuptaion,"B012");

        String empindustry = jsonpathview1.get("partyMessage.partyList.party[0].characteristics.individual.employmentList.employment[0].customData.valuePair[1].value");
        Assert.assertEquals(empindustry,"B1");

        String occdisc = jsonpathview1.get("partyMessage.partyList.party[0].characteristics.individual.employmentList.employment[0].customData.valuePair[2].value");
        Assert.assertEquals(occdisc,"Sales");

        String iddocsiddentifier = jsonpathview1.get("partyMessage.partyList.party[0].identificationDocumentList.identificationDocument[0].idDocumentIdentifer");
        Assert.assertEquals(iddocsiddentifier,"928490");

        String line1 = jsonpathview1.get("partyMessage.partyList.party[0].contactList.contact[0].contactPoint.address.line1");
        Assert.assertEquals(line1,"Pune");

        String emailaddress = jsonpathview1.get("partyMessage.partyList.party[0].contactList.contact[2].contactPoint.email.address");
        Assert.assertEquals(emailaddress,"abc@gmail.com");

        String branchNumber = jsonpathview1.get("partyMessage.partyList.party[0].customData.valuePair[0].value");
        Assert.assertEquals(branchNumber,"CU3BR1");
    }
}
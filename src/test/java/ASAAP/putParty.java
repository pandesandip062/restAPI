package ASAAP;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

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
//        hasmap.put("id","011767354");
//        hasmap.put("taxId","71902902");
        String payload= "{\n" +
                "  \"partyMessage\": {\n" +
                "    \"partyList\": {\n" +
                "      \"party\": [\n" +
                "        {\n" +
                "          \"id\": \"011767354\",\n" +
                "          \"taxInformationList\": {\n" +
                "            \"taxInformation\": [\n" +
                "              {\n" +
                "                \"taxId\": \"71902902\",\n" +
                "                \"taxIdType\": \"Other\",\n" +
                "                \"otherTaxIdType\": \"SIN\"\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          \"type\": \"Organization\",\n" +
                "          \"characteristics\": {\n" +
                "            \"individual\": {\n" +
                "              \"firstName\": \"Sandy\",\n" +
                "              \"middleName\":\"Balaji\",\n" +
                "              \"lastName\": \"Pande\",\n" +
                "              \"prefix\": \"Female\",\n" +
                "              \"birthdate\": \"2023-03-31\",\n" +
                "              \"gender\": \"Male\",\n" +
                "              \"employmentList\": {\n" +
                "                \"employment\": [\n" +
                "                  {\n" +
                "                    \"employeeOccupation\": \"D013\",\n" +
                "                    \"customData\": {\n" +
                "                      \"valuePair\": [\n" +
                "                        {\n" +
                "                          \"name\": \"employmentStatus\",\n" +
                "                          \"value\": \"2\"\n" +
                "                        },\n" +
                "                        {\n" +
                "                          \"name\": \"employmentType\",\n" +
                "                          \"value\": \"0\"\n" +
                "                        },\n" +
                "                        {\n" +
                "                          \"name\": \"occupationDesc\",\n" +
                "                          \"value\": \"gsgsa\"\n" +
                "                        },\n" +
                "                        {\n" +
                "                          \"name\": \"employmentIndustry\",\n" +
                "                          \"value\": \"D1\"\n" +
                "                        }\n" +
                "                      ]\n" +
                "                    }\n" +
                "                  }\n" +
                "                ]\n" +
                "              }\n" +
                "            }\n" +
                "          },\n" +
                "          \"contactList\": {\n" +
                "            \"contact\": [\n" +
                "              {\n" +
                "                \"contactType\": \"Address\",\n" +
                "                \"contactPoint\": {\n" +
                "                  \"address\": {\n" +
                "                    \"line1\": \"Pune\",\n" +
                "                    \"line2\": \"Hinjewadi\",\n" +
                "                    \"city\": \"Pune\",\n" +
                "                    \"stateProvince\": \"MH\",\n" +
                "                    \"postalCode\": \"411057\",\n" +
                "                    \"countryCode\": \"IN\",\n" +
                "                    \"addressType\": \"Mailing\"\n" +
                "                  }\n" +
                "                }\n" +
                "              },\n" +
                "              {\n" +
                "                \"contactType\": \"Phone\",\n" +
                "                \"contactPoint\": {\n" +
                "                  \"phone\": {\n" +
                "                    \"phoneType\": \"Mobile\",\n" +
                "                    \"number\": \"0987654321\"\n" +
                "                  }\n" +
                "                }\n" +
                "              },\n" +
                "              {\n" +
                "                \"contactType\": \"Email\",\n" +
                "                \"contactPoint\": {\n" +
                "                  \"email\": {\n" +
                "                    \"emailType\": \"Home\",\n" +
                "                    \"address\": \"NNAHAR@LEAGUEDATA.CA\"\n" +
                "                  }\n" +
                "                }\n" +
                "              }\n" +
                "            ]\n" +
                "          },\n" +
                "          \"partyDateTimeCreated\": \"2023-03-23\",\n" +
                "          \"customData\": {\n" +
                "            \"valuePair\": [\n" +
                "              {\n" +
                "                \"name\": \"residencyForTaxPurposes\",\n" +
                "                \"value\": \"CA\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"name\": \"branchNumber\",\n" +
                "                \"value\": \"01\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"name\": \"maritalStatus\",\n" +
                "                \"value\": \"S\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"name\": \"incomeRange\",\n" +
                "                \"value\": \"N\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"name\": \"usCitizenInd\",\n" +
                "                \"value\": \"false\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"name\": \"pefpIndicator\",\n" +
                "                \"value\": \"N\"\n" +
                "              },\n" +
                "              {\n" +
                "                \"name\": \"hioIndicator\",\n" +
                "                \"value\": \"N\"\n" +
                "              }\n" +
                "            ]\n" +
                "          }\n" +
                "        }\n" +
                "      ]\n" +
                "    },\n" +
                "    \"messageContext\": {\n" +
                "      \"cufxVersion\": \"4.2.0\"\n" +
                "    }\n" +
                "  }\n" +
                "}";
        Response response1 = httprequest1.body(payload).put("/v1/PartyMessage");
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
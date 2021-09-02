package test.java.com.api;


import org.json.JSONArray;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

@Listeners(ListenersTestNG.class)
public class TestAPIResponse {

    @Test(dataProvider = "requestURL", dataProviderClass = DataProviderTestNG.class)
    public void APITests(String file1Req, String file2Req, ITestContext context)
    {
        try {

            context.setAttribute("fileOne", file1Req);
            context.setAttribute("fileTwo", file2Req);

            String fileOneResponse = given().when().get(file1Req).thenReturn().body().asString();
            String fileTwoResponse = given().when().get(file2Req).thenReturn().body().asString();

            JSONObject fileOne = null;
            JSONObject fileTwo = null;

            try {
                fileOne = new JSONObject(fileOneResponse);
                fileTwo = new JSONObject(fileTwoResponse);
            } catch (Exception e){
                fileOne = new JSONObject().put("key", new JSONArray(fileOneResponse));
                fileTwo = new JSONObject().put("key", new JSONArray(fileTwoResponse));
            }
            Assert.assertTrue(Comparator.jsonCompareObject(fileOne, fileTwo));
        }
        catch (Exception e) {
            Assert.fail();

        }



    }





}

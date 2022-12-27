package com.restful.booker.crudtest;

import com.restful.booker.model.PatchBookingPojo;
import com.restful.booker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Patch_CRUD extends TestBase {


    @Test
    public void updateARecordPartially() {
        PatchBookingPojo patchBookingPojobookingPojo = new PatchBookingPojo();
        patchBookingPojobookingPojo.setAdditionalneeds("pillow");

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Cookie", "token=fd32b17c81c8fc1")
                .pathParam("id", 1)
                .body(patchBookingPojobookingPojo)
                .when().patch("{id}");

        response.then().statusCode(200);
        response.prettyPrint();

    }
}

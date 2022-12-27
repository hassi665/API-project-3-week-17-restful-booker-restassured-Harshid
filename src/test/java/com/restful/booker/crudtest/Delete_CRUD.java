package com.restful.booker.crudtest;

import com.restful.booker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Delete_CRUD extends TestBase {


    @Test
    public void getSingleBookingID() {
        Response response = given()
                .header("Content-Type", "application/json")
                .header("Cookie", "token=224666d302cc4e4")
                .pathParam("id", 2951)
                .when().delete("{id}");

        response.then().statusCode(201);
        response.prettyPrint();
        System.out.println("Record Deleted");
    }
}

package com.restful.booker.crudtest;

import com.restful.booker.model.UpdateBookingPojo;
import com.restful.booker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Put_CRUD extends TestBase {


    @Test
    public void updateCurrentBooking() {

        UpdateBookingPojo.BookingDates date = new UpdateBookingPojo.BookingDates();
        date.setCheckin("2022-11-13");
        date.setCheckout("2022-11-30");

        UpdateBookingPojo updateBookingPojobookingPojo = new UpdateBookingPojo();

        updateBookingPojobookingPojo.setFirstname("Axay");
        updateBookingPojobookingPojo.setLastname("Kumar");
        updateBookingPojobookingPojo.setTotalprice(1000);
        updateBookingPojobookingPojo.setDepositpaid(true);
        updateBookingPojobookingPojo.setBookingdates(date);
        updateBookingPojobookingPojo.setAdditionalneeds("Extra Luggage 25 kg");

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("Cookie", "token=aa149bf1783bc81")
                .pathParam("id",2998)
                .body(updateBookingPojobookingPojo)
                .when().put("{id}");

        response.then().statusCode(200);
        response.prettyPrint();

    }
}

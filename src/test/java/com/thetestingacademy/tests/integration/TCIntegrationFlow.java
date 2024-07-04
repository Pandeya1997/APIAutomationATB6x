package com.thetestingacademy.tests.integration;

import com.thetestingacademy.base.BaseTest;
import com.thetestingacademy.endpoints.APIConstants;
import com.thetestingacademy.pojos.Booking;
import com.thetestingacademy.pojos.BookingResponse;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TCIntegrationFlow extends BaseTest {
    // Create A Booking, Create a Token
    // Get booking
    // Update the Booking
    // Delete the Booking
    @Test(groups = "Integration", priority = 1)
    @Owner("promode")
    @Description("TC#INT1 - Step-1 Verify that the Booking can be Created")
    public void testCreateBooking(ITestContext iTestContext) {
        iTestContext.setAttribute("token", getToken());


        requestSpecification.basePath(APIConstants.CREATE_UPDATE_BOOKING_URL);
        response = RestAssured
                .given(requestSpecification)
                .when().body(payloadManager.createPayloadBookingAsString()).post();

        validatableResponse = response.then().log().all();

        // Validatable Assertion
        validatableResponse.statusCode(200);
//        validatableResponse.body("booking.firstname", Matchers.equalTo("Pramod"));

        // DeSer
        BookingResponse bookingResponse = payloadManager.bookingResponseJava(response.asString());
        // AssertJ
        assertThat(bookingResponse.getBookingid()).isNotNull();
        assertThat(bookingResponse.getBooking().getFirstname()).isNotNull().isNotBlank();
        assertThat(bookingResponse.getBooking().getFirstname()).isEqualTo("Pramod");

        //  Set the booking ID
        iTestContext.setAttribute("bookingid", bookingResponse.getBookingid());


    }

    @Test(groups = "Integration", priority = 2)
    @Owner("promode")
    @Description("TC#INT- Step- 2Verify that the Booking can be Created")
    public void testVerifyBookingId(ITestContext iTestContext) {
        String bookingid = iTestContext.getAttribute("bookingid").toString();
// Get Req
        String basePathGET = APIConstants.CREATE_UPDATE_BOOKING_URL + "/" + bookingid;
        System.out.println(basePathGET);

        requestSpecification.basePath(basePathGET);
        response = RestAssured
                .given(requestSpecification)
                .when().get();

        validatableResponse = response.then().log().all();
        // Validatable Assertion
        validatableResponse.statusCode(200);
        Booking booking = payloadManager.getResponseFromJSON(response.asString());

        // AssertJ

        assertThat(booking.getFirstname()).isNotNull().isNotBlank();
        assertThat(booking.getFirstname()).isEqualTo("Pramod");


    }

    @Test(groups = "Integration", priority = 3)
    @Owner("promode")
    @Description("TC#INT1 - Step-3 Verify that the Booking can be Created")
    public void testUpdateBookingId(ITestContext iTestContext) {
        System.out.println("Token - " + iTestContext.getAttribute("token"));
    String token = iTestContext.getAttribute("token").toString();

        // PUT / PATCH
        String bookingid = iTestContext.getAttribute("bookingid").toString();
        String basePathPUTPATCH = APIConstants.CREATE_UPDATE_BOOKING_URL + "/" + bookingid;
        System.out.println(basePathPUTPATCH);


        requestSpecification.basePath(basePathPUTPATCH);
        response = RestAssured
                .given(requestSpecification).cookie("token", token)
                .when().body(payloadManager.fullUpdatePayloadAsString()).put();
        validatableResponse = response.then().log().all();
        // Validatable Assertion
        validatableResponse.statusCode(200);

        Booking booking = payloadManager.getResponseFromJSON(response.asString());

        assertThat(booking.getFirstname()).isNotNull().isNotBlank();
        assertThat(booking.getFirstname()).isEqualTo("James");
        assertThat(booking.getLastname()).isEqualTo("Dutta");





}

    @Test(groups = "Integration", priority = 4)
    @Owner("promode")
    @Description("TC#INT1 - Step-4 Verify that the Booking can be Created")
    public void testDeleteBookingd(ITestContext iTestContext) {
        System.out.println("Token - " + iTestContext.getAttribute("token"));
        Assert.assertTrue(true);

    }


}

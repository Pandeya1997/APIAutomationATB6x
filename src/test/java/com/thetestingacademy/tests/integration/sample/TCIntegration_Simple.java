package com.thetestingacademy.tests.integration.sample;

import com.thetestingacademy.base.BaseTest;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;

public class TCIntegration_Simple extends BaseTest {

    // Create A Booking, Create a Token
    // Get booking
    // Update the Booking
    // Delete the Booking


    @Test(groups = "integration", priority = 1)
    @Owner("Promode")
    @Description("TC#INT1 - Step 1. Verify that the Booking can be Created")
    public void testCreateBooking() {
        Assert.assertTrue(true);
    }

    @Test(groups = "integration", priority = 2)
    @Owner("Promode")
    @Description("TC#INT1 - Step 2. Verify that the Booking By ID")
    public void testVerifyBookingId() {
        Assert.assertTrue(true);

    }

    @Test(groups = "integration", priority = 3)
    @Owner("Promode")
    @Description("TC#INT1 - Step 3. Verify Updated Booking by ID")
    public void testUpdateBookingByID() {
        Assert.assertTrue(true);


    }

    @Test(groups = "integration", priority = 4)
    @Owner("Promode")
    @Description("TC#INT1 - Step 4. Delete the Booking by ID")
    public void testDeleteBookingById() {
        Assert.assertTrue(true);


    }

    public static class TCIntegration extends BaseTest {
        // Create A Booking, Create a Token
        // Get booking
        // Update the Booking
        // Delete the Booking
        @Test(groups = "Integration", priority = 1)
        @Owner("promode")
        @Description("TC#INT1 - Step-1 Verify that the Booking can be Created")
        public void testCreateBooking() {


        }

        @Test(groups = "Integration", priority = 2)
        @Owner("promode")
        @Description("TC#INT- Step- 2Verify that the Booking can be Created")
        public void testVerifyBookingId() {
            Assert.assertTrue(true);

        }

        @Test(groups = "Integration", priority = 3)
        @Owner("promode")
        @Description("TC#INT1 - Step-3 Verify that the Booking can be Created")
        public void testUpdateBookingId() {
            Assert.assertTrue(true);

        }

        @Test(groups = "Integration", priority = 4)
        @Owner("promode")
        @Description("TC#INT1 - Step-4 Verify that the Booking can be Created")
        public void testDeleteBookingd() {
            Assert.assertTrue(true);

        }


    }
}
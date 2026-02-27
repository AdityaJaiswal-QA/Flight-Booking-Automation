package tests;

import org.testng.annotations.Test;
import pages.PassengerDetailsPage;
import base.BaseClass;
import pages.HomePage;
import pages.FlightSearchPage;
import org.testng.Assert;
import pages.ConfirmationPage;
public class FlightBookingTest extends BaseClass {

	@Test
	public void flightSearchTest() throws InterruptedException {

	    HomePage home = new HomePage(driver);
	    home.selectDepartureCity("Boston");
	    home.selectDestinationCity("London");
	    Thread.sleep(5000);

	    home.clickFindFlights();
	    Thread.sleep(5000);

	    FlightSearchPage flightPage = new FlightSearchPage(driver);
	    flightPage.selectFirstFlight();
	    Thread.sleep(5000);

	    PassengerDetailsPage passenger = new PassengerDetailsPage(driver);
	    passenger.enterPassengerDetails();
	    Thread.sleep(5000);

	    passenger.clickPurchase();
	    Thread.sleep(5000);

	    ConfirmationPage confirm = new ConfirmationPage(driver);

	    String message = confirm.getConfirmationMessage();
	    String id = confirm.getBookingId();

	    System.out.println("Confirmation Message: " + message);
	    System.out.println("Booking ID: " + id);

	    Assert.assertEquals(message, "Thank you for your purchase today!");

	    System.out.println("Flight Booking Completed Successfully");
	}
}
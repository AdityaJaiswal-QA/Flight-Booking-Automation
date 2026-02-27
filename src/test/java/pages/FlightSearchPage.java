package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightSearchPage {

    WebDriver driver;

    public FlightSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    // First "Choose This Flight" button
    By chooseFlightBtn = By.xpath("(//input[@value='Choose This Flight'])[1]");

    public void selectFirstFlight() {
        driver.findElement(chooseFlightBtn).click();
    }
}
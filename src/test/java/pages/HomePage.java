package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By departureCity = By.name("fromPort");
    By destinationCity = By.name("toPort");
    By findFlightsBtn = By.xpath("//input[@value='Find Flights']");

    public void selectDepartureCity(String city) {
        driver.findElement(departureCity).sendKeys(city);
    }

    public void selectDestinationCity(String city) {
        driver.findElement(destinationCity).sendKeys(city);
    }

    public void clickFindFlights() {
        driver.findElement(findFlightsBtn).click();
    }
}
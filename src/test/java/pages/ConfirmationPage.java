package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConfirmationPage {

    WebDriver driver;

    public ConfirmationPage(WebDriver driver) {
        this.driver = driver;
    }

    By confirmationMessage = By.xpath("//h1");
    By bookingId = By.xpath("//td[normalize-space()='Id']/following-sibling::td");

    public String getConfirmationMessage() {
        return driver.findElement(confirmationMessage).getText();
    }

    public String getBookingId() {
        return driver.findElement(bookingId).getText();
    }
}
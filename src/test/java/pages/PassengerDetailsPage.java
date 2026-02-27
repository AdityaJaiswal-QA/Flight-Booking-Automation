package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PassengerDetailsPage {

    WebDriver driver;

    public PassengerDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    By name = By.id("inputName");
    By address = By.id("address");
    By city = By.id("city");
    By cardNumber = By.id("creditCardNumber");
    By purchaseBtn = By.xpath("//input[@value='Purchase Flight']");

    public void enterPassengerDetails() {

        driver.findElement(name).sendKeys("Aditya Jaiswal");
        driver.findElement(address).sendKeys("India Street");
        driver.findElement(city).sendKeys("Mumbai");
        driver.findElement(cardNumber).sendKeys("1234567890123456");
    }

    public void clickPurchase() {
        driver.findElement(purchaseBtn).click();
    }
}
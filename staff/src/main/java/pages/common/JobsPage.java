package pages.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.locators.Locators;
import pages.base.BasePage;

import java.time.Duration;

public class JobsPage extends BasePage {
    public JobsPage(WebDriver driver) {
        super(driver);
    }

    public String SearchJobKeyword() {
        WebElement inputField = driver.findElement(Locators.SEARCH_INPUT_KEYWORD);
        return inputField.getAttribute("value");
    }

    public void searchForJob(String keyword) {
        WebElement inputField = driver.findElement(Locators.SEARCH_INPUT_KEYWORD);
        //inputField.clear();
        inputField.sendKeys(keyword);
        clickSearchButton();
    }

    public void clickSearchButton() {
        WebElement button = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(Locators.SEARCH_BUTTON_JOBS));
        button.click();
    }

    public void moveToCompanies() {
        WebElement companiesElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(Locators.NAVBAR_COMPANIES));
        companiesElement.click();
    }

    public void moveToHome() {
        WebElement homeElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(Locators.NAVBAR_HOME));
        homeElement.click();
    }

    public boolean checkIfActive(){
        boolean isCompaniesActive = new WebDriverWait(driver, Duration.ofSeconds(10))
            .until(ExpectedConditions.attributeContains(Locators.NAVBAR_JOBS_LINK, "class", "active"));
        return isCompaniesActive;
    }


    public String currentURL(){
        return driver.getCurrentUrl();
    }
}

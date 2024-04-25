package pages.common;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.locators.Locators;
import pages.base.BasePage;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchForJob(String keyword) {
        driver.findElement(Locators.SEARCH_INPUT_KEYWORD).sendKeys(keyword);
        clickSearchButton();
    }

    public void clickSearchButton() {
        WebElement button = new WebDriverWait(driver, Duration.ofSeconds(10))
            .until(ExpectedConditions.elementToBeClickable(Locators.SEARCH_BUTTON));
        button.click();
    }

    public void moveToCompanies() {
        WebElement companiesElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(Locators.NAVBAR_COMPANIES_FROM_HOME));
        companiesElement.click();
    }

    //moves to jobs directly without search
    public void moveToJobs() {
        WebElement jobsElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(Locators.NAVBAR_JOBS_FROM_HOME));
        jobsElement.click();
    }

    public String currentURL(){
        return driver.getCurrentUrl();
    }
}

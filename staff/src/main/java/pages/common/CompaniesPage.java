package pages.common;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.locators.Locators;
import pages.base.BasePage;

public class CompaniesPage extends BasePage {
    public CompaniesPage(WebDriver driver) {
        super(driver);
    }

    public void moveToJobs() {
        WebElement companiesElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(Locators.NAVBAR_JOBS));
        companiesElement.click();
    }

    public String checkIfActive(){
        WebElement activeCompaniesLink = new WebDriverWait(driver, Duration.ofSeconds(10))
            .until(ExpectedConditions.elementToBeClickable(Locators.NAVBAR_COMPANIES));
        return activeCompaniesLink.getAttribute("class");
    }

    public String currentURL(){
        return driver.getCurrentUrl();
    }
}

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import constants.messages.AssertionMessages;
import pages.common.CompaniesPage;
import pages.common.HomePage;
import pages.common.JobsPage;

public class StaffAmTests extends BaseTest {
    @Test
    public void testJobSearch() {
        HomePage homePage = new HomePage(driver);
        homePage.searchForJob(AssertionMessages.SEARCH_FOR_JOB);

        JobsPage searchResultPage = new JobsPage(driver);
        searchResultPage.checkIfActive();
        Assert.assertEquals(searchResultPage.SearchJobKeyword(), AssertionMessages.SEARCH_FOR_JOB);
    }

    @Test
    public void testAll() {
        HomePage homePage = new HomePage(driver);
        homePage.searchForJob(AssertionMessages.SEARCH_FOR_JOB);

        JobsPage searchResultPage = new JobsPage(driver);
        searchResultPage.moveToCompanies();

        CompaniesPage companiesPage = new CompaniesPage(driver);
        Assert.assertEquals(companiesPage.currentURL(), AssertionMessages.CURRENT_URL_COMPANIES);
    }

    @Test
    public void testAllReverse() {
        HomePage homePage = new HomePage(driver);
        homePage.moveToCompanies();

        CompaniesPage companiesPage = new CompaniesPage(driver);
        companiesPage.moveToJobs();

        JobsPage jobsPage = new JobsPage(driver);
        jobsPage.checkIfActive();
        Assert.assertEquals(jobsPage.currentURL(), AssertionMessages.CURRENT_URL_JOBS);
    }

    @Test
    public void testHometoJobToHome() {
        HomePage homePage = new HomePage(driver);
        homePage.moveToJobs();

        JobsPage jobsPage = new JobsPage(driver);
        jobsPage.checkIfActive();
        jobsPage.moveToHome();

        homePage = new HomePage(driver);

        Assert.assertEquals(homePage.currentURL(), AssertionMessages.CURRENT_URL_HOME);
    }

    //searched from home page then modifies search in job page
    @Test
    public void testHomeToJobAndSearch() {
        HomePage homePage = new HomePage(driver);
        homePage.searchForJob(AssertionMessages.SEARCH_FOR_JOB);

        JobsPage searchResultPage = new JobsPage(driver);
        searchResultPage.checkIfActive();

        searchResultPage.searchForJob(AssertionMessages.SEARCH_FOR_DIFFERENT_JOB);
        Assert.assertEquals(searchResultPage.SearchJobKeyword(), AssertionMessages.SEARCH_FOR_JOB + AssertionMessages.SEARCH_FOR_DIFFERENT_JOB);

    }

}

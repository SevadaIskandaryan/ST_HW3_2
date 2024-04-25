package constants.locators;

import org.openqa.selenium.By;

public class Locators {
    public static final By SEARCH_INPUT_KEYWORD = By.id("jobsfilter-key_word");
    public static final By SEARCH_BUTTON = By.cssSelector("div.col-lg-3.col-sm-3.search-btn button");

    public static final By SEARCH_BUTTON_JOBS = By.id("btn_search_keyword");

    public static final By NAVBAR_COMPANIES = By.cssSelector("#w2 > li:nth-child(3)");
    public static final By NAVBAR_COMPANIES_LINK = By.cssSelector("#w2 > li:nth-child(3) > a");
    public static final By NAVBAR_JOBS = By.cssSelector("#w2 > li:nth-child(1)");
    public static final By NAVBAR_JOBS_LINK = By.cssSelector("#w2 > li.active");
    public static final By NAVBAR_COMPANIES_FROM_HOME = By.cssSelector("#w1 > li:nth-child(3)");
    public static final By NAVBAR_JOBS_FROM_HOME = By.cssSelector("#w1 > li:nth-child(1)");
    public static final By NAVBAR_HOME = By.cssSelector("#w1 > div.navbar-header > a.navbar-brand.hs_navbar_light_logo");

}

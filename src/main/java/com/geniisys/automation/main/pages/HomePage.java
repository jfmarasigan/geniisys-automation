package com.geniisys.automation.main.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;

import com.geniisys.automation.accounting.main.AccountingMainPage;
import com.geniisys.automation.common.BrowserDriver;
import com.geniisys.automation.marketing.home.pages.MarketingHomePage;
import com.geniisys.automation.underwriting.main.pages.UnderwritingPage;

public class HomePage {

	private BrowserDriver driver;
	private static final Logger LOGGER = LogManager.getLogger(HomePage.class.getName());

	private By underwritingBtnLocator = By.xpath("//div[@id='iconUnderwriting']");
	private By marketingBtnLocator = By.xpath("//div[@id='iconMarketing']");
	private By accountingBtnLocator = By.xpath("//div[@id='iconAccounting']");

	public HomePage(BrowserDriver driver) {
		this.driver = driver;
	}

	public UnderwritingPage goToUnderwritingPage() {
		try {
			driver.findClickableElement(underwritingBtnLocator).click();
			LOGGER.info("Go to Underwriting main page.");
		} catch (TimeoutException e) {
			LOGGER.error(e);
		}
		return new UnderwritingPage(driver);
	}

	public MarketingHomePage goToMarketingPage() {
		try {
			driver.findClickableElement(marketingBtnLocator).click();
			LOGGER.info("Go to Marketing main page");
		} catch (TimeoutException e) {
			LOGGER.error(e);
		}
		return new MarketingHomePage(driver);
	}

	public AccountingMainPage goToAccountingPage() {
		try {
			driver.findClickableElement(accountingBtnLocator).click();
			LOGGER.info("Go to Accounting main page");
		} catch (TimeoutException e) {
			LOGGER.error(e);
		}
		return new AccountingMainPage(driver);
	}
}

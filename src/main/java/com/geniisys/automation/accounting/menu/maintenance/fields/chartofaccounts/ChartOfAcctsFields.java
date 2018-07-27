package com.geniisys.automation.accounting.menu.maintenance.fields.chartofaccounts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.geniisys.automation.common.BrowserDriver;

public class ChartOfAcctsFields {

	private BrowserDriver browserDriver;

	private By glAcctNameFldLocator = By.id("txtGlAcctName");
	private By glAcctSnameFldLocator = By.id("txtGlAcctSname");
	private By refAcctCdFldLocator = By.id("txtRefAcctCd");
	private By slTypeCdFldLocator = By.id("txtGsltSlTypeCd");
	private By leafTagLovLocator = By.id("txtLeafTag");
	private By drCrTagLovLocator = By.id("txtDrCrTag");
	private By acctTypeFldLocator = By.id("txtAcctType");

	private Select leafTagSelect;
	private Select drCrTagSelect;

	public ChartOfAcctsFields(BrowserDriver browserDriver) {
		this.browserDriver = browserDriver;

		this.leafTagSelect = new Select(getLeafTagLovLocator());
		this.drCrTagSelect = new Select(getDrCrTagLovLocator());
	}

	public BrowserDriver getBrowserDriver() {
		return browserDriver;
	}

	public WebElement getGlAcctNameFldLocator() {
		return browserDriver.findClickableElement(glAcctNameFldLocator);
	}

	public WebElement getGlAcctSnameFldLocator() {
		return browserDriver.findClickableElement(glAcctSnameFldLocator);
	}

	public WebElement getRefAcctCdFldLocator() {
		return browserDriver.findClickableElement(refAcctCdFldLocator);
	}

	public WebElement getSlTypeCdFldLocator() {
		return browserDriver.findClickableElement(slTypeCdFldLocator);
	}

	public WebElement getLeafTagLovLocator() {
		return browserDriver.findClickableElement(leafTagLovLocator);
	}

	public WebElement getDrCrTagLovLocator() {
		return browserDriver.findClickableElement(drCrTagLovLocator);
	}

	public WebElement getAcctTypeFldLocator() {
		return browserDriver.findClickableElement(acctTypeFldLocator);
	}

	public Select getLeafTagSelect() {
		return leafTagSelect;
	}

	public Select getDrCrTagSelect() {
		return drCrTagSelect;
	}

}

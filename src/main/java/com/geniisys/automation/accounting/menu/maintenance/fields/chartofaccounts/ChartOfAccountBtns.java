package com.geniisys.automation.accounting.menu.maintenance.fields.chartofaccounts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.geniisys.automation.common.BrowserDriver;

public class ChartOfAccountBtns {

	private BrowserDriver browserDriver;

	private By copyBtnLocator = By.id("btnCopy");
	private By addUpdateBtnLocator = By.id("btnAdd");
	private By deleteBtnLocator = By.id("btnDelete");

	private By addNextLevelBtnLocator = By.id("btnAddNextLevel");
	private By addSameLevelBtnLocator = By.id("btnAddSameLevel");
	private By printBtnLocator = By.id("btnPrintChartOfAcct");

	public ChartOfAccountBtns(BrowserDriver browserDriver) {
		this.browserDriver = browserDriver;
	}

	public BrowserDriver getBrowserDriver() {
		return browserDriver;
	}

	public WebElement getCopyBtnLocator() {
		return browserDriver.findClickableElement(copyBtnLocator);
	}

	public WebElement getAddUpdateBtnLocator() {
		return browserDriver.findClickableElement(addUpdateBtnLocator);
	}

	public WebElement getDeleteBtnLocator() {
		return browserDriver.findClickableElement(deleteBtnLocator);
	}

	public WebElement getAddNextLevelBtnLocator() {
		return browserDriver.findClickableElement(addNextLevelBtnLocator);
	}

	public WebElement getAddSameLevelBtnLocator() {
		return browserDriver.findClickableElement(addSameLevelBtnLocator);
	}

	public WebElement getPrintBtnLocator() {
		return browserDriver.findClickableElement(printBtnLocator);
	}

}

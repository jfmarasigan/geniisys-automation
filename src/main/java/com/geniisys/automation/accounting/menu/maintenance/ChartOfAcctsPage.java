package com.geniisys.automation.accounting.menu.maintenance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.geniisys.automation.accounting.menu.maintenance.fields.chartofaccounts.ChartOfAcctsGLFields;
import com.geniisys.automation.common.BrowserDriver;
import com.geniisys.automation.common.Page;

public class ChartOfAcctsPage extends Page {
	
	private By queryLevelLovLocator = By.id("selQueryLevel");
	private Select queryLevelSelect;
	
	private ChartOfAcctsGLFields glFields;

	public ChartOfAcctsPage(BrowserDriver browserDriver) {
		this.browserDriver = browserDriver;
		this.queryLevelSelect = new Select(getQueryLevelLov());
		this.glFields = new ChartOfAcctsGLFields(browserDriver);
	}

	public WebElement getQueryLevelLov() {
		return browserDriver.findClickableElement(queryLevelLovLocator);
	}
	
	public Select getQueryLevelSelect() {
		return queryLevelSelect;
	}
	
	public ChartOfAcctsPage clearGLFields() {
		this.glFields.clearGLFields();
		logger.info("GL Number fields cleared.");
		return this;
	}
}

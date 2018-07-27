package com.geniisys.automation.accounting.menu;

import org.openqa.selenium.By;

import com.geniisys.automation.accounting.menu.maintenance.ChartOfAcctsPage;
import com.geniisys.automation.common.BrowserDriver;
import com.geniisys.automation.common.Page;

public class MaintenanceMenu extends Page {

	private By chartOfAcctsMenuLocator = By.id("chartOfAccounts");
	
	public MaintenanceMenu(BrowserDriver browserDriver) {
		this.browserDriver = browserDriver;
	}
	
	// forward to GIACS311 - Chart of Accounts
	public ChartOfAcctsPage toChartOfAcctsMaintenance() {
		browserDriver.findClickableElement(chartOfAcctsMenuLocator).click();
		logger.info("Chart of Accounts maintenance menu clicked.");
		return new ChartOfAcctsPage(browserDriver);
	}
}

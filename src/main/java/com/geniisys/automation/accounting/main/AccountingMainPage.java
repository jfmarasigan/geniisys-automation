package com.geniisys.automation.accounting.main;

import org.openqa.selenium.By;

import com.geniisys.automation.accounting.menu.MaintenanceMenu;
import com.geniisys.automation.common.BrowserDriver;
import com.geniisys.automation.common.Page;

public class AccountingMainPage extends Page {
		
	private By maintenanceMenuLocator = By.id("menuMaintenance");
	
	public AccountingMainPage(BrowserDriver browserDriver) {
		this.browserDriver = browserDriver;
	}
	
	public MaintenanceMenu goToACMaintenancePage() {
		logger.info("Accounting maintenance menu clicked.");
		browserDriver.findClickableElement(maintenanceMenuLocator).click();
		return new MaintenanceMenu(browserDriver);
	}
}

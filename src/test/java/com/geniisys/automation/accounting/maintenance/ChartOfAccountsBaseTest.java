package com.geniisys.automation.accounting.maintenance;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.geniisys.automation.BaseTest;
import com.geniisys.automation.main.pages.HomePage;

public class ChartOfAccountsBaseTest extends BaseTest {
	
	private SoftAssert softAssert;
	
	@BeforeClass
	public void beforeTest() {
		softAssert = new SoftAssert();
		new HomePage(driver).goToAccountingPage().goToACMaintenancePage().toChartOfAcctsMaintenance();
	}
	
	@Test
	public void pageSuccessfullyLoadedTest() {
		String title = driver.getTitle();
		String expected = "GENIISYS - General Insurance Information System - [Chart of Accounts Maintenance]";

		softAssert.assertEquals(title, expected);
		softAssert.assertAll();
	}

}

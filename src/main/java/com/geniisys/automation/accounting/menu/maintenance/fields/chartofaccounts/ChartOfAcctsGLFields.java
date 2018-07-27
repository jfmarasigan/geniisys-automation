package com.geniisys.automation.accounting.menu.maintenance.fields.chartofaccounts;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.geniisys.automation.common.BrowserDriver;

public class ChartOfAcctsGLFields {

	private BrowserDriver browserDriver;

	private By glAcctCategoryFldLocator = By.id("glAcctCategory");
	private By glControlAcctFldLocator = By.id("glControlAcct");
	private By glSubAcct1FldLocator = By.id("glSubAcct1");
	private By glSubAcct2FldLocator = By.id("glSubAcct2");
	private By glSubAcct3FldLocator = By.id("glSubAcct3");
	private By glSubAcct4FldLocator = By.id("glSubAcct4");
	private By glSubAcct5FldLocator = By.id("glSubAcct5");
	private By glSubAcct6FldLocator = By.id("glSubAcct6");
	private By glSubAcct7FldLocator = By.id("glSubAcct7");

	private Map<String, WebElement> fields = new HashMap<>();

	public ChartOfAcctsGLFields(BrowserDriver browserDriver) {
		this.browserDriver = browserDriver;

		fields.put("glAcctCategory", getGlAcctCategoryFld());
		fields.put("glControlAcct", getGlControlAcctFld());
		fields.put("glSubAcct1", getGlSubAcct1Fld());
		fields.put("glSubAcct2", getGlSubAcct2Fld());
		fields.put("glSubAcct3", getGlSubAcct3Fld());
		fields.put("glSubAcct4", getGlSubAcct4Fld());
		fields.put("glSubAcct5", getGlSubAcct5Fld());
		fields.put("glSubAcct6", getGlSubAcct6Fld());
		fields.put("glSubAcct7", getGlSubAcct7Fld());
	}

	public WebElement getGlAcctCategoryFld() {
		return browserDriver.findClickableElement(glAcctCategoryFldLocator);
	}

	public WebElement getGlControlAcctFld() {
		return browserDriver.findClickableElement(glControlAcctFldLocator);
	}

	public WebElement getGlSubAcct1Fld() {
		return browserDriver.findClickableElement(glSubAcct1FldLocator);
	}

	public WebElement getGlSubAcct2Fld() {
		return browserDriver.findClickableElement(glSubAcct2FldLocator);
	}

	public WebElement getGlSubAcct3Fld() {
		return browserDriver.findClickableElement(glSubAcct3FldLocator);
	}

	public WebElement getGlSubAcct4Fld() {
		return browserDriver.findClickableElement(glSubAcct4FldLocator);
	}

	public WebElement getGlSubAcct5Fld() {
		return browserDriver.findClickableElement(glSubAcct5FldLocator);
	}

	public WebElement getGlSubAcct6Fld() {
		return browserDriver.findClickableElement(glSubAcct6FldLocator);
	}

	public WebElement getGlSubAcct7Fld() {
		return browserDriver.findClickableElement(glSubAcct7FldLocator);
	}

	public Map<String, WebElement> getFields() {
		return this.fields;
	}

	public void clearGLFields() {
		Set<String> keys = fields.keySet();
		for (String key : keys) {
			fields.get(key).clear();
		}
	}

	public void setGLFields() {
		// set value for gl fields
		clearGLFields();
	}

}

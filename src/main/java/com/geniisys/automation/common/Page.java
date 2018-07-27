package com.geniisys.automation.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

/**
 * abstract representation of a page
 * */
public abstract class Page {
	
	/**
	 * no need to declare logger for child class
	 * */
	protected Logger logger = LogManager.getLogger(getClass());
	protected BrowserDriver browserDriver;
	
	protected By moduleIdLblLocator = By.xpath("//label[@id='lblModuleId']");
	protected By homeLocator = By.xpath("//a[@id='footerHome']");
	
	// add page utils if any
}

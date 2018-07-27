package com.geniisys.automation.common.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.geniisys.automation.common.BrowserDriver;

/**
 * class to handle exceptions in browser driver instead of using RuntimeException
 * */
public class BrowserDriverException extends RuntimeException {
	
	private Logger logger = LogManager.getLogger(BrowserDriver.class.getName());;
	private static final long serialVersionUID = 9169911956768653584L;

	public BrowserDriverException (String message) {
		super(message);
		logger.error(message);
	}
	
	public BrowserDriverException (String message, Throwable cause) {
		super(message, cause);
		logger.error(message);
	}
}

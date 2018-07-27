package com.geniisys.automation.common;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

import org.openqa.selenium.By;

import ru.yandex.qatools.htmlelements.element.Select;

public class DatePicker {
	
	private BrowserDriver driver;
	private static final By MONTH_LOV_LOCATOR = By.xpath("//select[@id='scwMonths']");
	private static final By YEAR_LOV_LOCATOR = By.xpath("//select[@id='scwYears']");
	
	public DatePicker(BrowserDriver driver) {
		this.driver = driver;
	}
	
	public void setDate(By locator, String date) {
		driver.findClickableElement(locator).click();
		setMonth(extractMonth(date));
		setYear(extractYear(date));
		setDay(extractDay(date).toString());
	}
	
	public void setYear(String year) {
		Select yearLov = new Select(driver.findElement(YEAR_LOV_LOCATOR));
		yearLov.click();
		yearLov.selectByValue(year);
	}
	
	public void setMonth(String month) {
		Select monthLov = new Select(driver.findElement(MONTH_LOV_LOCATOR));
		monthLov.click();
		monthLov.selectByValue(month);
	}
	
	public void setDay(String day) {
		driver.findElement(By.xpath("//td[@class='scwCells'"
				+ " and contains(text(), '"
				+ day
				+ "')]")).click();
	}
	
	private String extractYear(String date) {
		return date.substring(6);
	}
	
	private String extractMonth(String date) {
		Integer month = Integer.valueOf(date.substring(0, 2));
		return Month.of(month).getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
	}
	
	private Integer extractDay(String date) {
		return Integer.valueOf(date.substring(3, 5));
	}
 
}

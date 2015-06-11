package com.softserve.edu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class WeatherPage {

	private WebDriver driver = new FirefoxDriver();
	
	private String morningTemperature;
	private String morningCondition;
	private String dayTemperature;
	private String dayCondition;
	private String midnightTemperature;
	private String midnightCondition;
	private String nightTemperature;
	private String nightCondition;
	
	
	public WeatherPage() {
		
		driver.get("http://weather.i.ua/");
		this.morningTemperature = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/table[1]/tbody/tr[2]/td[1]/big")).getText();
		this.morningCondition = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/table[1]/tbody/tr[2]/td[1]/small")).getText();
		this.dayTemperature = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/table[1]/tbody/tr[2]/td[2]/big")).getText();
		this.dayCondition = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/table[1]/tbody/tr[2]/td[2]/small")).getText();
		this.midnightTemperature = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/table[1]/tbody/tr[2]/td[3]/big")).getText();
		this.midnightCondition = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/table[1]/tbody/tr[2]/td[3]/small")).getText();
		this.nightTemperature = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/table[1]/tbody/tr[2]/td[4]/big")).getText();
		this.nightCondition = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/table[1]/tbody/tr[2]/td[4]/small")).getText();
	}
	
	public String getFormatedWeather() {
		String message = "<!DOCTYPE html>" +
				"<html>" +
				"<body>" +
				"<table style='width:100%'>" +
					"<tr>" +
						"<td>Ранок</td>" + "<td>Обід</td>" + "<td>Вечір</td>" + "<td>Ніч</td>" +
					"</tr>" +
					"<tr>" +
						"<td>" + morningTemperature + "</td>" +
						"<td>" + dayTemperature + "</td>" +
						"<td>" + midnightTemperature + "</td>" +
						"<td>" + nightTemperature + "</td>" +
					"</tr>" +
						"<td>" + morningCondition + "</td>" +
						"<td>" + dayCondition + "</td>" +
						"<td>" + midnightCondition + "</td>" +
						"<td>" + nightCondition + "</td>" +
					"</tr>" +
				"</table>" +
				"</body>" +
				"</html>";
		
		return message;
		
//		return morningTemperature + morningCondition +
//				dayTemperature + dayCondition +
//				midNinghtTemperature + midNightCondition +
//				nightTemperature + nightCondition;
	}

}


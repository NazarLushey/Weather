package com.softserve.edu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By.ByLinkText;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.softserve.edu.SendMail;




public class ReadWeather {
	
	private WebDriver driver;

	@BeforeClass
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
	}

	@Test
	public void Read() throws Exception {
		driver.get("http://weather.i.ua/");
		
		
	}

//	@AfterTest
	public void tearDown() throws Exception {
		driver.quit();
	}


}

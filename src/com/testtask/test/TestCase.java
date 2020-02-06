package com.testtask.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class TestCase {

	protected WebDriver driver;

	public void init(final String url) {
		System.setProperty("webdriver.chrome.driver", "..\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}

	@AfterSuite()
	public void tearDown() {
		driver.close();
	}

}

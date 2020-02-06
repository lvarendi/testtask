package com.testtask.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CatalogPage {

	public static WebElement getCatalog(final WebDriver driver) {
		return driver.findElement(By.className("col-sm-10"));
	}

}

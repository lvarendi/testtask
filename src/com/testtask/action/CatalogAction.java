package com.testtask.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.testtask.page.CatalogPage;

public class CatalogAction {

	private WebDriver driver;

	public CatalogAction(WebDriver driver) {
		this.driver = driver;
	}

	public String getLastAddedBook() {
		return CatalogPage.getCatalog(driver).findElement(By.xpath("//div[@class=\"col-sm-10\"]/li[last()]")).getText();
	}

}

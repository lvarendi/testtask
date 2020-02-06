package com.testtask.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateNewBookPage {

	public static WebElement getSubmitButton(final WebDriver driver) {
		return driver.findElement(By.className("btn-primary"));
	}

	public static WebElement getTitle(final WebDriver driver) {
		return driver.findElement(By.id("title"));
	}

	public static Select getAuthor(final WebDriver driver) {
		return new Select(driver.findElement(By.id("author")));
	}

	public static WebElement getSummary(final WebDriver driver) {
		return driver.findElement(By.id("summary"));
	}

	public static WebElement getIsbn(final WebDriver driver) {
		return driver.findElement(By.id("isbn"));
	}

	public static WebElement getIsNonFiction(final WebDriver driver) {
		return driver.findElement(By.id("5b6714c73809970014e31c99"));
	}

	public static WebElement getIsFiction(final WebDriver driver) {
		return driver.findElement(By.id("5b6714c93809970014e31c9a"));
	}

}

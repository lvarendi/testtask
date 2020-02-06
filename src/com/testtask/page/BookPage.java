package com.testtask.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookPage {

	public static WebElement getTitle(final WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div/div/div[2]/h1"));
	}

	public static WebElement getAuthor(final WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div/div/div[2]/p[1]/a"));
	}

	public static WebElement getSummary(final WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div/div/div[2]/p[2]"));
	}

	public static WebElement getIsbn(final WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div/div/div[2]/p[3]"));
	}

	public static WebElement getGenre(final WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/div/div/div[2]/p[4]"));
	}

}

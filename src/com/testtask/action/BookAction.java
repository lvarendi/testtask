package com.testtask.action;

import org.openqa.selenium.WebDriver;
import com.testtask.page.BookPage;

public class BookAction {

	private WebDriver driver;

	public BookAction(WebDriver driver) {
		this.driver = driver;
	}

	public String getTitle() {
		return BookPage.getTitle(driver).getText();
	}

	public String getAuthor() {
		return BookPage.getAuthor(driver).getText();
	}

	public String getSummary() {
		return BookPage.getSummary(driver).getText();
	}

	public String getIsbn() {
		return BookPage.getIsbn(driver).getText();
	}

	public boolean getIsFiction() {
		return BookPage.getGenre(driver).getText().contains("Fiction");
	}

	public boolean getIsNonFiction() {
		return BookPage.getGenre(driver).getText().contains("Non-fiction");
	}

}

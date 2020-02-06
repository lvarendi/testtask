package com.testtask.action;

import org.openqa.selenium.WebDriver;
import com.testtask.page.CreateNewBookPage;

public class CreateNewBookAction {

	private WebDriver driver;

	public CreateNewBookAction(WebDriver driver) {
		this.driver = driver;
	}

	public void createBook(String title, String author, String summary, String isbn, boolean isFiction,
			boolean isNonFiction) {
		CreateNewBookPage.getTitle(driver).sendKeys(title);
		CreateNewBookPage.getAuthor(driver).selectByVisibleText(author);
		CreateNewBookPage.getSummary(driver).sendKeys(summary);
		CreateNewBookPage.getIsbn(driver).sendKeys(isbn);
		if (isFiction) {
			CreateNewBookPage.getIsFiction(driver).click();
		}
		if (isNonFiction) {
			CreateNewBookPage.getIsNonFiction(driver).click();
		}
		CreateNewBookPage.getSubmitButton(driver).click();
	}

}

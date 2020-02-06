package com.testtask.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.testtask.action.BookAction;
import com.testtask.action.CreateNewBookAction;

public class CreateNewBookTestCase extends TestCase {

	private final String URL = "https://raamatukogu.herokuapp.com/catalog/book/create";

	@BeforeTest
	public void setUp() {
		init(URL);
	}

	@DataProvider(name = "new-book")
	public Object[][] createTestDataForNewBook() {
		return new Object[][] { { "New Book", "London, Jack", "Quick summary", "ISBN13", true, true },
				{ "New Book 2", "King, Stephen", "Summary", "ISBN1", false, false },
				{ "New Book 3", "Carroll, Lewis", "Quick", "ISBN", true, false } };
	}

	@Test(dataProvider = "new-book")
	public void testCreateNewBook(String title, String author, String summary, String isbn, boolean isFiction,
			boolean isNonFiction) {
		driver.get(URL);
		CreateNewBookAction createNewBookAction = new CreateNewBookAction(driver);
		createNewBookAction.createBook(title, author, summary, isbn, isFiction, isNonFiction);
		BookAction bookAction = new BookAction(driver);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(bookAction.getTitle(), "Title: " + title);
		softAssert.assertEquals(bookAction.getAuthor(), author);
		softAssert.assertEquals(bookAction.getSummary(), "Summary: " + summary);
		softAssert.assertEquals(bookAction.getIsbn(), "ISBN: " + isbn);
		softAssert.assertEquals(bookAction.getIsFiction(), isFiction);
		softAssert.assertEquals(bookAction.getIsNonFiction(), isNonFiction);
		softAssert.assertAll();
	}

	@AfterTest
	public void tearDown() {
		super.tearDown();
	}

}

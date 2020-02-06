package com.testtask.test;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.testtask.action.CatalogAction;
import com.testtask.action.CreateNewBookAction;

public class NewBookExistsInCatalogueTestCase extends TestCase {

	private final String CREATEBOOKURL = "https://raamatukogu.herokuapp.com/catalog/book/create";
	private final String CATALOGURL = "https://raamatukogu.herokuapp.com/catalog/books";

	@BeforeTest
	public void setUp() {
		init(CREATEBOOKURL);
	}

	@DataProvider(name = "new-book")
	public Object[][] createTestDataForNewBook() {
		return new Object[][] { { "My Book", "London, Jack", "Good Book", "10", true, true } };
	}

	@Test(dataProvider = "new-book")
	public void testNewBookExistsInCatalogue(String title, String author, String summary, String isbn,
			boolean isFiction, boolean isNonFiction) {
		CreateNewBookAction createNewBookAction = new CreateNewBookAction(driver);
		createNewBookAction.createBook(title, author, summary, isbn, isFiction, isNonFiction);
		driver.get(CATALOGURL);
		CatalogAction catalogAction = new CatalogAction(driver);
		Assert.assertEquals(catalogAction.getLastAddedBook(), title + " (" + author + ")");
	}

	@AfterTest
	public void tearDown() {
		super.tearDown();
	}

}

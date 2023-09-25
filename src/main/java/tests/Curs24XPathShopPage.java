package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import utils.BaseTest;

public class Curs24XPathShopPage extends BaseTest{

	//@Test(priority=1)
	public void selectBookShopPage() throws InterruptedException {
		app.click(app.homePage.chosenBook);
		System.out.println(app.returnElement(app.stormBook.bookTitle).isDisplayed());
		System.out.println(app.returnElement(app.stormBook.stormBookPrice).isDisplayed());
		System.out.println(app.returnElement(app.stormBook.stormBookAddMoreItems).isDisplayed());
		System.out.println(app.returnElement(app.stormBook.stormBookRemoveItems).isDisplayed());
		System.out.println(app.returnElement(app.stormBook.stormBookItems).isDisplayed());
		System.out.println(app.returnElement(app.stormBook.stormBookAddToCart).isDisplayed());
		app.click(app.stormBook.stormBookAddMoreItems);
		app.getElementText(app.stormBook.stormBookItems);
		Thread.sleep(3000);
		app.click(app.stormBook.stormBookRemoveItems);
		app.getElementText(app.stormBook.stormBookItems);
		Thread.sleep(3000);
	}
	
	@Test(priority=2)
	public void selectBookShopPageRefactored() {
		app.click(app.homePage.chosenBook);
		assertTrue(app.verifyIfDisplayed(app.stormBook.bookTitle));
		assertTrue(app.verifyIfDisplayed(app.stormBook.stormBookPrice));
		assertTrue(app.verifyIfDisplayed(app.stormBook.stormBookAddMoreItems));
		assertTrue(app.verifyIfDisplayed(app.stormBook.stormBookRemoveItems));
		assertTrue(app.verifyIfDisplayed(app.stormBook.stormBookItems));
		assertTrue(app.verifyIfDisplayed(app.stormBook.stormBookAddToCart));
		/*
		System.out.println(app.verifyIfDisplayed(app.stormBook.stormBookPrice));
		System.out.println(app.verifyIfDisplayed(app.stormBook.stormBookAddMoreItems));
		System.out.println(app.verifyIfDisplayed(app.stormBook.stormBookRemoveItems));
		System.out.println(app.verifyIfDisplayed(app.stormBook.stormBookItems));
		System.out.println(app.verifyIfDisplayed(app.stormBook.stormBookAddToCart));
		*/
	}
}

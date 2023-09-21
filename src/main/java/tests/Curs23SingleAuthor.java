package tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.MenuPage;
import pages.SingleAuthor;
import utils.BaseTest;
import utils.SeleniumWrappers;
public class Curs23SingleAuthor extends BaseTest{

	@Test(priority=1)
	public void checkPercentages() {
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.singleAuthorLink);
		//app.menu.navigateTo pt ca avem o instanta a paginii MenuPage in BasePage
			
		SingleAuthor author = new SingleAuthor(driver);	
		//instantiem obiectul pentru explicit wait, trebuie sa asteptam ca procentele sa se incarce in pagina si avem ca si conditie ca obiectul sa existe in pagina si sa fie populat
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//check drama percentage
		wait.until(ExpectedConditions.textToBePresentInElementLocated(author.dramaSlider,"95%"));	
		System.out.println(app.getElementText(author.dramaSlider));
		assertEquals(app.getElementText(author.dramaSlider), "95%");
		//putem folosi assertEquals(author.getElementText(author.dramaSlider), "95%"); daca singlePageAuthor class mosteneste SeleniumWrappers
		//check biography percentage
		wait.until(ExpectedConditions.textToBePresentInElementLocated(author.biographySlider,"75%"));
		System.out.println(app.getElementText(author.biographySlider));
		assertEquals(app.getElementText(author.biographySlider), "75%");
		//check cookbook percentage
		wait.until(ExpectedConditions.textToBePresentInElementLocated(author.cookBooksSlider,"82%"));
		System.out.println(app.getElementText(author.cookBooksSlider));
		assertEquals(app.getElementText(author.cookBooksSlider), "82%");
	}
		
		@Test(priority=2)
		public void checkPercentages2() {
			app.menu.navigateTo(app.menu.singleAuthorLink);
			// app.click(app.menu.singleAuthorLink); -> face acelasi lucru cu linia de mai sus				
			//instantiem obiectul pentru explicit wait, trebuie sa asteptam ca procentele sa se incarce in pagina si avem ca si conditie ca obiectul sa existe in pagina si sa fie populat
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			//check drama percentage
			wait.until(ExpectedConditions.textToBePresentInElementLocated(app.author.dramaSlider,"95%"));	
			System.out.println(app.getElementText(app.author.dramaSlider));
			assertEquals(app.getElementText(app.author.dramaSlider), "95%");
			//putem folosi assertEquals(author.getElementText(author.dramaSlider), "95%"); daca singlePageAuthor class mosteneste SeleniumWrappers
			//check biography percentage
			wait.until(ExpectedConditions.textToBePresentInElementLocated(app.author.biographySlider,"75%"));
			System.out.println(app.getElementText(app.author.biographySlider));
			assertEquals(app.getElementText(app.author.biographySlider), "75%");
			//check cookbook percentage
			wait.until(ExpectedConditions.textToBePresentInElementLocated(app.author.cookBooksSlider,"82%"));
			System.out.println(app.getElementText(app.author.cookBooksSlider));
			assertEquals(app.getElementText(app.author.cookBooksSlider), "82%");			
	}
}

package tests;

import static org.testng.Assert.assertThrows;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.BlogPage;
import utils.BaseTest;

public class Curs26BlogClassics extends BaseTest {
	
	@Test
	public void selectBlogClassics() {
		//navigam catre pagina BlogLink > classic si dam scroll pana la searchBox
		app.menu.hoverElement(app.menu.blogLink);
		app.click(app.blogPage.classicCategory);
		app.scrollVertically(1100);
		
		BlogPage blogPage = new BlogPage(driver);
		WebElement element = driver.findElement(blogPage.searchClassicBlog);
		// ??? de ce clasa actions nu merge cu app.blogPage.searchClassicBlog direct
		Actions action = new Actions(driver);
		action.moveToElement(element).sendKeys(element, "Why I won't stop buying books").sendKeys(Keys.ENTER).perform();
		app.click(app.blogPage.whyIwontStopBuyingBlog);
		//verificam categoriile displayed
		assertTrue(app.verifyIfDisplayed(app.blogPage.whyIwontStopBuyingBlogClassic));
		assertTrue(app.verifyIfDisplayed(app.blogPage.whyIwontStopBuyingBlogNews));
		assertTrue(app.verifyIfDisplayed(app.blogPage.whyIwontStopBuyingBlogRecommend));
		
	}

}

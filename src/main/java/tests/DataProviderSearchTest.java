package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.*;

public class DataProviderSearchTest extends BaseTest{

	
	@Test(dataProviderClass = DataProviderClass.class, dataProvider = "booksnamesDataProvider") //fiindca dataProvider nu se mai afla in acelasi pachet, trebuie sa mentionam de unde o luam
	public void testBookPictures(String numeCarte, String pozaCarte) throws InterruptedException {
		
		app.menu.search(numeCarte);
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.cssSelector("div[data-image*='"+pozaCarte+"']"));
		assertTrue(element.isDisplayed());
				
	}
}

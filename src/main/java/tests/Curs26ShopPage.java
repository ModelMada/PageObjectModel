package tests;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class Curs26ShopPage extends BaseTest {

	@Test
	public void checkShopCategories() throws InterruptedException {
		app.menu.navigateTo(app.menu.shopLink);
		app.scrollVertically(800);
		Thread.sleep(3000);
		app.click(app.shop.cookbooksCategory);
		
		//e o carte fara SALE
		List<WebElement> cookingBooks = driver.findElements(By.xpath("//a[contains(@class,'hover_icon_link')]"));
		for(WebElement element : cookingBooks) {
			assertEquals(element.getText(), "SALE!");
			System.out.println(element.getText());
		}
	}
}

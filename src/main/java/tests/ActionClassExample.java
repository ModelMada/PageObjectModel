package tests;

import org.testng.annotations.Test;

import pages.MenuPage;
import utils.BaseTest;
import pages.ShopPage;

public class ActionClassExample extends BaseTest {

	@Test(priority=1)
	public void hoverExample() {
		MenuPage menu = new MenuPage(driver);
		menu.hoverElement(menu.aboutLink);
		menu.hoverElement(menu.blogLink);
		menu.navigateTo(menu.shopLink);
	}
	
	@Test(priority=2)
	public void dragAndDropExample() {
		ShopPage shop = new ShopPage(driver);
		shop.dragAndDropSlider(shop.priceSliderInitialPosition, 100, 0);
		
	}
}

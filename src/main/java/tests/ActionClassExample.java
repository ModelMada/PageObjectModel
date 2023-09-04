package tests;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.ContactsPage;
import pages.LoginPage;
import pages.MenuPage;
import utils.BaseTest;
import pages.ShopPage;

public class ActionClassExample extends BaseTest {

	//@Test(priority=1)
	public void hoverExample() {
		MenuPage menu = new MenuPage(driver);
		menu.hoverElement(menu.aboutLink);
		menu.hoverElement(menu.blogLink);
		menu.navigateTo(menu.shopLink);
	}
	
	//@Test(priority=2)
	public void dragAndDropExample() throws InterruptedException {
		ShopPage shop = new ShopPage(driver);
		//shop.dragAndDropSlider(shop.priceSliderInitialPosition, 100, 0);
		shop.dragAndDropSlider(shop.priceSliderFinalPosition, -100, 0);
		shop.dragAndDropElement(shop.priceSliderInitialPosition, shop.priceSliderFinalMoved);
		
	}
	
	//@Test
	public void actionScroll() throws InterruptedException {
		Actions action = new Actions(driver);
		action.scrollByAmount(0, 2000).perform();
		Thread.sleep(2000);
		action.scrollByAmount(0, -2000).perform();
		Thread.sleep(2000);
	}
	
	//@Test(priority=1)
	public void sendKeysExample() throws InterruptedException {
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.contactLink);
		ContactsPage contacts = new ContactsPage(driver);
		contacts.sendKeysWithCaps(contacts.nameField, "abracadabra");
		Thread.sleep(3000);
	}
	
	//@Test(priority=2)
	public void sendKeysExample2() throws InterruptedException {
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.contactLink);
		ContactsPage contacts = new ContactsPage(driver);
		WebElement element = driver.findElement(contacts.nameField);
		Actions action = new Actions(driver);
		action.moveToElement(element).sendKeys(element,"nume").sendKeys(Keys.TAB,"email@email.com").sendKeys(Keys.TAB,"My subject").
		sendKeys(Keys.TAB,"My message").pause(Duration.ofSeconds(2)).sendKeys(Keys.TAB,Keys.ENTER).perform();
	}
	
	@Test
	public void copyPasteExample() {
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.loginLink);
		
		LoginPage login = new LoginPage(driver);
		WebElement username = driver.findElement(login.usernameField);
		WebElement password = driver.findElement(login.passwordField);
		username.sendKeys("TestUser");
		
		//selectez textul pe care vreau sa il copiez
		//pe MAC nu avem tasta control
		//Keys ctrlKey = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAD : Keys.COnTROL;
		//selectie cu CTRL + A
		
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
		action.moveToElement(password).click().pause(Duration.ofSeconds(2)).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).pause(Duration.ofSeconds(2)).perform();
		System.out.println(password.getAttribute("value"));
	}
}


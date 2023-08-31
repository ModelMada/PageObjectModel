package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.MenuPage;

import utils.BaseTest;

public class XpathExample3 extends BaseTest {

	@Test
	public void xpathExample() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.shopLink);
		
		//--> //bdi[contains(text(),'20.55')]
		//--> //span[@class='price']/span[bdi='$14.99'] bdi este copilul lui span si fiidca nu folosim contains text, trebuie sa luam valoarea absoluta din interfata, nu textul de pe bdi
		//scroll down 1200
		jse.executeScript("window.scrollBy(0,1200)"); //scroll 1200 pixeli

		WebElement price14_99 = driver.findElement(By.xpath("//span[@class='price']/span[bdi='$14.99']"));
		//scroll to element
		jse.executeScript("arguments[0].scrollIntoView()",price14_99);
		jse.executeScript("arguments[0].setAttribute('style', 'background: orange;border:4px solid blue')", price14_99);
		
		
		//--> //bdi[contains(text(), '10.35')]/../../../del/child::*/bdi
		// .. -> merge inapoi un nivel (urca pe parinte)
		
		WebElement price11_50 = driver.findElement(By.xpath("//bdi[contains(text(), '10.35')]/../../../del/child::*/bdi"));
		jse.executeScript("arguments[0].setAttribute('style', 'background: purple;border:4px solid pink')", price11_50);
		
		}
}

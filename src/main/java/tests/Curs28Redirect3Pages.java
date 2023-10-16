package tests;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utils.BaseTest;
import utils.SeleniumWrappers;

public class Curs28Redirect3Pages extends SeleniumWrappers{
	
	@Test	
	public void checkRedirect() throws InterruptedException {
		app.homePage.click(app.homePage.facebookIcon);
		System.out.println("Current window: " + driver.getWindowHandle());
		Thread.sleep(5000);
		List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());	
		System.out.println(browserTabs);

		//FACEBOOK CLICK
		driver.switchTo().window(browserTabs.get(1));
		System.out.println("Current window after tab is opened: " + driver.getWindowHandle());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@aria-label,'Allow all cookies') and @tabindex = '0']")).click();
		assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/keytraining.ro");
		driver.close();
		
		//BACK TO BOOKS AD TWITTER CLICK
		driver.switchTo().window(browserTabs.get(0));
		app.homePage.click(app.homePage.twitterIcon);
		Thread.sleep(2000);
		//ramane agatatat la facebook, asa ca trebuie sa intru in array iar
		browserTabs = new ArrayList<>(driver.getWindowHandles());	
		System.out.println(browserTabs);
		System.out.println("---2---Current window after tab is opened: " + driver.getWindowHandle());
		driver.switchTo().window(browserTabs.get(1));
		System.out.println(driver.getCurrentUrl());
		assertEquals(driver.getCurrentUrl(), "https://twitter.com/");
		driver.close();
		
		//BACK TO BOOKS AD INSTAGRAM CLICK
		driver.switchTo().window(browserTabs.get(0));
		Thread.sleep(5000);
		app.homePage.click(app.homePage.instagramIcon);
		browserTabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(browserTabs.get(1));
		//driver.findElement(By.xpath("//button[contains(text(),'Allow all cookies')]")).click();
		assertEquals(driver.getCurrentUrl(), "https://www.instagram.com/");
		driver.close();
		
	}

}

package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import utils.BaseTest;

public class JavascriptExecutorExample extends BaseTest {

	//@Test(priority=1)
	public void example1() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//navigate to URL -> cele doua de mai jos fac acelasi luccru
		
		//driver.get("URL");
		//driver.navigate().to("URL");
		
		jse.executeScript("window.location='http://emag.ro'");
		//driver.navigate().back();  //echivalent cu window.history.go(-1) din Console (F12)
		jse.executeScript("window.history.go(-1)");
		
		//driver.navigate().forward();
		jse.executeScript("window.history.forward()");
		
		//1
		driver.navigate().refresh();
		//2
		jse.executeScript("window.history.go(0)");
		//3
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
		//4
		driver.get(driver.getCurrentUrl());
	}
	
	@Test(priority=2)
	public void example2() {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//alternativa pt click()
		WebElement searchIcon = driver.findElement(app.menu.searchIcon);
		jse.executeScript("arguments[0].click()", searchIcon);
		
		WebElement searchInput = driver.findElement(app.menu.searchInput);
		//alternativa pentru sendKeys()
		jse.executeScript("arguments[0].value='cooking'", searchInput);
		jse.executeScript("arguments[0].click()", searchIcon);
		
		
		//tot algoritmul putea sa fie in urm 3 linii, nu mai declaram web elementele, folosim metoda din seleniumWrappers pt a returna elementele7
		/*
		jse.executeScript("arguments[0].click()",app.returnElement(app.menu.searchIcon));
		jse.executeScript("arguments[0].value='cooking'",app.returnElement(app.menu.searchInput));
		jse.executeScript("arguments[0].click()",app.returnElement(app.menu.searchIcon));
		*/
	}
}

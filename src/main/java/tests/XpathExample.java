package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.BaseTest;

public class XpathExample extends BaseTest{
	
	@Test(priority=1)
	public void xpathExample() {
		//webElement: <li class="menu_user_login".
		//CSS selector --> li[class='menu_user_login']
		//XPATH selector -> //li[@class='menu_user_login']
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		WebElement loginLink = driver.findElement(By.xpath("//li[@class='menu_user_login']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background: orange;border:4px solid blue')", loginLink);
		loginLink.click();
		
		//multiple elemets
		//plec de la tagname <li> si sar in jos multiple elemente pana gasesc <input ..>
		//Ex : //li//input[@name='log']
		
		WebElement username = driver.findElement(By.xpath("//li//input[@name='log']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background: orange;border:4px solid blue')", username);
		username.sendKeys("TestUser");
		
		
		//conditional operator OR
		//--->> //li//input[@id='password' or @type='password' or @name = 'pwd']; daca unul din atribute se modifica, inca va identifica elementul
		WebElement password = driver.findElement(By.xpath("//li//input[@id='password' or @type='password' or @name = 'pwd']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background: orange;border:4px solid blue')", password);
		password.sendKeys("12345@67890");
	
		//conditional operator And
		WebElement submit = driver.findElement(By.xpath("//li//input[@class='submit_button' and @value='Login']"));
		jse.executeScript("arguments[0].setAttribute('style', 'background: beige;border:4px solid green')", submit);
		submit.click();
	}
	
	@Test(priority=2)
	public void xpathExample2() {
		driver.findElement(By.xpath("//li//span[@class='user_name']")).click();
		//WebElement:
		//<a href="https://keybooks.ro/wp-admin/profile.php" class="icon icon-cog">Settings</a>
		//accesare pe baza de contains atribute
		//CSS
		// --> a[href*='profile.php']     * contains
		//vs	
		//XPath
		// -> //a[contains(@href,'profile.php')]
		
		driver.findElement(By.xpath("//a[contains(@href,'profile.php')]")).click();
		
		//WebElement  : <a href="https://keybooks.ro/account/orders/">recent orders</a>
		//Xpath for getText --> //a[contains(text(), 'orde')]
		driver.findElement(By.xpath("//a[contains(text(), 'orde')]")).click();
	}

}

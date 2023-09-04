package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContactsPage {

	public WebDriver driver;

	public ContactsPage(WebDriver driver) {		//constructorul clasei
		this.driver=driver;
	}
	
	public By nameField = By.cssSelector("input[name='your-name']");
	
	public void sendKeysWithCaps(By locator, String textToBeSent) {
		WebElement element = driver.findElement(locator);
		Actions action = new Actions(driver);
		action.moveToElement(element).click().keyDown(Keys.SHIFT).sendKeys(textToBeSent).perform();
	}
	
			
}

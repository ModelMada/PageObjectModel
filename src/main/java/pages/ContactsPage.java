package pages;

import java.time.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.SeleniumWrappers;

public class ContactsPage extends SeleniumWrappers {

	public WebDriver driver;

	public ContactsPage(WebDriver driver) {		//constructorul clasei
		this.driver=driver;
	}
	
	public By nameField = By.cssSelector("input[name='your-name']");
	public By emailField = By.cssSelector("input[name='your-email']");
	public By subjectField = By.cssSelector("input[name='your-s']");
	public By messageField = By.cssSelector("textarea[name='your-message']");
	public By messageButton = By.cssSelector("input[value='Send Message']");
	
	public By zoomInButtton = By.cssSelector("button[title='Zoom in']");
	public By zoomOutButtton = By.cssSelector("button[title='Zoom out']");
	public By iFrame = By.tagName("iframe");
	
	public void sendMessage(String name, String email, String subject, String message) {
		//chestie specifica paginii, metoda nu este refolosibila in alta parte, pun in interiorul metodei elem
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(nameField));
		driver.findElement(nameField).clear();//ma asigur ca fieldul este gol cand vreau sa scriu in el
		driver.findElement(nameField).sendKeys(name);
		driver.findElement(emailField).clear();
		driver.findElement(emailField).sendKeys(email);
		driver.findElement(subjectField).clear();
		driver.findElement(subjectField).sendKeys(subject);
		driver.findElement(messageField).clear();
		driver.findElement(messageField).sendKeys(message);
		driver.findElement(messageButton).click();
		}
	
	public void refactorSendMessage(String name, String email, String subject, String message) {
		sendKeys(nameField, name);
		sendKeys(emailField, email);
		sendKeys(subjectField, subject);
		sendKeys(messageField, message);
		click(messageButton);
	}
	
	public void sendKeysWithCaps(By locator, String textToBeSent) {
		WebElement element = driver.findElement(locator);
		Actions action = new Actions(driver);
		action.moveToElement(element).click().keyDown(Keys.SHIFT).sendKeys(textToBeSent).perform();
	}
	
	public void zoomMap(By locator) {
		//facem switch pe iframe
		WebElement element = driver.findElement(iFrame);
		driver.switchTo().frame(element);
		driver.findElement(locator).click();
	}
	
			
}

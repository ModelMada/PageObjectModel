package pages;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShopPage {

public WebDriver driver;
	
	//fac un constructor al driverului
	public ShopPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//locatori
	public By orderDropDown = By.name("orderby");
	public By priceSliderInitialPosition = By.xpath("//span[@style='left: 0%;']");
	public By priceSliderFinalPosition = By.xpath("//span[@style='left: 100%;']");
	public By priceSliderFinalMoved = By.xpath("//span[@style='left: 62.5%;']");
	
	public By cookbooksCategory = By.xpath("//a[contains(text(),'Cookbooks')]");
	public By firstBook = By.xpath("//div[@class='post_thumb']//a[contains(@href,'a-hundred')][2]");
	public By cookingWithLoveBook = By.xpath("//div[@class='post_thumb']//a[contains(@href,'cooking')][2]");
	
	
	//metode
	
	public void dragAndDropSlider(By locator, int x, int y) {
		WebElement element = driver.findElement(locator);
		Actions action = new Actions(driver);
		action.moveToElement(element).clickAndHold(element).moveByOffset(x,y).release().perform();
		
	}
	
	public void dragAndDropElement(By locator1,By locator2) {
		WebElement element1 = driver.findElement(locator1);
		WebElement element2 = driver.findElement(locator2);
		Actions  action = new Actions(driver);
		action.dragAndDrop(element1, element2).perform();
	}
	
	
	public void selectByValue(String value) {
		WebElement dropdown = driver.findElement(orderDropDown);
		Select selectObject = new Select(dropdown);
		selectObject.selectByValue(value);
		
	}
	
	public void selectByVisibleText(String text) {
		WebElement dropdown = driver.findElement(orderDropDown);
		Select selectObject = new Select(dropdown);
		selectObject.selectByVisibleText(text);
	}
	
	public void selectByIndex(int index) {
		WebElement dropdown = driver.findElement(orderDropDown);
		Select selectObject = new Select(dropdown);
		selectObject.selectByIndex(index);
	}
	
	/*
	 * mesajul de mai jos va aparea cand dau hover peste metoda, unde o apelam
	 */
	/**
	 * Method that returns the value as String from the current selection of a dropdown
	 * @return
	 * selected Option
	 */
	public String getSelectedOption() {
		WebElement dropdown = driver.findElement(orderDropDown);
		Select selectObj = new Select(dropdown);
		return selectObj.getFirstSelectedOption().getText();
	}
}

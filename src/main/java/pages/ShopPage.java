package pages;

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
	
	
	
	//metode
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

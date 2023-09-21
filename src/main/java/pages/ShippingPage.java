package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShippingPage {
	
	public WebDriver driver;
	
	public ShippingPage (WebDriver driver) {
		this.driver=driver;
	}
	
	public By countryDropdown = By.cssSelector("select[id='shipping_country']");
	public By provinceDropdown = By.cssSelector("select[id='shipping_state']");

	public void selectByIndex(int index, By locator) {
		WebElement dropdown = driver.findElement(locator);
		Select select = new Select(dropdown);
		select.selectByIndex(index);
	}
	
	public void selectByValueProvince(String value, By locator) {
		WebElement dropdown = driver.findElement(locator);
		Select select = new Select(dropdown);
		select.selectByValue(value);
	}
	
	public String getSelectedOptionForShippingg(By locator) {
		WebElement dropdown = driver.findElement(locator);
		Select selectObj = new Select(dropdown);
		return selectObj.getFirstSelectedOption().getText();
	}
	
}

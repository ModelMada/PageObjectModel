package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StormBookPage {

	public WebDriver driver;
	
	public StormBookPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By bookTitle = By.xpath("//h1[contains(text(),'Storm')]");
	public By stormBookPrice = By.xpath("//p[@class='price']//span[@class='woocommerce-Price-currencySymbol']");
	public By stormBookItems = By.xpath("//input[@type='number' and @class='input-text qty text']");
	public By stormBookAddMoreItems = By.xpath("//span[@class='q_inc']");
	public By stormBookRemoveItems = By.xpath("//span[@class='q_dec']");
	public By stormBookAddToCart = By.xpath("//button[@name='add-to-cart']");
}

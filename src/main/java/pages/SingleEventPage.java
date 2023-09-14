package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.SeleniumWrappers;

public class SingleEventPage extends SeleniumWrappers {
	public WebDriver driver;
	
	public SingleEventPage(WebDriver driver) {		//am facut constructor pt ca aveam nevoie de elementul harta
		this.driver = driver;
	}
	
	public By mapLink = By.partialLinkText("map");	//e in interiorul unui iFrame; avem nevoie sa identificam iframeul inainte sa facem switchul 
	public By iframe = By.tagName("iframe");
	
	public void clickMap() {
		WebElement element = driver.findElement(iframe);
		driver.switchTo().frame(element);
		click(mapLink);
	}
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class PostFormatPage extends SeleniumWrappers {
	
public WebDriver driver;
	
	public PostFormatPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public By galleryFormat = By.xpath("//a[contains(text(),'Gallery Format')]");

}

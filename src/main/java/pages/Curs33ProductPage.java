package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class Curs33ProductPage extends SeleniumWrappers{

	public WebDriver driver;
	public Curs33ProductPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By categoryRelease = By.cssSelector("span[class='posted_in']>a");
}

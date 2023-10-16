package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class HomePage extends SeleniumWrappers {

	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver; 	//obiectul de la nivelul clasei linia 7 va primi valoarea din constructor
	}
	
	public By signUpButton = By.xpath("//input[@value='Sign up']");
	public By pickedText = By.xpath("//h4=[@em='Picked']");
	public By chosenBook = By.xpath("//h3//a[contains(@href,'storm')][1]");
	public By facebookIcon = By.xpath("//div[@class='top_panel_top_socials']//a[@class='social_icons social_facebook']");
	public By twitterIcon = By.xpath("//span[@class='icon-twitter'][1]");
	public By instagramIcon = By.xpath("//span[@class='icon-instagramm'][1]");
			
			
}

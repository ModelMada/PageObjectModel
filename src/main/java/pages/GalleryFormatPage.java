package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class GalleryFormatPage extends SeleniumWrappers{
	
public WebDriver driver;
	
	public GalleryFormatPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public By nameField = By.id("author");
	
	public By commentText = By.className("comment_not_approved");

}

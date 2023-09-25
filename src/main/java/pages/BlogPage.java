package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.SeleniumWrappers;

public class BlogPage extends SeleniumWrappers {
	
	public WebDriver driver;
	public BlogPage(WebDriver driver) {
		this.driver = driver;
	}

	
	public By postFormatCategory = By.xpath("//li//a[contains(text(),'Post Formats')][1]");
	public By audioPost = By.xpath("//a[contains(text(),'Audio post')]");
	public By playSong = By.xpath("//button[@aria-label='Play']");
	public By audioPostSongSlider = By.xpath("//div[@class='mejs-time-rail']");
	public By audioPostVolumeSlider = By.xpath("//a[@class='mejs-horizontal-volume-slider']");
	
}

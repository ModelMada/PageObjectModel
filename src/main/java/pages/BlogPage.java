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
	//classic category tema 26
	public By classicCategory = By.xpath("//a[contains(text(),'Classic')][1]");
	public By searchClassicBlog = By.xpath("//aside[@id='search-2']//form[@class='search_form']");
	public By whyIwontStopBuyingBlog = By.xpath("//a[contains(@href,'why-i-wont-stop-buying')][1]");
	public By whyIwontStopBuyingBlogClassic = By.xpath("//div[@class='post_info']/span[contains(@class,'post_info_tags')]/a[contains(@href,'classic')]");
	public By whyIwontStopBuyingBlogNews = By.xpath("//div[@class='post_info']/span[contains(@class,'post_info_tags')]/a[contains(@href,'ews')]");
	public By whyIwontStopBuyingBlogRecommend = By.xpath("//div[@class='post_info']/span[contains(@class,'post_info_tags')]/a[contains(@href,'recommend')]");
	
}

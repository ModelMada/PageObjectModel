package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SingleAuthor {
	
	public WebDriver driver;
	
	public SingleAuthor(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//locatori -- nu este webElement, getText, sendKeys etc merg doar pe webElemente
	public By dramaSlider = By.xpath("(//div[@class='sc_skills_total'])[1]");
	public By biographySlider = By.xpath("(//div[@class='sc_skills_total'])[2]");
	public By cookBooksSlider = By.xpath("(//div[@class='sc_skills_total'])[3]");
	
	//Metoda o avem in Selenium wrappers
//	public void checkPercentage(By locator) {
//		 driver.findElement(locator).getText();
//	}
}

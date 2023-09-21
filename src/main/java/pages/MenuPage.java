package pages;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//clasa ce va fi instantiata, facem obiect al clasei si il instantiem

public class MenuPage {
	
	public WebDriver driver;
	
	//fac un constructor al driverului
	public MenuPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//va contine doar locatori sau webelements -> elementele trebuie sa fie vizibile si utilizabile in toate metodele, de asta folosim public By
	public By homeLink = By.linkText("HOME");
	public By contactLink = By.linkText("CONTACTS");
	public By loginLink = By.linkText("Login");
	public By shopLink = By.linkText("BOOKS");	
	public By aboutLink = By.linkText("ABOUT");
	public By blogLink = By.linkText("BLOG");
	public By eventsLink = By.linkText("EVENTS");
	public By singleAuthorLink = By.linkText("SINGLE AUTHOR");
	
	public By searchIcon = By.cssSelector("button[class*='search_submit']");
	public By searchInput = By.cssSelector("input[class='search_field']");
	
	//metode specifice cu locatori sau elementele declarate
	//metode specifice inseamna functionalitate a paginii in care ma aflu
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}
	
	public void hoverElement(By locator) {
		WebElement element = driver.findElement(locator);
		Actions action = new Actions(driver); //driver este instanta de clasa
		action.moveToElement(element).perform();
		
	}
}

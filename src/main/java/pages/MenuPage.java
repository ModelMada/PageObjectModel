package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
	
	//metode specifice cu locatori sau elementele declarate
	//metode specifice inseamna functionalitate a paginii in care ma aflu
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}
}

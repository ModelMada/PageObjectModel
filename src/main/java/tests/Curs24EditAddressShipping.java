package tests;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utils.BasePage;

public class Curs24EditAddressShipping extends BasePage {
	
	@Test
	public void editAddress() throws InterruptedException {
		app.click(app.menu.loginLink);
		app.login.loginInApp("TestUser","12345@67890");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(app.login.logoutButton));	
		driver.get("https://keybooks.ro/account/edit-address/shipping/"); //navighez catre pagina dorita in exemplu
	
		app.shippingpage.selectByIndex(41, app.shippingpage.countryDropdown);
		//selectByValue foloseste tagul value din inspectElement 
		app.shippingpage.selectByValueProvince("NL", app.shippingpage.provinceDropdown);
		assertEquals(app.shippingpage.getSelectedOptionForShippingg(app.shippingpage.provinceDropdown), "Newfoundland and Labrador");
		assertEquals(app.shippingpage.getSelectedOptionForShippingg(app.shippingpage.countryDropdown), "Canada");
	}

}

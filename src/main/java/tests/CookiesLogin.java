package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.Cookie;

import pages.LoginPage;
import pages.MenuPage;
import utils.BaseTest;
import java.util.Set;

public class CookiesLogin extends BaseTest {

	Set<Cookie> cookies;
	
	@Parameters({"user","pass"})
	@Test(priority=1, groups = "LoginFunctionality")
	public void validLoginTest(String username, String password) {
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.loginLink);
		
		LoginPage login = new LoginPage(driver);
		login.loginInApp(username, password);
		assertTrue(login.checkLoginMessageIsDisplayed(login.sucessLoginPopup));
		cookies = driver.manage().getCookies();
		System.out.println("All cookies" + cookies);
	}
	
	@Test(priority = 2)
	public void cookiesLogin() throws InterruptedException {
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.loginLink);
		
		for(Cookie cook: cookies) {
			driver.manage().addCookie(cook);
		}
		
		menu.navigateTo(menu.shopLink);
		Thread.sleep(4000);
	}
}

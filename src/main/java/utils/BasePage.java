package utils;
import pages.ContactsPage;
import pages.LoginPage;
import pages.MenuPage;
import pages.ShopPage;

public class BasePage extends BaseTest {

	public MenuPage menu = new MenuPage(driver);
	public LoginPage login = new LoginPage(driver);
	public ShopPage shop = new ShopPage(driver);
	public ContactsPage contact = new ContactsPage(driver);
	
	
}

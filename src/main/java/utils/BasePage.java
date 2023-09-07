package utils;
import pages.ContactsPage;
import pages.EventsPage;
import pages.LoginPage;
import pages.MenuPage;
import pages.ShopPage;

public class BasePage extends SeleniumWrappers {

	public MenuPage menu = new MenuPage(driver);
	public LoginPage login = new LoginPage(driver);
	public ShopPage shop = new ShopPage(driver);
	public ContactsPage contact = new ContactsPage(driver);
	public EventsPage events = new EventsPage(driver);
	
}

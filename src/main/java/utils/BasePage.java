package utils;
import pages.*;
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
	public SingleEventPage singleEvent = new SingleEventPage(driver);
	public SingleAuthor author = new SingleAuthor(driver);
	public ShippingPage shippingpage = new ShippingPage(driver);
	public HomePage homePage = new HomePage(driver);
	public StormBookPage stormBook = new StormBookPage(driver);
	public BlogPage blogPage = new BlogPage(driver);
	
}

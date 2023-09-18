package tests;

import org.testng.annotations.Test;

import pages.ContactsPage;
import pages.MenuPage;
import utils.BaseTest;

public class SendMessageTest extends BaseTest {
	
	@Test(priority=1)
	public void sendMessageText() {
		MenuPage menu = new MenuPage(driver);
		menu.navigateTo(menu.contactLink);
		ContactsPage contactsPage = new ContactsPage(driver);
		contactsPage.sendMessage("Test", "abc@test.test", "My subject", "My message");
	}
	
	@Test(priority=2)
	public void refactorSendMessageText() {
		app.click(app.menu.contactLink); //inlocuieste primele doua linii din metoda de mai sus
		app.contact.refactorSendMessage("Test", "abc@test.test", "My subject", "My message");
		
	}

}

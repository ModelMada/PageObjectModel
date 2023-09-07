package tests;

import org.testng.annotations.Test;

import utils.BaseTest;

public class WindowHandleTest extends BaseTest {

	@Test
	public void windowHandleTest() {
	//	app.menu.navigateTo(app.menu.eventsLink);
	//	app.events.clickOnEvent(app.events.timeForBooksLink);
		
		app.click(app.menu.eventsLink);
		app.click(app.events.timeForBooksLink);
	}
}

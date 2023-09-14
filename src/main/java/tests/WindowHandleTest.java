package tests;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import utils.BaseTest;

public class WindowHandleTest extends BaseTest {

	@Test
	public void windowHandleTest() throws InterruptedException {
	//	app.menu.navigateTo(app.menu.eventsLink);
	//	app.events.clickOnEvent(app.events.timeForBooksLink);
		
		app.click(app.menu.eventsLink);
		app.click(app.events.timeForBooksLink);
		
		System.out.println("Current window: " + driver.getWindowHandle());
		app.scrollByPixels(0, 800);
		app.singleEvent.clickMap();
		
		System.out.println("Current window after tab is opened: " + driver.getWindowHandle());
	
		List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
		
		System.out.println("Get all active sessions: " + browserTabs);
	
		driver.switchTo().window(browserTabs.get(1));
		driver.findElement(By.xpath("(//span[text()='Accept all'])[1]")).click();
		driver.close();
		
	
	}
}

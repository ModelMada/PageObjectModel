package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import utils.BaseTest;

public class PostFormatTema31 extends BaseTest {
	
	@Test
	public void sendMessageText() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		//hover peste BlogPage
		String javascriptHover = "var obiect = document.createEvent('MouseEvent');"
				+ "obiect.initMouseEvent('mouseover',true);"
				+ "arguments[0].dispatchEvent(obiect);";
		//click pe BlogPage si apoi click pe PostFormat din dropdown
		jse.executeScript(javascriptHover, app.returnElement(app.menu.blogLink));
		app.click(app.blogPage.postFormatCategory);
		
		//scroll to element, am adus in view GalleryFormat
		jse.executeScript("arguments[0].scrollIntoView()", app.returnElement(app.postFormatPage.galleryFormat));
		jse.executeScript("window.scrollBy(0, -100)");
		//click pe element Gallery Format
		app.click(app.postFormatPage.galleryFormat);
		//scroll to comm
		jse.executeScript("document.getElementsByName('comment')[0].scrollIntoView()");		
		jse.executeScript("window.scrollBy(0, -100)");
		//scriem in comments section
		jse.executeScript("document.getElementsByName('comment')[0].value='A nice comment'");
		Thread.sleep(3000);
		//scriem in fieldul name cu web elem
		jse.executeScript("arguments[0].value='User name este username'", app.returnElement(app.galleryFormat.nameField));
		//scriem direct din consola
		jse.executeScript("document.getElementsByName('email')[0].value='abc@abc.com'");
		jse.executeScript("document.getElementsByName('url')[0].value='www.abc.ro'");
		jse.executeScript("document.getElementsByName('submit')[0].click()");
		Thread.sleep(3000);
		//ce text returneaza acel web element in aplicatie
		//getText se foloseste pe web elem
		//app.gallery.commText e un locator doar, nu web element
		assertEquals(app.returnElement(app.galleryFormat.commentText).getText(), "Your comment is awaiting moderation.");
		
		//app.galleryFormat.commentText e locator, app.returnElement(app.galleryFormat.commentText) ia elementul cu locatorul respectiv pe care putem aplica apoi getText
		//driver.findElem(By.xpath(" ")) returneaza un web element si putem folosi .getText pe el
		//WebElement commText = driver.findElem(<>) iti creeaza web elementul commText pe care putem folosi
		// commText.getText();
	}

}

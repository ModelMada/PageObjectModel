package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.BaseTest;
import utils.DataProviderClass;

public class DataProviderTema32 extends BaseTest{
		
	@Test(dataProviderClass = DataProviderClass.class, dataProvider = "booksURLDataProvider") //fiindca dataProvider nu se mai afla in acelasi pachet, trebuie sa mentionam de unde o luam
	public void testBooksURL(String numeCarte, String urlString) throws InterruptedException {
		//pt fiecare rulare a buclei de data provider, trebuie sa hardcodam locatorul ca sa se mapeze pe toti locatorii di booksURLDataProvider
		//facem dinamic numele cartii ca sa putem intra in bucla din data provider
		WebElement element = driver.findElement(By.xpath("//a[contains(text(),'"+numeCarte+"')]"));
		element.click();
		Thread.sleep(3000);		
		assertEquals(driver.getCurrentUrl(), urlString);
		//ne intoarcem dupa fiecare iteratie la pagina principala
		app.click(app.menu.homeLink);				
	}

}

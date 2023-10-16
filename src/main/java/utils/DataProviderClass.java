package utils;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider(name="booksNamesDataProvider")
	public Object[][] booksNamesDataProvider(){
		
		Object[][] data = new Object[5][2];
		
		data[0][0] = "The forest";
		data[0][1] = "book2.jpg";
		
		data[1][0] = "Life in the garden";
		data[1][1] = "book4.jpg";
		
		data[2][0] = "The long road to the deep Silence";
		data[2][1] = "book5.jpg";
		
		data[3][0] = "It’s a really strange story";
		data[3][1] = "book12.jpg";
		
		data[4][0] = "Storm";
		data[4][1] = "books7.jpg";
		
		return data;
	}
	
	@DataProvider(name="booksURLDataProvider")
	public Object[][] booksURLDataProvider(){
		
		Object[][] data = new Object[6][2];
		
		data[0][0] = "The forest";
		data[0][1] = "https://keybooks.ro/shop/the-forest/";
		
		data[1][0] = "Life in the garden";
		data[1][1] = "https://keybooks.ro/shop/life-in-the-garden/";
		
		data[2][0] = "The son";
		data[2][1] = "https://keybooks.ro/shop/the-son/";
		
		data[3][0] = "The long road to the deep Silence";
		
		data[3][1] = "https://keybooks.ro/shop/the-long-road-to-the-deep-silence/";
		
		data[4][0] = "It’s a really strange story";
		data[4][1] = "https://keybooks.ro/shop/its-a-really-strange-story/";
		
		data[5][0] = "Storm";
		data[5][1] = "https://keybooks.ro/shop/storm/";
		
		return data;
		
	}

}

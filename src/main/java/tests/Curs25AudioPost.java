package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import utils.BaseTest;

public class Curs25AudioPost extends BaseTest {
	
	@Test
	public void audioPostMoveSlider() throws InterruptedException {
		app.menu.hoverElement(app.menu.blogLink);
		app.blogPage.click(app.blogPage.postFormatCategory);
		app.blogPage.click(app.blogPage.audioPost);
		assertTrue(app.verifyIfDisplayed(app.blogPage.audioPostSongSlider));
		assertTrue(app.verifyIfDisplayed(app.blogPage.audioPostVolumeSlider));
		
		//fara sa dam play la cantec nu se incarca sliderul, o sa gandesc o metoda si revin joi
		app.click(app.blogPage.playSong);
		Thread.sleep(5000);
		app.dragAndDropSlider(app.blogPage.audioPostSongSlider, 200, 0);
		app.dragAndDropSlider(app.blogPage.audioPostVolumeSlider, 50, 0);
		Thread.sleep(3000);
		
	}

}

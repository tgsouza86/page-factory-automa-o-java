package com.way2automation.twitter.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.way2automation.twitter.config.Configuration;

public class twitEditProfile {
	
	WebDriver driver;
	
	public twitEditProfile(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(xpath=Configuration.inlineediticon)
	public WebElement inlineediticon;
	
	@FindBy(xpath=Configuration.uploadPhoto)
	public WebElement uploadPhoto;
	
	@FindBy(xpath=Configuration.cancel)
	public WebElement cancel;
	
	@FindBy(xpath=Configuration.cancelmenu)
	public WebElement cancelmenu;
	
	public void changePic() {
		inlineediticon.click();
		uploadPhoto.sendKeys("C:\\arquivo.jpg");
		cancel.click();
		cancelmenu.click();
	}
	
	public void changeTitle() {
		
	}
	
	public void changeSummary() {
		
	}
}

package com.way2automation.twitter.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.way2automation.twitter.config.Configuration;

public class twitLandingPage {
	
	WebDriver driver;
	
	public twitLandingPage(WebDriver driver) {
		this.driver = driver;
	};
	
	
	@FindBy(xpath= Configuration.profile)
	public WebElement profile;
	
	@FindBy(xpath = Configuration.tweets)
	public WebElement tweets;
	
	@FindBy(xpath= Configuration.following)
	public WebElement following;
	
	@FindBy(xpath = Configuration.followers)
	public WebElement followers;
	
	
	public  twitMyProfile gotoProfile() {
		
		profile.click();
		
		return PageFactory.initElements(driver, twitMyProfile.class);
		
	}
	
	public void gotoTweets() {
		tweets.click();
	}
	
	public void gotoFollowing() {
		following.click();
		
		
		
		
	}
	
	public void gotoFollowers() {
		followers.click();
		
	}
	
	
	
}

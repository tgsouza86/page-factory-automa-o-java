package com.way2automation.twitter.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.way2automation.twitter.config.Configuration;

public class twitLoginPage {
	
	WebDriver driver;
	
	public twitLoginPage(WebDriver driver) {
		this.driver = driver;
	};
	
	
	@FindBy(xpath=Configuration.username)	
	public WebElement username;
	
	@FindBy(how = How.XPATH, using = Configuration.password)
	public WebElement password;
	
	@FindBy(xpath=Configuration.signin)
	public WebElement signin;
	
	
	//Business Login 
	public twitLandingPage doLogin(String myusername, String mypassword  ) {
		
		username.sendKeys(myusername);
		password.sendKeys(mypassword);
		signin.click();
		
		return PageFactory.initElements(driver, twitLandingPage.class);
		
	}

}

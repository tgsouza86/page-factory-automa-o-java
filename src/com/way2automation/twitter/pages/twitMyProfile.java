package com.way2automation.twitter.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.way2automation.twitter.config.Configuration;

public class twitMyProfile {	
	
	
	WebDriver driver;
	
	public twitMyProfile(WebDriver driver) throws IOException {
		this.driver = driver;
		
		
	};
		
		@FindBy(xpath=Configuration.editbutton)
		public WebElement editbutton;
		public twitEditProfile editProfile() {
			editbutton.click();
			return PageFactory.initElements(driver, twitEditProfile.class);
		};
	}



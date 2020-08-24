package com.way2automation.twitter.config;

public class Configuration {
	
	public static String testsite= "http://twitter.com";
	// twiter LoginPage
	public static final String username= "//input[@name='session[username_or_email]']";
	public static final String password= "//input[@name='session[password]']";
	public static final String signin= "//div[@class='css-901oao r-1awozwy r-jwli3a r-6koalj r-18u37iz r-16y2uox r-1qd0xha r-a023e6 r-vw2c0b r-1777fci r-eljoum r-dnmrzs r-bcqeeo r-q4m81j r-qvutc0']";

	// twitLandingPage
	public static final String profile= "//div[@class='css-901oao r-hkyrab r-1qd0xha r-1b6yd1w r-1vr29t4 r-ad9z0x r-bcqeeo r-qvutc0']";
	public static final	String	tweets= "//div[contains(text(),'1 Tweet')";
	public static final	String following= "//span[contains(text(),'Following')]";
	public static final	String followers= "//span[contains(text(),'Followers')]";
	
	
	//twitMyProfile
	public static final String editbutton= "//span[contains(text(),'Set up profile')]";
	
	//twitEditProfile
	public static final String inlineediticon= "//elements1";
	public static final String uploadPhoto = "//elements2";
	public static final String cancel = "//elements3";
	public static final String cancelmenu = "//elements4";

}

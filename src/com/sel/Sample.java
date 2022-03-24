package com.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\sel\\driver\\chromedriver.exe");
		WebDriver seetha = new ChromeDriver();
		seetha.get("https://www.facebook.com/");
		
	}
}




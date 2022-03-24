package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\SeleniumProject\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get(" http://demo.guru99.com/test/drag_drop.html");
		
		d.manage().window().maximize();
	    WebElement dd = d.findElement(By.xpath("//a[text()=' BANK ']"));
	    WebElement ss = d.findElement(By.xpath("//li[@class='placeholder'][1]"));
	    Actions a = new Actions(d);
	    a.dragAndDrop(dd, ss).perform();
	    
	    WebElement f1 = d.findElement(By.xpath("//a[text()=' 5000']"));
	    WebElement f2 = d.findElement(By.xpath("//li[@class='placeholder'][1]"));
	    a.dragAndDrop(f1, f2).perform();
	    
	    WebElement g1 = d.findElement(By.xpath("//a[text()=' SALES ']"));
	    WebElement g2 = d.findElement(By.xpath("//li[@class='placeholder'][1]"));
	    a.dragAndDrop(g1, g2).perform();
	    
	    WebElement h1 = d.findElement(By.xpath("//a[text()=' 5000']"));
	    WebElement h2 = d.findElement(By.xpath("//li[@class='placeholder'][1]"));
	    a.dragAndDrop(h1, h2).perform();
	    }

}

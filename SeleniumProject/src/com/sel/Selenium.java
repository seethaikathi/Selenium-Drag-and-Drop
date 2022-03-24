package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\SeleniumProject\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    driver.get("https://www.calculatorsoup.com/calculators/math/basic.php");	
    WebElement txtbox = driver.findElement(By.name("display"));
    txtbox.click();
    WebElement type = driver.findElement(By.xpath("//input[@type='button']"));
    type.sendKeys("98");
    WebElement add = driver.findElement(By.name("add"));
    add.click();
    WebElement type1 = driver.findElement(By.xpath("//input[@type='button']"));
    type1.sendKeys("2");
    WebElement equal = driver.findElement(By.name("calculate"));
    equal.click();
    WebElement type2 = driver.findElement(By.name("subtract"));
    type2.click();
    WebElement type3 = driver.findElement(By.xpath("//input[@type='button']"));
    type3.sendKeys("30");
    WebElement equal1 = driver.findElement(By.name("calculate"));
    equal1.click();
    
    
    
	}

		
	}
	



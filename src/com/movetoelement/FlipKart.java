package com.movetoelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[text()='✕']")).click();
        WebElement m1 = driver.findElement(By.xpath("//div[text()='Fashion']"));
        Thread.sleep(3000);
        Actions a = new Actions(driver);
        a.moveToElement(m1).perform();
        WebElement m2 = driver.findElement(By.xpath("//a[text()='Women Ethnic']"));
        a.moveToElement(m2).perform();
        WebElement m3 =driver.findElement(By.xpath("//a[text()='Women Sarees']"));
        m3.click();
        Thread.sleep(3000);
       driver.findElement(By.xpath("//div[text()='Saara']")).click();
	}

}

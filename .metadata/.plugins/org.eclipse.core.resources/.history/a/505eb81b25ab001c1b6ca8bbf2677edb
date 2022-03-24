package javaScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\SeleniumProject\\drivers\\chromedriver.exe");
		WebDriver q = new ChromeDriver();
		q.get("https://www.flipkart.com/");
		q.manage().window().maximize();
		WebElement button = q.findElement(By.xpath("//button[text()='✕']"));
		button.click();
		WebElement ss = q.findElement(By.xpath("//div[text()='SOCIAL']"));
		WebElement sd = q.findElement(By.xpath("//h2[text()='Back to Office Essentials']"));
		JavascriptExecutor js = (JavascriptExecutor)q;
		js.executeScript("arguments[0].scrollIntoView(true)", ss);
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(false)", sd);
	}

}

package robotClass;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot {
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
	    a.get("https://www.facebook.com/");
	    a.manage().window().maximize();
	    WebElement userTxt = a.findElement(By.id("email"));
	    userTxt.sendKeys("pugazh");
	    Actions b = new Actions(a);
	    b.doubleClick(userTxt).contextClick(userTxt).build().perform();
	   Robot s=new Robot();
	    for (int i = 0; i < 6; i++) {
	        s.KeyPress(KeyEvent.VK_DOWN);
	  	    s.keyRelease(KeyEvent.VK_DOWN);                  
	  	    }
	    
	    s.keyPress(KeyEvent.VK_ENTER);
	    s.keyRelease(KeyEvent.VK_ENTER);
	    s.keyPress(KeyEvent.VK_TAB);
	    s.keyRelease(KeyEvent.VK_TAB);
	    s.keyPress(KeyEvent.VK_CONTROL);
	    s.keyPress(KeyEvent.VK_V);
	    s.keyRelease(KeyEvent.VK_CONTROL);
	    s.keyRelease(KeyEvent.VK_V);
	  
	    
	}

	


	
	
		


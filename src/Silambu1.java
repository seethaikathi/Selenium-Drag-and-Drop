import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Silambu1 {
         public static void main(String[] args) {
        	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
        	 WebDriver S = new ChromeDriver();
        	 S.get("https://meesho.com/");
        	 S.manage().window().maximize();
        	WebElement a = S.findElement(By.xpath("//span[text()='Bags & Footwear']"));
        	Actions P = new Actions(S); 
           P.moveToElement(a).perform();
           
        	
			
		}

}

package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {
	
	
		
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://skpatro.github.io/demo/links/");
            
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@ name = 'NewTab']")).click();
			
			Set<String> demo = driver.getWindowHandles();
			
		    ArrayList<String> y	= new ArrayList<String>(demo);
		
		    String x = y.get(1);
		   
		   driver.switchTo().window(x);
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("(//span[text()='Cypress'])[1]")).click();
		   
		   driver.switchTo().window(y.get(0));
		   driver.findElement(By.xpath("//input[@value ='New Window']")).click();
		   
		
			
			
			
	}

}

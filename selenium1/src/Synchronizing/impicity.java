package Synchronizing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class impicity {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	
	WebElement x = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
	
	 WebElement y = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
	
      Actions Actions = new Actions(driver);
      
      Actions.dragAndDrop(x, y).perform();
      
      
}
}
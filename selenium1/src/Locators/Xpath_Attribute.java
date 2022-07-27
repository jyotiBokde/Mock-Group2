package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Attribute {
	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();   
		driver.get("https://www.facebook.com/login/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input [@type = 'text']")).sendKeys("xyz");
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//input [@ type = 'password']")).sendKeys("123");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@ value = '1']")).click();
		
	}

}

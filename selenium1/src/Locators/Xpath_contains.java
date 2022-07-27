package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_contains {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();   
				driver.get("https://www.facebook.com/login/");
				
				Thread.sleep(1500);
				driver.findElement(By.xpath("//input[contains(@ type ,'text')]")).sendKeys("abc");
				
				

}
}
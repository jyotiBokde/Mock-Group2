package webelement_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_Method {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();   
				driver.get("https://www.instagram.com/");
				Thread.sleep(2000);
				
				//driver.findElement(By.xpath("//input[@ name = 'username']")).sendKeys("ABC");
				
				driver.findElement(By.xpath("//input[@ name = 'password']")).sendKeys("123@jyo");
				
				 boolean result = driver.findElement(By.xpath("//button[@ type = 'submit']")).isEnabled();
				
				System.out.println(result);
				
				if(result == true) {
					System.out.println("Element is enable");
				}
				else {
					System.out.println("Element is not enable");
				}
				
				
				

}
}
package webelement_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected_Method {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();   
				driver.get("https://www.facebook.com/r.php");
				
				WebElement female = driver.findElement(By.xpath("(//label [@ class = '_58mt'])[1]"));
				
				female.click();
				
				Thread.sleep(2000);
				  boolean result = female.isSelected();
				  System.out.println(result);	
				  
				 
				 
				}

}

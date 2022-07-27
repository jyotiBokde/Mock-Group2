package Synchronizing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitly {
	
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	//	WebDriverWait x = new WebDriverWait(driver,10);    old version
	    
	    WebDriverWait x = new WebDriverWait(driver,Duration.ofSeconds(20));
	    x.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class = 'dropdown-toggle'])[1]"))).click();
	    
	    System.out.println("START");
		

}
}
package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://meesho.com/"); 
		
		WebElement abc = driver.findElement(By.xpath("//span[text()='Jewellery & Accessories']"));
		 Actions act = new Actions(driver);
		
		act.moveToElement(abc).perform();
		Thread.sleep(2000);
		WebElement xyz = driver.findElement(By.xpath("//p[text()='Jewellery Set']"));
		
		act.click(xyz).perform();
		
		
	}

}

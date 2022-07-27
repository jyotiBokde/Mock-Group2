package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActClassRightClick {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://meesho.com/"); 
		
		WebElement abc = driver.findElement(By.xpath("//span[text()='Bags & Footwear']"));
		 Actions act = new Actions(driver);
		 
		 act.moveToElement(abc).contextClick().build().perform();
		 

}
}
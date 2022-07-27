package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActClassDoubleClick {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement Doubleclick = driver.findElement(By.xpath("//button[text() = 'Double-Click Me To See Alert']"));
		
		Actions act = new Actions (driver);
		Thread.sleep(2000);
		
		act.moveToElement(Doubleclick).perform();
		Thread.sleep(2000);
		act.doubleClick().perform();
		
		
	}

}

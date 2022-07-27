package CustomizedListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UpDown {
	
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/signup");
        
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Actions act = new Actions(driver);
		
		act.click(month).perform();
		Thread.sleep(2000);
		
		for(int i=0;i<=4;i++) {
			act.sendKeys(Keys.ARROW_UP).perform();
		}
		
		//act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		
		//act.sendKeys(Keys.ARROW_DOWN).perform();
		//Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).perform();

}
}
package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://123.252.129.5:8080/hob");
		Thread.sleep(2000);
		for(int i=6;i<=8;i++) {             ///12345678
			WebElement xyz = driver.findElement(By.xpath("(//input[@type='checkbox'])["+i+"]"));
			
			xyz.click();
			
			
			
			
					
		}

}
}
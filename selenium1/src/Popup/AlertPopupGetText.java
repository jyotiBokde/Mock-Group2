package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopupGetText {
	
	 public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://nxtgenaiacademy.com/alertandpopup/");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button [@ name = 'promptalertbox1234']")).click();
			
			
			Alert promptalert = driver.switchTo().alert();
			System.out.println(promptalert.getText());
			promptalert.sendKeys("yes");
			promptalert.accept();
			System.out.println(driver.findElement(By.id("demoone")).getText());
			driver.quit();
			
			

}
}
package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class allselected {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();   
				driver.get("https://www.facebook.com/signup/");
				
				Thread.sleep(3000);
				
				WebElement Month = driver.findElement(By.xpath("//select[@ title ='Month']"));
				
				Select M = new Select(Month);
				
				WebElement X = M.getFirstSelectedOption();
				
				System.out.println(X);
				
				
				

}
}
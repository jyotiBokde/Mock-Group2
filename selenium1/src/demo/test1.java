package demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();   //Upcasting
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://web.whatsapp.com/");
		
        Dimension D = new Dimension(200,300);
		
		driver.manage().window().setSize(D);
		
		Thread.sleep(3000);
		
		Point P = new Point(300,400);
		
		driver.manage().window().setPosition(P);
		
		
		
		}
	}





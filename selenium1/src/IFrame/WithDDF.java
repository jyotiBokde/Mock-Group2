package IFrame;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WithDDF {
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
	FileInputStream file=new FileInputStream("D:\\Apache.jyo\\demo1.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-Notifications");
	WebDriver driver=new ChromeDriver(opt);
	
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://kite.zerodha.com/");
	String UN = sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(UN);
	
	String PWD = sh.getRow(1).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PWD);
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	Thread.sleep(2000);
	String PN = sh.getRow(2).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PN);
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(2000);
	String Actual = driver.findElement(By.xpath("//span[text()='OKP335']")).getText();
	String expected="OKP335";
	if(expected.equals(Actual))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	
	
	}

}


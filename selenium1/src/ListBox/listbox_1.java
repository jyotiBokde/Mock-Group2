package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox_1 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();   
				
				driver.get("https://www.amazon.in/");
				
				Thread.sleep(2000);
				
		       WebElement result = driver.findElement(By.xpath("//select[@ name = 'url']"));
		       
              Select x = new Select(result);
           
            boolean y = x.isMultiple();
            
            System.out.println(y);
            
            if(y==true) {
            	System.out.println("multiple selected");
            }
            else {
            	System.out.println("single selected");
            	
            }
              
           
          
            
              
}          
}

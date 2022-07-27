package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class listbox_selectmethod {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver(); 
				
                 driver.get("https://www.facebook.com/signup/");
				
				Thread.sleep(2000);
				
		       WebElement result = driver.findElement(By.xpath("//select[@ id = 'month']"));
		       
              Select x = new Select(result);
              
              
         //   x.selectByIndex(5);
              
               x.selectByValue("1");
             
            // x.selectByVisibleText("Amazon Pharmacy");
              
            //  List<WebElement> y = x.getOptions();
              
            //  System.out.println(y.size());
              
             // for(int i=0;i<=y.size()-1;i++) {
            	//.out.println(y.get(i).getText());
            	  
          //    }
              

}
}
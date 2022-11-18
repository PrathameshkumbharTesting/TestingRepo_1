
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ThirdAutomation {

	public static void main(String[] args) {
	
		
		
		  try{
			  System.setProperty("webdriver.chrome.driver","C:\\Users\\PK75022\\workspace\\Selenium-sample-project\\chromedriver.exe");  
			  
			  WebDriver driver=new ChromeDriver();
	            
	            driver.get("https://www.orangehrm.com/");
	            driver.manage().window().maximize();
	            Thread.sleep(1000);
	            
	            driver.navigate().to("https://www.orangehrm.com/");
	            WebElement demo =driver.findElement(By.linkText("Book a Free Demo"));
	            demo.click();
	            Thread.sleep(2000);
	            
	            driver.navigate().back();
	            Thread.sleep(1000);
	            
	            driver.navigate().forward();
	            Thread.sleep(1000);
	            
	            
	            driver.quit();
	            
	            
	        }catch(Exception ex)
	        {
	            ex.printStackTrace();
	        }
	}

}

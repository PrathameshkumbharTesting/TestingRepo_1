
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class FifthAutomation {

	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PK75022\\workspace\\Selenium-sample-project\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
try{
		 driver.get("https://www.google.com/");    //to open Browser
	        driver.manage().window().maximize();    // To maximize the screen
	        Thread.sleep(5000);
	        driver.close();
	        
	        
	        
}
catch(Exception ex){
	ex.getStackTrace();
}
		
	}

}

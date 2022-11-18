import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import junit.framework.Assert;

public class FourthAutomation {
	
	WebDriver driver= new ChromeDriver();

	public static void main(String[] args) {
		
		
		
		FourthAutomation obj =new FourthAutomation();
	//	obj.valid();
		obj.Invalid();
		

	}
	
//public void valid(){
//	WebDriver driver= new ChromeDriver();
//		WebElement title= driver.findElement(By.xpath(""));
//		Assert.assertEquals(true, title.isDisplayed());
//		System.out.println("Not changed");
//	}

public void Invalid(){
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\PK75022\\workspace\\Selenium-sample-project\\chromedriver.exe");

	

	try{
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	driver.navigate().to("https://www.nopcommerce.com/en/register?returnUrl=%2Fen");
	
	Thread.sleep(3000);
//	driver.navigate().back();
//	WebElement typing= driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
//	Thread.sleep(3000);
//	typing.sendKeys("Todays weather");
//	Thread.sleep(2000);
//	WebElement GoogleSearch= driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]"));
//	Actions action=new Actions(driver);
//	action.click(GoogleSearch).build().perform();
//	
//	Thread.sleep(3000);
//	driver.navigate().back();
//	Thread.sleep(2000);
	
	
	WebElement title= driver.findElement(By.xpath("//h1[text()='Register']"));
	
	Assert.assertEquals(true, title.isDisplayed());
	System.out.println("changed");
	driver.quit();
	
	}
	catch(Exception ex){
		ex.getStackTrace();
	}
	
	
}
	

}

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class AlertAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\PK75022\\workspace\\Selenium-sample-project\\chromedriver.exe");

			WebDriver driver= new ChromeDriver();
			
			driver.get("https://sweetalert2.github.io/");
			
			
		Thread.sleep(3000);
			driver.manage().window().maximize();
			
			
			JavascriptExecutor js =(JavascriptExecutor) driver;
			
			js.executeScript("javascript:window.scrollBy(0,350)");
			
			
 //   driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//			WebElement alert = driver.findElement(By.xpath("/html/body/div[2]/button"));
//			
//			Thread.sleep(1000);
//			alert.click();
//			Thread.sleep(1000);
//			driver.switchTo().alert().accept();
			
			
			WebElement  SuccessMessage = driver.findElement(By.xpath("/html/body/div[3]/button"));
			Thread.sleep(1000);
			Actions action=new Actions(driver);
			action.moveToElement(SuccessMessage);
	    	Thread.sleep(1000);
			action.click(SuccessMessage).build().perform();
		    Thread.sleep(1000);
			
			
			
			WebElement OkButton = driver.findElement(By.xpath("/html/body/div[25]/div/div[6]/button[1]"));
			Thread.sleep(1000);
			action.moveToElement(OkButton);
			Thread.sleep(1000);
			action.click(OkButton).build().perform();
			Thread.sleep(1000);
		
			
			WebElement NormalAlert =driver.findElement(By.xpath("/html/body/div[2]/button"));
			Thread.sleep(1000);
			action.moveToElement(NormalAlert);
			Thread.sleep(1000);
			action.click(NormalAlert).build().perform();
			Thread.sleep(1000);
			driver.switchTo().alert().accept();
			
			
			js.executeScript("javascript:window.scrollBy(0,400)");
			
			// Try button 1
			
			//*[@id='message-example']/div/button
			WebElement TryMe1 = driver.findElement(By.xpath("((//div[@class='ui']/button)[1])"));
			Thread.sleep(1000);
			action.moveToElement(TryMe1);
			Thread.sleep(1000);
			action.click(TryMe1).build().perform();
			Thread.sleep(1000);
			
			WebElement TryOk1 = driver.findElement(By.xpath("/html/body/div[25]/div/div[6]/button[1]"));
			Thread.sleep(1000);
			action.moveToElement(TryOk1);
			Thread.sleep(1000);
			action.click(TryOk1).build().perform();
			Thread.sleep(1000);
			
			// Try button 2
			js.executeScript("javascript:window.scrollBy(0,200)");
			WebElement TryMe2 = driver.findElement(By.xpath("//*[@id='title-text-example']/div/button"));
			Thread.sleep(1000);
			action.moveToElement(TryMe2);
			Thread.sleep(1000);
			action.click(TryMe2).build().perform();
			Thread.sleep(1000);
			
			WebElement TryOk2 = driver.findElement(By.xpath("/html/body/div[25]/div/div[6]/button[1]"));
			Thread.sleep(1000);
			action.moveToElement(TryOk2);
			Thread.sleep(1000);
			action.click(TryOk2).build().perform();
			Thread.sleep(1000);
			
			// Try button 3
			js.executeScript("javascript:window.scrollBy(0,200)");
			WebElement TryMe3 = driver.findElement(By.xpath("//*[@id='serror-example']/div/button"));
			Thread.sleep(1000);
			action.moveToElement(TryMe3);
			Thread.sleep(1000);
			action.click(TryMe3).build().perform();
			Thread.sleep(1000);
			
			WebElement TryOk3 = driver.findElement(By.xpath("/html/body/div[25]/div/div[6]/button[1]"));
			Thread.sleep(1000);
			action.moveToElement(TryOk3);
			Thread.sleep(1000);
			action.click(TryOk3).build().perform();
			Thread.sleep(1000);
			
			// Try button 4
			
			js.executeScript("javascript:window.scrollBy(0,200)");
			WebElement TryMe4 = driver.findElement(By.xpath("//*[@id='long-text']/div/button"));
			Thread.sleep(1000);
			action.moveToElement(TryMe4);
			Thread.sleep(1000);
			action.click(TryMe4).build().perform();
			Thread.sleep(1000);
			
		//	js.executeScript("javascript:window.scrollBy(0,1500)");
			WebElement TryOk4 = driver.findElement(By.xpath("/html/body/div[25]/div/div[6]/button[1]"));
			Thread.sleep(1000);
			action.moveToElement(TryOk4);
			Thread.sleep(1000);
			action.click(TryOk4).build().perform();
			Thread.sleep(1000);
			
			
			// Try button 5
			
			js.executeScript("javascript:window.scrollBy(0,200)");
			WebElement TryMe5 = driver.findElement(By.xpath("//*[@id='custom-html']/div/button"));
			Thread.sleep(1000);
			action.moveToElement(TryMe5);
			Thread.sleep(1000);
			action.click(TryMe5).build().perform();
			Thread.sleep(1000);
			
			
			WebElement TryOk5 = driver.findElement(By.xpath("/html/body/div[25]/div/div[6]/button[1]/i"));
			Thread.sleep(1000);
			action.moveToElement(TryOk5);
			Thread.sleep(1000);
			action.click(TryOk5).build().perform();
			Thread.sleep(1000);
			
			
			
			// Try button 6 option 1
			js.executeScript("javascript:window.scrollBy(0,200)");
			WebElement TryMe6_1 = driver.findElement(By.xpath("//*[@id='three-buttons']/div/button"));
			Thread.sleep(1000);
			action.moveToElement(TryMe6_1);
			Thread.sleep(1000);
			action.click(TryMe6_1).build().perform();
			Thread.sleep(1000);
			
			
			WebElement TryOk6_1 = driver.findElement(By.xpath("/html/body/div[25]/div/div[6]/button[1]"));
			Thread.sleep(1000);
			action.moveToElement(TryOk6_1);
			Thread.sleep(1000);
			action.click(TryOk6_1).build().perform();
			Thread.sleep(1000);
			
			WebElement TryOk6_confirmed = driver.findElement(By.xpath("/html/body/div[25]/div/div[6]/button[1]"));
			Thread.sleep(1000);
			action.moveToElement(TryOk6_confirmed);
			Thread.sleep(1000);
			action.click(TryOk6_confirmed).build().perform();
			Thread.sleep(1000);
			
			
			
			// Try button 6 option 2
			//js.executeScript("javascript:window.scrollBy(0,200)");
			WebElement TryMe6_2 = driver.findElement(By.xpath("//*[@id='three-buttons']/div/button"));
			Thread.sleep(1000);
			action.moveToElement(TryMe6_2);
			Thread.sleep(1000);
			action.click(TryMe6_2).build().perform();
			Thread.sleep(1000);
			
			
			WebElement TryOk6_2 = driver.findElement(By.xpath("/html/body/div[25]/div/div[6]/button[2]"));
			Thread.sleep(1000);
			action.moveToElement(TryOk6_2);
			Thread.sleep(1000);
			action.click(TryOk6_2).build().perform();
			Thread.sleep(1000);
			
			
			WebElement TryOk6_2confirmed = driver.findElement(By.xpath("/html/body/div[25]/div/div[6]/button[1]"));
			Thread.sleep(1000);
			action.moveToElement(TryOk6_2confirmed);
			Thread.sleep(1000);
			action.click(TryOk6_2confirmed).build().perform();
			Thread.sleep(1000);
			
			
			
			
			
			// Try button 6 option 3
			//js.executeScript("javascript:window.scrollBy(0,200)");
			WebElement TryMe6_3 = driver.findElement(By.xpath("//*[@id='three-buttons']/div/button"));
			Thread.sleep(1000);
			action.moveToElement(TryMe6_3);
			Thread.sleep(1000);
			action.click(TryMe6_3).build().perform();
			Thread.sleep(1000);
			
			
			WebElement TryOk6_3 = driver.findElement(By.xpath("/html/body/div[25]/div/div[6]/button[3]"));
			Thread.sleep(1000);
			action.moveToElement(TryOk6_3);
			Thread.sleep(1000);
			action.click(TryOk6_3).build().perform();
			Thread.sleep(1000);
			
			
			// Try button 7
			WebElement TryMe7 = driver.findElement(By.xpath("//*[@id='custom-position']/div/button"));
			Thread.sleep(1000);
			action.moveToElement(TryMe7);
			Thread.sleep(1000);
			action.click(TryMe7).build().perform();
			Thread.sleep(1000);
			
					
			
			// Try button 8
			WebElement TryMe8 = driver.findElement(By.xpath("//*[@id='custom-animation']/div/button"));
			Thread.sleep(1000);
			action.moveToElement(TryMe8);
			Thread.sleep(1000);
			action.click(TryMe8).build().perform();
			Thread.sleep(1000);			
			
			
			
			WebElement TryOk8 = driver.findElement(By.xpath("/html/body/div[25]/div/div[6]/button[1]"));
			Thread.sleep(1000);
			action.moveToElement(TryOk8);
			Thread.sleep(1000);
			action.click(TryOk8).build().perform();
			Thread.sleep(1000);
			
			
			
			// Try button 9
			WebElement TryMe9 = driver.findElement(By.xpath("//*[@id='confirm-dialog']/div/button"));
			Thread.sleep(1000);
			action.moveToElement(TryMe9);
			Thread.sleep(1000);
			action.click(TryMe9).build().perform();
			Thread.sleep(1000);	
			
			
			WebElement TryOk9_1 = driver.findElement(By.xpath("/html/body/div[25]/div/div[6]/button[1]"));
			Thread.sleep(1000);
			action.moveToElement(TryOk9_1);
			Thread.sleep(1000);
			action.click(TryOk9_1).build().perform();
			Thread.sleep(1000);
			
			
			
			WebElement TryOk9_2 = driver.findElement(By.xpath("/html/body/div[25]/div/div[6]/button[1]"));
			Thread.sleep(1000);
			action.moveToElement(TryOk9_2);
			Thread.sleep(1000);
			action.click(TryOk9_2).build().perform();
			Thread.sleep(1000);		
					
			WebElement TryMe9_3 = driver.findElement(By.xpath("//*[@id='confirm-dialog']/div/button"));
			Thread.sleep(1000);
			action.moveToElement(TryMe9_3);
			Thread.sleep(1000);
			action.click(TryMe9_3).build().perform();
			Thread.sleep(1000);	
			
			
			WebElement TryMe9_4 = driver.findElement(By.xpath("/html/body/div[25]/div/div[6]/button[3]"));
			Thread.sleep(1000);
			action.moveToElement(TryMe9_4);
			Thread.sleep(1000);
			action.click(TryMe9_4).build().perform();
			Thread.sleep(1000);	
			
			
			
			
			driver.quit();
			driver.close();
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}

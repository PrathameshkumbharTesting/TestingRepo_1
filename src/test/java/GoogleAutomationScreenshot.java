import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.TakesScreenshot;

public class GoogleAutomationScreenshot {

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		try{
			
			WebDriver driver= new ChromeDriver();
			driver.get("https://google.com");
			driver.manage().window().maximize();
			File screenShotFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenShotFile, new File (".//ScreenShots/screen.png"));
			driver.quit();
			
		}
		catch(Exception ex)
		{
			ex.getStackTrace();
			ex.printStackTrace();
		}

}

}



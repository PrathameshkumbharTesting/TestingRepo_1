import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabAutomation {

	public static void main(String[] args) {
		try{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PK75022\\workspace\\Selenium-sample-project\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/about/index.htm");
		driver.manage().window().maximize();

		
		ArrayList<String> tab= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tab.get(1));
		System.out.println("Active tab "+ driver.getTitle());
	}
		catch(Exception ex)
		{
			ex.getStackTrace();
			ex.printStackTrace();
		}
	}
}

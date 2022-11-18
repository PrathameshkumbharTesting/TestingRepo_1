import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MeeshoAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PK75022\\workspace\\Selenium-sample-project\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		try{
			
			driver.get("https://www.meesho.com");
			Thread.sleep(10000);
			driver.manage().window().maximize();
		}
		catch(Exception ex){
			ex.getStackTrace();
			System.out.println(ex);
		}

		}
	}



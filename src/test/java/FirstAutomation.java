import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class FirstAutomation {

	public static void main(String[] args) {
		try{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PK75022\\workspace\\Selenium-sample-project\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement FirstName = driver.findElement(By.id("FirstName"));
        WebElement LastName = driver.findElement(By.id("LastName"));
        WebElement Email = driver.findElement(By.id("Email"));
        WebElement ConfirmEmail = driver.findElement(By.id("ConfirmEmail"));
        WebElement Username = driver.findElement(By.id("Username"));
        WebElement check_availability_button = driver.findElement(By.id("check-availability-button"));
        //WebElement LogIn = driver.findElement(By.tagName("Log in"));
        
        FirstName.sendKeys("Prathamesh");
        Thread.sleep(2000);
        LastName.sendKeys("Kumbhar");
        Thread.sleep(2000);
        Email.sendKeys("prathameshskumbhar622001@gmail.com");
        Thread.sleep(2000);
        ConfirmEmail.sendKeys("prathameshskumbhar622001@gmail.com");
        Thread.sleep(2000);
        Username.sendKeys("Prathamesh");
        Thread.sleep(2000);
        check_availability_button.click();
        Thread.sleep(10000);

	}
		catch(Exception ex)
		{
			ex.getStackTrace();
		}


	}
}

	
	

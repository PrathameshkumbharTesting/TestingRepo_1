
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SecondAutomation {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PK75022\\workspace\\Selenium-sample-project\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/en");
		driver.manage().window().maximize();
		
		try{
		WebElement Usericon = driver.findElement(By.xpath("(//ul[@class='navigation-top-menu navigation-top-menu-user-actions'])/li[3]"));
		
		WebElement Registerlink=driver.findElement(By.xpath("(//ul[@class='navigation-top-menu-sublist'])[6]/li[2]"));
		Thread.sleep(5000);
		Actions action=new Actions(driver);
		action.moveToElement(Usericon);
		Thread.sleep(3000);
		action.click(Registerlink).build().perform();
		Thread.sleep(5000);
		
		
		WebElement FirstName = driver.findElement(By.id("FirstName"));
        WebElement LastName = driver.findElement(By.id("LastName"));
        WebElement Email = driver.findElement(By.id("Email"));
        WebElement ConfirmEmail = driver.findElement(By.id("ConfirmEmail"));
        WebElement Username = driver.findElement(By.id("Username"));
        WebElement check_availability_button = driver.findElement(By.id("check-availability-button"));
        WebElement CountryId = driver.findElement(By.xpath("//select[@id='CountryId']"));
        WebElement TimeZoneId = driver.findElement(By.xpath("//select[@id='TimeZoneId']"));
        WebElement Newsletter = driver.findElement(By.xpath("//label[@for='Newsletter']"));
         
      
        
        WebElement Password = driver.findElement(By.xpath("//input[@id='Password']"));
        WebElement ConfirmPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        WebElement Details_CompanyIndustryId = driver.findElement(By.xpath("//select[@id='Details_CompanyIndustryId']"));
    //    WebElement Details_CompanyRoleId = driver.findElement(By.xpath("//select[@id='Details_CompanyRoleId']"));
      //  WebElement Details_CompanySizeId = driver.findElement(By.xpath("//select[@id='Details_CompanySizeId']"));
       //   WebElement Details_CompanyWebsiteUrl = driver.findElement(By.xpath(" //input[@id='Details_CompanyWebsiteUrl']"));
        WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
        
 
     
        //WebElement LogIn = driver.findElement(By.tagName("Log in"));	
        FirstName.sendKeys("Prathamesh");
        Thread.sleep(2000);
        LastName.sendKeys("Kumbhar");
        Thread.sleep(2000);
        Email.sendKeys("prathameshskumbhar622001@gmail.com");
        Thread.sleep(2000);
        ConfirmEmail.sendKeys("prathameshskumbhar622001@gmail.com");
        Thread.sleep(2000);
        Username.sendKeys("Prathamesh_7767");
        Thread.sleep(2000);
        check_availability_button.click();
        CountryId.sendKeys("India");
        Thread.sleep(2000);
        TimeZoneId.sendKeys("(UTC+05:30) Chennai, Kolkata, Mumbai, New Delhi");
        Thread.sleep(2000);
        
        if(Newsletter.isEnabled()){
        	Newsletter.click();
        }
        Password.sendKeys("Admin@12345");
        Thread.sleep(2000);
        ConfirmPassword.sendKeys("Admin@12345");
        Thread.sleep(2000);
        Details_CompanyIndustryId.sendKeys("I am student");
        Thread.sleep(2000);
      //  Details_CompanyRoleId.sendKeys("Technical developer");
      //  Thread.sleep(2000);
       // Details_CompanySizeId.sendKeys("More than 15");
       // Thread.sleep(2000);
     //   Details_CompanyWebsiteUrl.sendKeys("www.google.com");
       // Thread.sleep(2000);
        submit.click();
        Thread.sleep(10000);
		driver.quit();
	}
		catch(Exception ex){
			ex.getStackTrace();
			System.out.println(ex);
		}

}
}
//  https://www.nopcommerce.com/en/register?returnUrl=%2Fen
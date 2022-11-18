import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Meesho {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\PK75022\\workspace\\Selenium-sample-project\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();
		try{

		driver.get("https://www.meesho.com");
		Thread.sleep(10000);
		driver.manage().window().maximize();
		
//		WebElement men= driver.findElement(By.xpath("//div[@class='NavBarDesktop__Subtitle-xsryom-0 hkCMMv'][3]"));
//		//*[@id='desktop-header-cnt']/div[2]/nav/div/div[1]/div/a
//		//  (//div[@class='desktop-navLink']/a)[1]
//		//a[@data-group='men']
//		//a[@href='/shop/men'][1]
//		Thread.sleep(5000);
////		WebElement ToPhoneCase= driver.findElement(By.xpath("//*[@id='desktop-header-cnt']/div[2]/nav/div/div[1]/div/div/div/div/li[5]/ul/li[1]/a"));
//	
////		action.moveToElement(ToPhoneCase);
////		//*[@id="desktop-header-cnt"]/div[2]/nav/div/div[1]/div/div/div/div/li[5]/ul/li[1]/a
//		WebElement shoe =driver.findElement(By.xpath("//*[@id='__next']/div[2]/div[3]/div/div[6]/div/div[4]/a[2]/p"));
//		Thread.sleep(5000);	
//		
//		//a[@href='/mobile-phone-cases']
//		Actions action=new Actions(driver);
//		//*[@id="desktop-header-cnt"]/div[2]/nav/div/div[1]/div/div/div/div/li[5]/ul/li[11]/a
//		action.moveToElement(shoe);
//		Thread.sleep(5000);
//		action.click(shoe).build().perform();
//		Thread.sleep(5000);
//		
//		
////		WebElement RowItem = driver.findElement(By.xpath("//img[@alt='DailyObjects Transparent Solid iPhone 13 Back Case']"));
////		action.moveToElement(RowItem);
////		Thread.sleep(3000);
////		action.click(RowItem).build().perform();
////		Thread.sleep(5000);
//		
//		//*[@id="desktopSearchResults"]/div[2]/section/ul/li[11]/a/div[2]/h3
////		
////WebElement price =driver.findElement(By.xpath("//*[@id='mountRoot']/div/div[1]/main/div[2]/div[2]/div[1]/div/p[1]/span[1]/strong"));
////action.moveToElement(price);
////Thread.sleep(3000);
////action.click(price).build().perform();
////Thread.sleep(5000);
////
////WebElement addBag =driver.findElement(By.xpath("//*[@id='mountRoot']/div/div[1]/main/div[2]/div[2]/div[2]/div[2]/div/div[1]/text()"));
////action.moveToElement(addBag);
////Thread.sleep(3000);
////action.click(addBag).build().perform();
////Thread.sleep(5000);
////
//
//

driver.quit();

	}
	catch(Exception ex){
		ex.getStackTrace();
		System.out.println(ex);
	}


	}

}

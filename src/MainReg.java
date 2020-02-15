import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainReg {

	WebDriver driver;	
//	ArrayList locatorList = new ArrayList<By>();
 
	public void invokeBrowser() {
		
		try {
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			driver = new ChromeDriver();
			
			// manage use for browser property
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			getNavigate();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getNavigate() {
	 
		try {
			driver.navigate().to("https://dokan.ajaira.website");
			driver.findElement(By.linkText("Log in")).click();
			driver.findElement(By.id("reg_email")).sendKeys("adminvendor12345@gmail.com");
			driver.findElement(By.id("reg_password")).sendKeys("adminvendor12345678");
			//driver.findElement(By.linkText("I am a vendor")).click();
			 driver.findElement(By.xpath("//*[contains(@class, 'user-role')]/label[2]")).click(); 
             
			 
			/*
			 * WebElement chkFBPersist = driver.findElement(By.linkText("Products")); for
			 * (int i=0; i<1; i++) { chkFBPersist.click (); }
			 */
		        
		               
		        
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainReg myObj = new MainReg();
		myObj.invokeBrowser();
	}
}
	


 
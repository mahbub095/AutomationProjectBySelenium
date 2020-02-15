import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

 

 

public class Cupon {

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
			driver.findElement(By.name("username")).sendKeys("adminvendor12345@gmail.com");
			driver.findElement(By.id("password")).sendKeys("adminvendor12345678");
			driver.findElement(By.name("login")).click();
	
			 WebElement chkFBPersist = driver.findElement(By.linkText("Coupons"));	
		        for (int i=0; i<1; i++) {											
		            chkFBPersist.click (); 			
		             }
		        
		        WebElement productlist = driver.findElement(By.linkText("Add new Coupon"));	
		        for (int i=0; i<1; i++) {											
		        	productlist.click (); 	
		        	
		        	driver.findElement(By.name("title")).sendKeys("ADDDgGGDD");
		        	driver.findElement(By.name("description")).sendKeys("DemoDemoDemoDemoDemoDemoDemo");
		        	Select fruits = new Select(driver.findElement(By.id("discount_type")));
		        	fruits.selectByVisibleText("Percentage Discount");
		   		    driver.findElement(By.name("amount")).sendKeys("55");
		   		 driver.findElement(By.id("email_restrictions")).sendKeys("admin123@gmail.com");
		   		driver.findElement(By.id("usage_limit")).sendKeys("55");
		   		driver.findElement(By.id("dokan-expire")).click();
		   		driver.findElement(By.xpath("//a[text()='15']")).click();
		   		driver.findElement(By.id("checkboxes-2")).click();
		   		driver.findElement(By.id("minium_ammount")).sendKeys("55");
		   		driver.findElement(By.xpath("//*[contains(@class, 'dokan-form-horizontal')]/div[10]/div/span/span/span")).click();
		   		driver.findElement(By.xpath("//li[text()='DDD']")).click();
                driver.findElement(By.id("checkboxes-3")).click();   
                driver.findElement(By.name("coupon_creation")).click();
		        }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cupon myObj = new Cupon();
		myObj.invokeBrowser();
	}

}

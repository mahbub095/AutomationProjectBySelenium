import java.sql.Driver;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class User {

	 

		WebDriver driver;	
		ArrayList locatorList = new ArrayList<By>();
	 
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
				
				driver.findElement(By.name("username")).sendKeys("customerlogin12345@gmail.com");
				driver.findElement(By.id("password")).sendKeys("customerlogin12345");
				driver.findElement(By.name("login")).click();
				   //Selecting Checkbox and using isSelected Method		
		       // driver.get("http://demo.guru99.com/test/facebook.html");					
				 WebElement chkFBPersist = driver.findElement(By.linkText("Orders"));	
				 

			        for (int i=0; i<1; i++) {											
			            chkFBPersist.click (); 			
			           // System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());							
			        }
			        
			        WebElement prod = driver.findElement(By.linkText("Browse products"));	
			     
			        for (int i=0; i<1; i++) {											
			        	prod.click (); 
			    }
			        
			        
			        WebElement cart = driver.findElement(By.linkText("cap"));	
			      //  WebElement addcart = driver.findElement(By.linkText("Add to cart"));	
			     
			        for (int i=0; i<1; i++) {											
			        	cart.click (); 
			        	driver.findElement(By.name("add-to-cart")).click();
			        	driver.findElement(By.linkText("View cart")).click();
			      
			   
			           }
			        
			        
			        WebElement checckout = driver.findElement(By.linkText("Proceed to checkout"));	
				      //  WebElement addcart = driver.findElement(By.linkText("Add to cart"));	
				     
				        for (int i=0; i<1; i++) {											
				        	checckout.click (); 
				        	driver.findElement(By.name("add-to-cart")).click();
				        	driver.findElement(By.linkText("View cart")).click();
			                driver.findElement(By.linkText("Proceed to checkout")).click(); 
				        	driver.findElement(By.name("billing_first_name")).sendKeys("Mahbubur");
				        	driver.findElement(By.name("billing_last_name")).sendKeys("Rahman");
				        	driver.findElement(By.name("billing_address_1")).sendKeys("Dhaka");
				        	driver.findElement(By.name("billing_city")).sendKeys("DDDD");
				        	driver.findElement(By.name("billing_postcode")).sendKeys("99999");
				        	driver.findElement(By.name("billing_phone")).sendKeys("12345678");
				        	
				   
				           }
		
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
			
			
			}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			User myObj = new User();
			myObj.invokeBrowser();
		}
		
	 
	}



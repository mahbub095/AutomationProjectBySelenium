 
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Login {

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
			
			driver.findElement(By.name("username")).sendKeys("adminvendor12345@gmail.com");
			driver.findElement(By.id("password")).sendKeys("adminvendor12345678");
			driver.findElement(By.name("login")).click();
			   //Selecting Checkbox and using isSelected Method		
	       // driver.get("http://demo.guru99.com/test/facebook.html");					
	        
			 WebElement chkFBPersist = driver.findElement(By.linkText("Products"));	
		        for (int i=0; i<1; i++) {											
		            chkFBPersist.click (); 			
		           // System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());							
		        }
		        
		        WebElement productlist = driver.findElement(By.linkText("Add new product"));	
		        for (int i=0; i<1; i++) {											
		        	productlist.click (); 	
		        	
		      
		        			
		        		//	By byEmailNameAndValue = By.xpath("//*[@id=\"select2-product_cat-container\"]");
		        			
		        		//.add(byEmailNameAndValue);
		      
		        	driver.findElement(By.name("post_title")).sendKeys("DUmmyDUmmyDUmmyDUmmyDUmmy");
		        	driver.findElement(By.name("_regular_price")).sendKeys("1234");
		        	driver.findElement(By.name("_sale_price")).sendKeys("12");
		        	
		        	driver.findElement(By.id("select2-product_cat-result-mfks-15")).sendKeys("12");
		        	//select2-product_cat-result-mfks-15
		        	
		        	driver.findElement(By.name("post_excerpt")).sendKeys("DUmmyDUmmyDUmmyDUmmyDUmmy");
		        	driver.findElement(By.linkText("Create & add new")).click();
		        	 
		        	//String color = driver.findElement(By.cssSelector("input#input-text-active-PH")).getCssValue("color");
		           // System.out.println("Facebook Persists Checkbox Status is -  "+chkFBPersist.isSelected());							
		        }
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login myObj = new Login();
		myObj.invokeBrowser();
	}
	
 
	
}

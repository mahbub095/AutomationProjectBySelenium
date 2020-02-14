import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomerReg {

 

		WebDriver driver;	
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
				driver.findElement(By.linkText("Sign Up")).click();
				
				driver.findElement(By.name("email")).sendKeys("dokanadmin123@gmail.com");
				driver.findElement(By.id("reg_password")).sendKeys("WeDevs@Dokan");
				driver.findElement(By.linkText("I am a customer")).click();
			
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			CustomerReg myObj = new CustomerReg();
			myObj.invokeBrowser();
		}
		
	 
		
	}



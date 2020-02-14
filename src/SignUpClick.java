import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpClick {

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
			driver.navigate().to("https://dokan.ajaira.website/");
			driver.findElement(By.linkText("Sign Up")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SignUpClick myObj = new SignUpClick();
		myObj.invokeBrowser();
	}

}


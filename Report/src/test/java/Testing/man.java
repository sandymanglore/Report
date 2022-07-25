package Testing;

import java.io.ObjectInputFilter.Status;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.HTMLReporter;

public class man {
	
	
	@Test
	public static void login() throws InterruptedException {
		
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandesh k. r\\Downloads\\chromedriver_win32 (8)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	 
	
	driver.get("https://www.browserstack.com/users/sign_in");

	WebElement username=driver.findElement(By.xpath("//input[@id='user_email_login']"));
	
	WebElement password=driver.findElement(By.xpath("(//input[@id='user_password'])[1]"));
	WebElement login=driver.findElement(By.xpath("//input[@id='user_submit']"));
	
	Thread.sleep(3000);
	username.sendKeys("abc@gmail.com");
	password.sendKeys("13364@435u");
	Thread.sleep(3000);
	login.click();
	}
}

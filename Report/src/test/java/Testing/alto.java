package Testing;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

 
public class alto {
	
	static    WebDriver driver ;
	static ExtentReports report;
	static ExtentTest test01;
     

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sandesh k. r\\chromedriver_win32 (12)\\chromedriver.exe");
		driver = new ChromeDriver();
	  		
		
  report=new ExtentReports("./sandy./aug10.html");
 test01=report.startTest("test01","flipkart-login");
 
 driver.get("http://www.flipkart.in/");
 test01.log(LogStatus.INFO, "user open the flipkart application:\"http://www.flipkart.in/");
 Screenshot("a");
	
 driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("9741290377");
 test01.log(LogStatus.INFO, "user enter the mobile number");
 Screenshot("b");
	
 driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Sandesh@12");
 test01.log(LogStatus.INFO, "user enter thr password");
 Screenshot("c");
	
 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
 test01.log(LogStatus.INFO, "User clicked Login Button");
 Thread.sleep(3000);
 Screenshot("d");
	
 driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("samsung mobiles");
 test01.log(LogStatus.INFO, "User search for samsung");
 Thread.sleep(3000);
 Screenshot("e");
	
 driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
 test01.log(LogStatus.INFO, "User clicked search Button");
 Screenshot("f");
	
 
 
 report.endTest(test01);
	
	report.flush();
	  
 
	}
public static void Screenshot(String fieldname)throws IOException
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File des=new File("./Screenshot/"+fieldname+".png");
	FileUtils.copyFile( src,des);
	test01.log(LogStatus.INFO,test01.addScreenCapture(des.getAbsolutePath()));
}
	
	
}

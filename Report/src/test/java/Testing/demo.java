package Testing;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class demo {
		
		static    WebDriver driver ;
		static ExtentReports report;
		static ExtentTest test01;
	     

		public static void main(String[] args) throws IOException, InterruptedException {
			// TODO Auto-generated method stub
			  System.setProperty("webdriver.chrome.driver","C:\\selenium drivers\\chromedriver.exe");
		         driver = new ChromeDriver();
		         		
			
	  report=new ExtentReports("./sandy./aug10.html");
	 test01=report.startTest("test01","reg");
	 
	 driver.get("https://demo.guru99.com/test/newtours/register.php");
	 test01.log(LogStatus.INFO, "user open the flipkart application:\"https://demo.guru99.com/test/newtours/register.php/");
    
	 Thread.sleep(8000);
		
	 driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("sandesh");
	 test01.log(LogStatus.INFO, "user enter the name");

	 report.endTest(test01);
		
		report.flush();
		
}}

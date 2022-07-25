package Testing;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reporting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ExtentReports report=new ExtentReports("./Report./Aug06.html");
   
   
   ExtentTest test01= report.startTest("test01", "Gmail Log-in");
   
   
    test01.log(LogStatus.INFO, "Enter the password");
    test01.log(LogStatus.INFO, "Click on Log-in");
   report.endTest(test01);
   
 ExtentTest test02= report.startTest("test02", "Gmail Log-out");
    
   
   report.endTest(test02);
   
   
   report.flush();
	}

}

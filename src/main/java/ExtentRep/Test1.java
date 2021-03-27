package ExtentRep;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Test1 {
	WebDriver driver;
	ExtentHtmlReporter reporter;
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeTest
	public void setExtent()
	{
		reporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/MyclassReport.html");//*
		reporter.config().setReportName("My class reports ext");
		reporter.config().setDocumentTitle("Demo report");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();//*
		extent.attachReporter(reporter);//*
		extent.setSystemInfo("Host name", "Anush");
		extent.setSystemInfo("Environment", "Qa");
		extent.setSystemInfo("Author", "AnushReddy");
	}
	@AfterTest
	public void end()
	{
		extent.flush();
	}
@BeforeMethod
public void browser()
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	driver=new ChromeDriver();
}
@Test
public void login()
{
	test=extent.createTest("login");
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("anush505@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("@sai1234$");
	driver.findElement(By.id("u_0_b")).click();
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title,"log in or sign up");
}
@AfterMethod
public void endReport(ITestResult re) throws Exception
{
	if(re.getStatus()==ITestResult.SUCCESS)
	{
		test.log(Status.PASS, "Test is passed"+re.getName());
		test.log(Status.PASS, MarkupHelper.createLabel(re.getName(), ExtentColor.GREEN));
	}
	else if(re.getStatus()==ITestResult.FAILURE)
	{
		test.log(Status.FAIL, "Test is failed"+re.getName());
		String screenshotpath=Test1.getScreenShot(driver, re.getName());
		test.addScreenCaptureFromPath(screenshotpath);
	}
	else if(re.getStatus()==ITestResult.SKIP)
	{
		test.log(Status.SKIP, "Test is skipped"+re.getName());
	}
	
}
public static String getScreenShot(WebDriver driver,String screenshotname) throws Exception
{
	 String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
	 TakesScreenshot ts=(TakesScreenshot)driver;
	 File source = ts.getScreenshotAs(OutputType.FILE);
	 String destination=System.getProperty("user.dir")+"/screenshots/"+screenshotname+dateName+".png";
	 File finaldestination=new File(destination);
	 FileUtils.copyFile(source, finaldestination);
	 return destination;
}
}

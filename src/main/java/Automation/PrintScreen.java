package Automation;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintScreen {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("anush505@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("@sai12$");
	driver.findElement(By.id("u_0_b")).click();
	String title = driver.getTitle();
	System.out.println(title);
	if(title.equals("log in or sign up"))
	{
		System.out.println("you are in home page");
	}
	else
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination="./screenshot/fb.png";
		File target=new File(destination);
		FileUtils.copyFile(source, target);
	}
}
}

package Automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingPopUp {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
	String handle = driver.getWindowHandle();
	//System.out.println(handle);
	driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
	Set<String> handles = driver.getWindowHandles();
	System.out.println(handles);
	for(String han:handles)
	{
		if(!handle.equalsIgnoreCase(han))
		{
			driver.switchTo().window(han);
			driver.findElement(By.name("q")).sendKeys("automation");
		}
	}
	
}
}
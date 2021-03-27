package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.id("email")).sendKeys("anush505");
	driver.findElement(By.id("pass")).sendKeys("123456");
}
}

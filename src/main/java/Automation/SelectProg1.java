package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectProg1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/anush/Desktop/month1.html");
	WebElement mon = driver.findElement(By.id("month"));
	Select s=new Select(mon);
	s.selectByIndex(1);
	s.selectByVisibleText("May");
	s.selectByIndex(4);
	Thread.sleep(3000);
	s.deselectByIndex(1);
}
}

package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class First {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
public static void main(String[] args) throws Exception 
{
	 WebDriver driver=new ChromeDriver();
	 driver.get("http://demo.guru99.com/test/newtours/");
	 driver.findElement(By.linkText("REGISTER")).click();
	 Thread.sleep(2000);
	 driver.manage().window().maximize();
	driver.findElement(By.name("firstName")).sendKeys("harish");
	Thread.sleep(2000);
	driver.findElement(By.name("lastName")).sendKeys("chandra");
	 WebElement coulist = driver.findElement(By.name("country"));
	 Select se=new Select(coulist);
	 List<WebElement> list = se.getOptions();
	 for(WebElement li:list)
	 {
		// System.out.println(li.getText());
		 String text = li.getText();
		 System.out.println(text);
	 }
}
}

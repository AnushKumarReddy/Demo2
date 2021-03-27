package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Tab {
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
	Actions act=new Actions(driver);
	act.sendKeys(Keys.TAB)
	.sendKeys("posa")
	.sendKeys(Keys.TAB)
	.sendKeys("949233333").build().perform();
	
	

}
}
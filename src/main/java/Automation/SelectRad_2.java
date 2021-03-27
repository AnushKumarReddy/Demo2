package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectRad_2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
	//driver.findElement(By.id("java")).click();
	driver.manage().window().maximize();
	List<WebElement> elements = driver.findElements(By.xpath("//input[@type='radio' and @name='lang']"));
for(WebElement ele:elements)
{
	String attribute = ele.getAttribute("value");
	System.out.println(attribute);
	if(attribute.equalsIgnoreCase("java"))
	{
		ele.click();
	}
}
}
}
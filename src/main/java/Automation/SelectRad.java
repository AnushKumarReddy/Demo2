package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectRad {
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
	int size = elements.size();
	for(int i=0;i<size;i++)
	{
		WebElement button_title= elements.get(i);
		String attribute = button_title.getAttribute("value");
		if(attribute.equalsIgnoreCase("python"))
		{
			button_title.click();
		}
	}
}
}

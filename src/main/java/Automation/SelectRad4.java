package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectRad4 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
	driver.manage().window().maximize();
	//WebElement element = driver.findElement(By.id("male"));
	/*int x = element.getLocation().getX();
	int y = element.getLocation().getY();
	System.out.println(x);
	System.out.println(y);*/
	List<WebElement> elements = driver.findElements(By.id("male"));
	for(WebElement el:elements)
	{
		int x = el.getLocation().getX();
		if(x!=0)
		{
			el.click();
		}
	}

}
}
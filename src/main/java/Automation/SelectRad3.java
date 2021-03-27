package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectRad3 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
	driver.manage().window().maximize();
	List<WebElement> elements = driver.findElements(By.id("male"));
	WebElement female = driver.findElement(By.id("female"));
	int x2 = female.getLocation().getX();
	int y = female.getLocation().getY();
	System.out.println(x2);
	System.out.println(y);
	int size = elements.size();
	//System.out.println(size);
	for(int i=0;i<size;i++)
	{
		WebElement hiddenele = elements.get(i);
		int x = hiddenele.getLocation().getX();
		if(x!=0)
		{
			hiddenele.click();
		}
		
		
	}
}
}

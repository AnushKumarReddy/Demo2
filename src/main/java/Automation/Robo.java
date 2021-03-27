package Automation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robo {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws AWTException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	Robot r =new Robot();
	r.keyPress(KeyEvent.VK_ALT);
	r.keyPress(KeyEvent.VK_F4);
	r.keyRelease(KeyEvent.VK_F4);
	r.keyRelease(KeyEvent.VK_ALT);
	
}
}

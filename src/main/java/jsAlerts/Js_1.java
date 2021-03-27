package jsAlerts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Js_1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("alert('hello')");
	driver.switchTo().alert().dismiss();
}
}

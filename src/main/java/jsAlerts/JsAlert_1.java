package jsAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsAlert_1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		/*js.executeScript("alert('hello')");
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.dismiss();*/
		js.executeScript("prompt('enter your name')");
		Thread.sleep(3000);
		 driver.switchTo().alert().sendKeys("java");
		//alert.sendKeys("anush");
		//alert.accept();
		Thread.sleep(3000);
		//js.executeScript("confirm('are you sure')");
		//Thread.sleep(3000);
		//alert.dismiss();
		
	}

}

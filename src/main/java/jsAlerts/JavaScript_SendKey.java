 package jsAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript_SendKey {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.get("https://login.yahoo.com/?.src=ym&lang=en-IN&done=https%3A%2F%2Fin.mail.yahoo.com%2F%3Fguce_referrer%3DaHR0cHM6Ly93d3cuZ29vZ2xlLmNvbS8%26guce_referrer_sig%3DAQAAAC1NyyJzVozpiF1ub6f95makgrcA4JljY8XGUBY2wfKLEae6mv5UAp22yvQEqEICwtx_qFHjg58SDdGybUw0mvumX8LgZhesYaaEJ0Po37AhgWTGkFJNF8nxFkmRRX0xrRwHrP-y9FEAUFokWcHfgDBxgKhJFR592QJ3CutMfDIv");
    WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
    WebElement check = driver.findElement(By.xpath("//label[@for='persistent']"));
    //check.click();
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("arguments[0].value='anush505'", username);
    Thread.sleep(3000);
   js.executeScript("arguments[0].click()", check);
   Thread.sleep(3000);
   js.executeScript("scrollBy(0,400)");
   
    
}
}

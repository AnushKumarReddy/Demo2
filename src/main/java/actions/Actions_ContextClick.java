package actions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_ContextClick {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	Actions act=new Actions(driver);
 WebElement element = driver.findElement(By.xpath("//span[text()='right click me']"));
 act.contextClick(element).build().perform();
 Thread.sleep(3000);
 driver.findElement(By.xpath("//span[text()='Copy']")).click();
 Alert alert = driver.switchTo().alert();
 String text = alert.getText();
 System.out.println(text);
 Thread.sleep(3000);
 alert.dismiss();
	
	

}
}

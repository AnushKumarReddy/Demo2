package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_DragAndDrop {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/droppable/");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
	WebElement target = driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
	Actions act=new Actions(driver);
	//act.dragAndDrop(source, target).build().perform();

	act.clickAndHold(source)
	.moveToElement(target)
	.release().build().perform();
	
}
}

package Automation;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get(" ");
	driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
	WebDriverWait wait=new WebDriverWait(driver,5);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));
	WebElement element = driver.findElement(By.xpath("//p[text()='WebDriver']"));
	
	boolean displayed = element.isDisplayed();
	if(displayed)
	{
	System.out.println("element found :"+element.getText());
	}
	else
	{
		System.out.println("element not found");
	}
	
}
}

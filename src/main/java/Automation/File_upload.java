package Automation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class File_upload {
	static {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/FileUpload.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement findElement = driver.findElement(By.xpath("//input[@id='input-4']"));
		// findElement.click();
		Actions action = new Actions(driver);
		action.moveToElement(findElement).click().build().perform();
		Runtime.getRuntime().exec("C:\\Users\\anush\\Desktop\\java desk\\autoit\\openfile.exe");

	}


}

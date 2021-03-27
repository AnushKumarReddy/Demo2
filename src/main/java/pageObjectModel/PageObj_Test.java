package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageObj_Test {
	WebDriver driver;
	@Test
	public void loginVerify()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe"); 
		 driver=new ChromeDriver();
		 driver.get("http://demo.guru99.com/V1/index.php");
		 driver.manage().window().maximize();
		 PageObj po=new PageObj(driver);
		 po.setUsername("mngr291770");
		 po.setPassword("dahYzuj");
		 po.setLogin();
	}

}

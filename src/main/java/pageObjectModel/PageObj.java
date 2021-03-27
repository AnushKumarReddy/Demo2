package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObj {
	WebDriver driver;
@FindBy(xpath="//input[@name='uid']")
WebElement username;
@FindBy(xpath="//input[@name='password']")
WebElement password;
@FindBy(xpath="//input[@value='LOGIN']")
WebElement button;


public PageObj(WebDriver driver)
{
	this.driver=driver;
	
	PageFactory.initElements(driver, this);
}
public void setUsername(String uid)
{
	username.sendKeys(uid);
}
public void setPassword(String pwd)
{
	password.sendKeys(pwd);
}
public void setLogin()
{
	button.click();
}
}

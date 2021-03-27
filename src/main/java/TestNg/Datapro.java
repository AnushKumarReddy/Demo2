package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datapro {
	@Test(dataProvider = "data")
	public void login(String uname,String pwd)
	{
		System.out.println("my user name is :"+uname);
		System.out.println("my password is :"+pwd);
	}
	
	
	@DataProvider(name="data")
	public Object[][] dp()
	{
		Object[][] obj=new Object[3][2];
		obj[0][0]="anush505";
		obj[0][1]="1234";
		obj[1][0]="harish";
		obj[1][1]="5678";
		obj[2][0]="chandra";
		obj[2][1]="2345";
		return obj;
	}
	
	
	
}

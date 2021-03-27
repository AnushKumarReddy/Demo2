package TestNg;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DummyTest1 {
	@AfterMethod
	public void at()
	{
		System.out.println("test done");
	}
	@BeforeMethod
	public void bt()
	{
		System.out.println("test is going to start");
		
	}
	@Test(groups="chandra")
	public void method1()
	{
		System.out.println("this is method 1");
	}
	@Test(groups = "harish")
	public void method2()
	{
		System.out.println("this is method 2");
	}
	@Test
     public void method3()
   {
	System.out.println("this is method 3");
   }
}

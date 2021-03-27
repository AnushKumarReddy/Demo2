package TestNg;

import org.testng.annotations.Test;

public class DummyTest2 {
@Test
public void method4()
{
	System.out.println("this is method 4");
}
@Test(groups = "harish")
public void method5()
{
	System.out.println("this is method 5");
}
@Test
public void method6()
{
	System.out.println("this is method 6");
}
}

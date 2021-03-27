package DummyTestNg;

import org.testng.annotations.Test;

public class Test1 {
	@Test(groups="harish")
	public void m1()
	{
		System.out.println("this is method 1");
	}
	@Test(groups="anush")
	public void m2()
	{
		System.out.println("This is method 2");
	}
   @Test
public void m3()
{
	System.out.println("This is method 3");
}
}

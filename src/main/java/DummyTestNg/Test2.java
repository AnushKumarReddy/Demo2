package DummyTestNg;


import org.testng.annotations.Test;

public class Test2 {
	@Test()
	public void m4()
	{
		System.out.println("this is method 4");
	}
	@Test(groups = "harish")
	public void m5()
	{
		System.out.println("This is method 5");
	}
   @Test
   public void m6()
{
	System.out.println("This is method 6");
	
}

}

package DummyTestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	@Parameters({"browser","url","username"})
	@Test
	public void login(String page,String link,String uid )
	{
		System.out.println("browser name is "+page);
		System.out.println("url is:"+link);
		System.out.println("username is:"+uid);
	}

}

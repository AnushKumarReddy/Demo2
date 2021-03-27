package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters1 {
	@Parameters({"url","username","password"})
	@Test
	public void login(String pagename,String uid,String pwd)
	{
		
	System.out.println("my url name is :"+pagename);
	System.out.println("my username is :"+uid);
	System.out.println("my password is :"+pwd);

}
}
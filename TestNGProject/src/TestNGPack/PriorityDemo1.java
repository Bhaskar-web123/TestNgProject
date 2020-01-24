package TestNGPack;

import org.testng.annotations.Test;

public class PriorityDemo1
{

	@Test(priority=1)
	public void startapp()
	{
		System.out.println("Start App ");
	}
	@Test(priority=0)
	public void login()
	{
		System.out.println("Login to App ");
	}
	@Test(priority=0)
	public void logoff()
	{
		System.out.println("Log out of App");
	}
}

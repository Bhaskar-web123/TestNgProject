package TestNGPack;

import org.testng.annotations.Test;

public class DependsOnMethodDemo1 {


	@Test()
	public void startapp()
	{
		System.out.println("Start App ");
	}
	@Test(dependsOnMethods="startapp")
	public void login()
	{
		System.out.println("Login to App ");
	}
	@Test(dependsOnMethods="login")
	public void logoff()
	{
		System.out.println("Log out of App");
	}
}

package TestNGPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.testing.Assert;

public class AlwaysRunDemo 
{
	WebDriver driver;
	@Test()
	public void startapp()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		System.out.println("Start App");
	}
	@Test(dependsOnMethods="srartapp")
	public void  checktitle()
	{
		
		driver.findElement(By.id("Email")).sendKeys("bhaskarakula00@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("bhasu@1987");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		String expname="Demowebstore";
		String actname=driver.getTitle();
		Assert.assertEquals(expname, actname);
		Assert.assertEquals(expected, actual);
		driver.findElement(By.linkText("Log out")).click();
		System.out.println("Logoff the App");
	}
	@Test(dependsOnMethods="login",alwaysRun=true)
	public void logoff()
	{
		driver.close();
	}
}

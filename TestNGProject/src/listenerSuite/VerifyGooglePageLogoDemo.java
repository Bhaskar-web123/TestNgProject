package listenerSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerifyGooglePageLogoDemo
{
WebDriver driver;
@BeforeMethod
public void startapp()
{
	System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
}
	@Test
	public void checktitle()
	{
		String title=driver.getTitle();
		String expectTitle="google";
		Assert.assertEquals(expectTitle,title);
	}
	@Test(priority=1)
	public void checkLogo()
	{
		boolean logo=driver.findElement(By.id("hplogo")).isDisplayed();
		Assert.assertTrue(logo);
	}
	@AfterMethod
	public void closebrowser()
	{
		driver.quit();
	}
}

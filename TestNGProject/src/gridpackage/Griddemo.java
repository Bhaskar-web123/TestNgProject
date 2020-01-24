package gridpackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Griddemo
{

	public WebDriver driver;
	@Test
	public void verifylogin() throws MalformedURLException
	{
		DesiredCapabilities capabilities=DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WINDOWS);
		driver=new RemoteWebDriver(new URL("http://172.23.102.18:4455/wd/hub") ,capabilities);
		driver.get("http://demowebshop.tricentis.com/login");
		String title=driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("rekharb1@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("rekhab");
		driver.findElement(By.xpath("//span[@class='forgot-password']")).click();
		System.out.println("Sucsessfully Logged in");
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		driver.close();
	}
}

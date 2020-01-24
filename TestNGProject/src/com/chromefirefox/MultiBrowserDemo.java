package com.chromefirefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserDemo
{
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception
	{
		if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\seleniumGH20software\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else
		{
				//System.out.println("Invalid Browser");
				throw new Exception("Browser is not Correct");
		}
	}
	@Test
	public void login() throws InterruptedException
	{
		driver.get("http://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("bhaskarakula00@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("bhasu@1987");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.linkText("Log out")).click();
	}
	@AfterTest
	public void endTest()
	{
		driver.quit();
	}
}

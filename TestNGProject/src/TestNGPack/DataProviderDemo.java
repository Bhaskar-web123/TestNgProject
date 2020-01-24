package TestNGPack;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DataProviderDemo 
{
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String username, String password)
  {
		driver.findElement(By.name())
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    		{
    			new Object[] { "rekhabr1@gmail.com", "rekhab" },
    			new Object[] { "rekhabr3@gmail.com", "rekhab" },
    		};
  }
  @BeforeTest
  public void beforeTest()
  {
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
  }

  @AfterTest
  public void afterTest()
  {
	  driver.quit();
  }

}

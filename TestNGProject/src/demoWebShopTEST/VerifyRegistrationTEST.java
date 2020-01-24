package demoWebShopTEST;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pomdemo1.RegistrationPOM;

//import demoWebShopPOM.RegistrationPOM;

public class VerifyRegistrationTEST
{
	public WebDriver driver;
	@Test
	public void startapplication() throws InterruptedException, MalformedURLException
	{
		/*System.setProperty("webdriver.chrome.driver", "E:\\selenium\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		WebDriver[] driver=new WebDriver[2];
		//WebDriver[] driver=new WebDriver[2];
		String baseurl="http://demowebshop.tricentis.com/register";
		String[] nodeUrl =new String[2];
		nodeUrl[0]="http://172.23.102.8:4567/wd/hub";
		//nodeUrl[1]="http://172.23.102.8:7890/wd/hub";
		//driver=new RemoteWebDriver(new URL(nodeUrl[0]),pavan); 
		//driver.navigate().to("http://demowebshop.tricentis.com/register");
		//driver.manage().window().maximize();
		//FirefoxOptions options =new FirefoxOptions();
		DesiredCapabilities capabilitysC=DesiredCapabilities.chrome();
		capabilitysC.setBrowserName("chrome");
		capabilitysC.setPlatform(Platform.WINDOWS);
		//RegistrationPOM registration=new RegistrationPOM(driver);
		driver[0]=new RemoteWebDriver(new URL(nodeUrl[0]),capabilitysC);
		driver[0].get(baseurl);
		driver[0].manage().window().maximize();
		driver[0].manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		RegistrationPOM registration=new RegistrationPOM(driver[0]);
		registration.entergender();
		registration.enterfirstname("bhaskar");
		registration.enterlastname("akula");
		registration.enteremail("bhaskarakula123@gmail.com");
		registration.enterpassword("chinna@1234");
		registration.entercpassword("chinna@1234");
		registration.clickregister();
		driver[0].close();
	
		DesiredCapabilities capabilitysF =DesiredCapabilities.firefox();
		//options.merge(capabilitysF);
		capabilitysF.setBrowserName("firefox");
		capabilitysF.setPlatform(Platform.WINDOWS);
		driver[1]=new RemoteWebDriver(new URL(nodeUrl[0]),capabilitysF);
		
		driver[1].get(baseurl);
		driver[1].manage().window().maximize();
		driver[1].manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		RegistrationPOM registration1=new RegistrationPOM(driver[1]);
		registration1.entergender();
		registration1.enterfirstname("bhaskar");
		registration1.enterlastname("akula");
		registration1.enteremail("bhaskarakula143@gmail.com");
		registration1.enterpassword("chinna@1234");
		registration1.entercpassword("chinna@1234");
		registration1.clickregister();
		driver[1].close();
	}
}

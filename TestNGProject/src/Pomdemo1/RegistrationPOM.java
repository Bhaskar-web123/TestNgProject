package Pomdemo1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPOM
{
	WebDriver driver;
	By gender=By.xpath("//label[contains(text(),'Female')]");
	By firstname=By.id("FirstName");
	By lastname=By.xpath("//input[@id='LastName']");
	By email=By.id("Email");
	By password=By.xpath("//input[@id='Password']");
	By confirmpassword=By.xpath("//input[@id='ConfirmPassword']");
	By register=By.xpath("//input[@id='register-button']");
	By logout=By.xpath("@[@class='ico-logout']");
	
	public RegistrationPOM(WebDriver driver){
		this.driver=driver;
	}
   public void entergender(){
	   driver.findElement(gender).click();
   }
   public void enterfirstname(String name){
	   driver.findElement(firstname).sendKeys(name);
   }
   
   public void enterlastname(String name2){
	   driver.findElement(lastname).sendKeys(name2);
   }
   public void enteremail(String email1){
	   driver.findElement(email).sendKeys(email1);
   }
   public void enterpassword(String PWD){
	   driver.findElement(password).sendKeys(PWD);
   }
   public void entercpassword(String CPWD){
	   driver.findElement(confirmpassword).sendKeys(CPWD);
   }
   public void clickregister(){
	   driver.findElement(register).click();
   }
   public void clicklogout(){
	   driver.findElement(logout).click();
	   
   }
	
}


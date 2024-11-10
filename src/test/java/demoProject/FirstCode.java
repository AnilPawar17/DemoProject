package demoProject;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FirstCode 
{
	
	 static WebDriver driver;
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	   @Test
	  static void InvokeBrowser() throws InterruptedException
	   {
		  
		  DesiredCapabilities capability=new DesiredCapabilities();
		
		  ChromeOptions option=new ChromeOptions();
		   driver=new ChromeDriver(option);
		 //  option.addArguments("...Incognito");
		   driver.get("https://www.flipkart.com");
		   option.addArguments("...dissable popup");
		   Thread.sleep(1000);
		   driver.manage().window().maximize();
		   Thread.sleep(1000);
		  
	   }
	   
	  static void loginFlipkart() throws InterruptedException
	  {
		  //Login Button path
          WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(), 'Login')]"));
          loginButton.click();
          
          //User name field path
          WebElement usernameField = driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
          usernameField.sendKeys("8139985363");
          
          //Request OTP
          driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']")).click();
          Thread.sleep(10000);
          
          //Verify OTP
          driver.findElement(By.xpath("//button[@class=' QqFHMw llMuju M5XAsp']")).click();
          Thread.sleep(1000);
		
		}
	  
	static void BrowserTeardown()
	   {
	   driver.close();  
	   }
	  
   public static void main(String[] args) throws InterruptedException
   {
	   FirstCode.InvokeBrowser();
	   FirstCode.loginFlipkart();
	   FirstCode.BrowserTeardown();
	
	    
   }
}

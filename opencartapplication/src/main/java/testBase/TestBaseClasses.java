package testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import utill.UtillClassPage;

public class TestBaseClasses {
	
	public static WebDriver driver;
	
	public UtillClassPage excel;
	
	@BeforeMethod
	public void setup()
	{
		String browser="Chrome";
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();
		}
	else if(browser.equalsIgnoreCase("FireFox"))
		{
			driver=new FirefoxDriver();
		}
	else if(browser.equalsIgnoreCase("edge"))
	{
		driver=new EdgeDriver();
	}
	else
	{
		System.out.println("default Browser");
	}
		driver.get("https://naveenautomationlabs.com/opencart/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		excel=new UtillClassPage();
		
	}
	
	/*@AfterMethod
	public void tearDown()
	{
		driver.quit();
	} */
}
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBaseClasses;

public class HomePage extends TestBaseClasses{
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	private WebElement myaccount_link;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	private WebElement login_tab;
	
	public void clickmyaccount_link()
	{
		myaccount_link.click();
	}
	
	public void clicklogin_tab()
	{
		login_tab.click();
	}

}

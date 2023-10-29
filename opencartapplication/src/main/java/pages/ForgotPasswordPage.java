package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
	
	public ForgotPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
 
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement email_txtbox;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continue_btn;
	
	
	public void enteremail_txt(String email)
	{
		email_txtbox.sendKeys(email);
	}
	
	public void clickcontine_btn()
	{
		continue_btn.click();
	}
}

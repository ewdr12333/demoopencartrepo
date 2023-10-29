package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
		public LoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath="//input[@id='input-email']")
		private WebElement username_txtbox;
		
		@FindBy(xpath="//input[@id='input-password']")
		private WebElement password_txtbox;
		
		@FindBy(xpath="//input[@type='submit']")
		private WebElement login_btn;
		
		public void enterusername_txt(String username)
		{
			username_txtbox.sendKeys(username);
		}
		
		public void enterpassword_txt(String password)
		{
			password_txtbox.sendKeys(password);
		}
		
		
		public void clicklogin_btn()
		{
			login_btn.click();
		}
		
		
	


}




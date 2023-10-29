package testLayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ForgotPasswordPage;
import pages.HomePage;
import pages.LoginPage;
import testBase.TestBaseClasses;
import utill.UtillClassPage;

public class ForgetPasswordTest extends TestBaseClasses {
	
	@Test(priority=0)
	public void validateforgetPassword() throws IOException
	{
		HomePage HomePage_obj=new HomePage(driver);
		LoginPage LoginPage_obj=new LoginPage(driver);
		ForgotPasswordPage ForgotPasswordPage_obj=new ForgotPasswordPage(driver);
		HomePage_obj.clickmyaccount_link();
		HomePage_obj.clicklogin_tab();
		LoginPage_obj.clickforgetpassLink();
		ForgotPasswordPage_obj.enteremail_txt(UtillClassPage.readtestdata("fpass", 1, 0));
		ForgotPasswordPage_obj.clickcontine_btn();
		String actual="Account Login";
		String expect=driver.getTitle();
		if(actual.equals(expect))
		{
			UtillClassPage.writetestdata(1, 1, 1, "Pass");
			UtillClassPage.writetestdata(1, 1, 1, "Pass");
		}
		else
		{
			UtillClassPage.writetestdata(1, 1, 1, "Fail");
		}
		
		Assert.assertEquals(actual, expect);
	}

	@Test(priority=1)
	
	public void invalidmailidvalidateforgetPassword() throws IOException
	{
		HomePage HomePage_obj=new HomePage(driver);
		LoginPage LoginPage_obj=new LoginPage(driver);
		ForgotPasswordPage ForgotPasswordPage_obj=new ForgotPasswordPage(driver);
		HomePage_obj.clickmyaccount_link();
		HomePage_obj.clicklogin_tab();
		LoginPage_obj.clickforgetpassLink();
		ForgotPasswordPage_obj.enteremail_txt(UtillClassPage.readtestdata("fpass", 2, 0));
		ForgotPasswordPage_obj.clickcontine_btn();
		String actual="Account Login";
		String expect=driver.getTitle();
		if(actual.equals(expect))
		{
			UtillClassPage.writetestdata(1, 2, 1, "Pass");
		}
		else
		{
			UtillClassPage.writetestdata(1, 2, 1, "Fail");
		}
		
		Assert.assertEquals(actual, expect);
	}
	
	
	
}

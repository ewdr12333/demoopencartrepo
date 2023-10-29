package testLayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import testBase.TestBaseClasses;
import utill.UtillClassPage;

public class LoginTest extends TestBaseClasses {
	
	
	@Test(priority=0)
	
	public void validatevalidusernameandvalidpasswordTest() throws IOException
	{
		HomePage HomePage_obj=new HomePage(driver);
		LoginPage LoginPage_obj=new LoginPage(driver);
		HomePage_obj.clickmyaccount_link();
		HomePage_obj.clicklogin_tab();
		LoginPage_obj.enterusername_txt(UtillClassPage.readtestdata("login", 1, 0));
		LoginPage_obj.enterpassword_txt(UtillClassPage.readtestdata("login", 1, 1));
		LoginPage_obj.clicklogin_btn();
		String actual="My Account";
		String expect=driver.getTitle();
		if(actual.equals(expect))
		{
			UtillClassPage.writetestdata(0, 1, 2, "Pass");
		}
		else
		{
			UtillClassPage.writetestdata(0, 1, 2, "Fail");
		}
		
		Assert.assertEquals(actual, expect);
	}
	
	@Test(priority=1)
	public void validateInvalidusernameandvalidpasswordTest() throws IOException
	{
		HomePage HomePage_obj=new HomePage(driver);
		LoginPage LoginPage_obj=new LoginPage(driver);
		HomePage_obj.clickmyaccount_link();
		HomePage_obj.clicklogin_tab();
		LoginPage_obj.enterusername_txt(UtillClassPage.readtestdata("login", 2, 0));
		LoginPage_obj.enterpassword_txt(UtillClassPage.readtestdata("login", 2, 1));
		LoginPage_obj.clicklogin_btn();
		String actual="My Account";
		String expect=driver.getTitle();
		if(actual.equals(expect))
		{
			UtillClassPage.writetestdata(0, 2, 2, "Pass");
		}
		else
		{
			UtillClassPage.writetestdata(0, 2, 2, "Fail");
		}
		
		Assert.assertEquals(actual, expect);
	}
	@Test(priority=2)
	public void validatevalidusernameandInvalidpasswordTest() throws IOException
	{
		HomePage HomePage_obj=new HomePage(driver);
		LoginPage LoginPage_obj=new LoginPage(driver);
		HomePage_obj.clickmyaccount_link();
		HomePage_obj.clicklogin_tab();
		LoginPage_obj.enterusername_txt(UtillClassPage.readtestdata("login", 3, 0));
		LoginPage_obj.enterpassword_txt(UtillClassPage.readtestdata("login", 3, 1));
		LoginPage_obj.clicklogin_btn();
		String actual="My Account";
		String expect=driver.getTitle();
		if(actual.equals(expect))
		{
			UtillClassPage.writetestdata(0, 3, 2, "Pass");
		}
		else
		{
			UtillClassPage.writetestdata(0, 3, 2, "Fail");
		}
		
		Assert.assertEquals(actual, expect);
	}
	@Test(priority=3)
	public void validateInvalidusernameandInvalidpasswordTest() throws IOException
	{
		HomePage HomePage_obj=new HomePage(driver);
		LoginPage LoginPage_obj=new LoginPage(driver);
		HomePage_obj.clickmyaccount_link();
		HomePage_obj.clicklogin_tab();
		LoginPage_obj.enterusername_txt(UtillClassPage.readtestdata("login", 4, 0));
		LoginPage_obj.enterpassword_txt(UtillClassPage.readtestdata("login", 4, 1));
		LoginPage_obj.clicklogin_btn();
		String actual="My Account";
		String expect=driver.getTitle();
		if(actual.equals(expect))
		{
			UtillClassPage.writetestdata(0, 4, 2, "Pass");
		}
		else
		{
			UtillClassPage.writetestdata(0, 4, 2, "Fail");
		}
		
		Assert.assertEquals(actual, expect);
	}
	
	
	
	}


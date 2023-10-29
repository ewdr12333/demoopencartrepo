package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utill.UtillClassPage;

public class ProductDetailPage {
	
	
	public ProductDetailPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[text()='Desktops']")
	private WebElement dektop_tab;
	
	@FindBy(xpath="//a[text()='Mac (1)']")
	private WebElement mac_tab;
	
	@FindBy(xpath="//select[@id='input-sort']")
	private WebElement sortby_dropdown;
	
	@FindBy(xpath="//select[@id='input-limit']")
	private WebElement show_dropdown;
	
	
	
	public void clickondesktop_Tab()
	{
		UtillClassPage.moveToElement(dektop_tab);
			
	}

		public void clickonmac_Tab()
	{
		mac_tab.click();
	}
	
	public void sortbydropdown_select(String product)
	{
		
		UtillClassPage.dropdownHandle(product,sortby_dropdown);
	}
	
	
	public void showdropdown_select(String product)
	{
		UtillClassPage.dropdownHandle(product,show_dropdown);
	}
	
}

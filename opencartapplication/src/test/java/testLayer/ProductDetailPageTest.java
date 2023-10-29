package testLayer;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.ProductDetailPage;
import testBase.TestBaseClasses;

public class ProductDetailPageTest extends TestBaseClasses {
	
	@Test
	public void validateproductdetailPage() throws InterruptedException
	{
		HomePage HomePage_obj=new HomePage(driver);
		ProductDetailPage ProductDetailPage_obj=new ProductDetailPage(driver);
		Thread.sleep(2000);
		ProductDetailPage_obj.clickondesktop_Tab();
		ProductDetailPage_obj.clickonmac_Tab();
		ProductDetailPage_obj.sortbydropdown_select("Name (Z - A)");
		ProductDetailPage_obj.showdropdown_select("75");
		
	}

}

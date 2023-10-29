package utill;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import testBase.TestBaseClasses;

public class UtillClassPage extends TestBaseClasses {
	
	static String path="C:\\Users\\Admin\\Desktop\\demoopencartrepo\\opencartapplication\\Resource\\Testdata111.xlsx";
	public static String readtestdata(String sheet_nm,int row_nm,int cell_nm) throws IOException
	{
		
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFCell cell=wb.getSheet(sheet_nm).getRow(row_nm).getCell(cell_nm);
		DataFormatter df=new DataFormatter();
		String data1=df.formatCellValue(cell);
		return data1;
	}
	
	public static void writetestdata(int sheet_index,int row_nm,int cell_nm, String data) throws IOException
	{
		File file=new File(path);
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis); 
		XSSFSheet sheet=wb.getSheetAt(sheet_index);
		sheet.getRow(row_nm).createCell(cell_nm).setCellValue(data);
		FileOutputStream fos=new FileOutputStream(file);
		wb.write(fos);
	}
	
	public static void dropdownHandle(String prouct,WebElement dropdown)
	
	{
		Select s=new Select(dropdown);
		s.selectByVisibleText(prouct);
				
	}
	
	public static void moveToElement(WebElement dektop_tab)
	{
		Actions act=new Actions(driver);
		act.moveToElement(dektop_tab).build().perform();
		
	}

	public static void getScreenshot(String fname)
	{
	
		TakesScreenshot tc=(TakesScreenshot)driver;
		File src=tc.getScreenshotAs(OutputType.FILE);
		File desc= new File("C:\\Users\\Admin\\Desktop\\demoopencartrepo\\opencartapplication\\Screenshort\\"+fname+" .png");
		try {
			FileHandler.copy(src, desc);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	
	
}

	


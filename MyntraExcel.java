package com.qa.testscript;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.MyntraPages;
import com.qa.utility.ExcelUtility;

public class MyntraExcel extends MyntraBase {
	@Test
	(dataProvider="getData")
	public void SearchShirt(String Input) throws InterruptedException{
	MyntraPages	MyntraOR=new MyntraPages(driver);
		
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		MyntraOR.getSearchBox().sendKeys(Input);
		MyntraOR.getSearchSym().click();
		MyntraOR.getShirt().click();
		Set<String> win=driver.getWindowHandles();
		String han=null;
		for(String s:win)
		{
			System.out.println(s);
			han=s;
		}
		System.out.println(han);//to switch to the new tab
		driver.switchTo().window(han);
		Thread.sleep(3000);
		MyntraOR.getSize().click();
		Thread.sleep(2000);
	
		MyntraOR.getAddtoBag().click();
		Thread.sleep(2000);
		MyntraOR.getBag().click();
		MyntraOR.getPlaceorder().click();
		
	}


@DataProvider
public String[] [] getData() throws IOException{
	String xlPath="C:\\Users\\balaj\\eclipse-workspace\\SeleniumAuto\\src\\test\\java\\com\\qa\\testdata\\Testdata.xlsx";
	String xlSheet="Sheet2";
	
	int rowCount =ExcelUtility.getRowCount(xlPath, xlSheet);
	
	int cellCount=ExcelUtility.getCellCount(xlPath, xlSheet, rowCount);
	
	String[] [] data =new String[rowCount] [cellCount];
	for(int i=1;i<=rowCount;i++) {
		for(int j=0;j<cellCount;j++) {
			data[i-1][j]=ExcelUtility.getCellData(xlPath, xlSheet, i, j);
		}
	}

	  return data;
	  
			 
	
	}
	       
	       
	       
}

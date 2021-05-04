package com.qa.testscript;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.testng.annotations.Test;

import com.qa.pages.MyntraPages;


public class Myntra extends MyntraBase {
	@Test
	public void SearchShirt() throws InterruptedException{
	MyntraPages	MyntraOR=new MyntraPages(driver);
		
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		MyntraOR.getSearchBox().sendKeys("mens shirt");
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

}


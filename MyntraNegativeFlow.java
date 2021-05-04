package com.qa.testscript;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.pages.MyntraPages;


public class MyntraNegativeFlow   extends MyntraBase{
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
		System.out.println(han);
		driver.switchTo().window(han);
		Thread.sleep(3000);
		MyntraOR.getAddtoBag().click();
		
		
		Thread.sleep(1000);
		 String er=driver.findElement(By.xpath("//div[@id='sizeButtonsContainer']/span")).getText();
		 Assert.assertEquals(er, "Please select a size");
		
	
}
}

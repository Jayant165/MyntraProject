package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraPages {
	
	WebDriver driver;
 
	
	@FindBy(xpath="//*[@id=\"desktop-header-cnt\"]/div[2]/nav/div/div[1]/div/a")
    WebElement Menbtn;
	public WebElement getMenbtn() {
		return Menbtn;
	}
	
	@FindBy(xpath="//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input")
	WebElement SearchBox;
	public WebElement getSearchBox() {
		return SearchBox;
	}
	@FindBy(xpath="//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/a/span")
	  WebElement SearchSym;
	public WebElement getSearchSym() {
		return SearchSym;
	}
	@FindBy(xpath="//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a/div[1]/div")
	WebElement Shirt;
	public WebElement getShirt() {
		return Shirt;
	}
	@FindBy(xpath="//div[@id='sizeButtonsContainer']/div[2]/div[3]/div/button")
	WebElement Size;
	public WebElement getSize() {
		return Size;
	}
	@FindBy(xpath="//*[@id=\"mountRoot\"]/div/div/div/main/div[2]/div[2]/div[3]/div/div[1]")
	WebElement AddtoBag;
	public WebElement getAddtoBag () {
		return AddtoBag;
	}
	@FindBy(xpath="//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/a[2]/span[1]")
	WebElement Bag;
	public WebElement getBag () {
		return Bag;
	}
	@FindBy(xpath="//*[@id=\"appContent\"]/div/div/div/div/div[2]/div[2]/div[3]/a/div")
	WebElement Placeorder;
	public WebElement getPlaceorder () {
		return Placeorder;
	}
	  
	  public MyntraPages(WebDriver driver)
	  {
		  this.driver=driver;
		  PageFactory.initElements(driver, this);
	  }

	
}

package com.ect.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPages {

	WebDriver driver;
	public SearchPages(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div/nav/ol/li[1]/a") WebElement home;
	
	@FindBy(id="frm_search") WebElement searchBox;
	
	@FindBy(id="btn_search") WebElement search;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div[1]/div[2]/div/div/div/a/h3") WebElement product;
	
	@FindBy(xpath="//*[@id=\"container\"]/div/div/div[1]/div[2]/div/div[2]/button") WebElement addcrt;
	
	@FindBy(xpath="//*[@id=\"navbarText\"]/ul/li[3]/a") WebElement crtBtn;
	
	@FindBy(xpath="//*[@id=\"cart\"]/div[2]/div/a") WebElement chkOut;
	
	public void searchProduct()
	{
		home.click();
		searchBox.sendKeys("Android TV");
		search.click();
		product.click();
		addcrt.click();
		crtBtn.click();
		chkOut.click();
	}
	
}

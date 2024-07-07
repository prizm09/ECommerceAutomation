package com.ect.testcases;

import org.testng.annotations.Test;

import com.ect.pages.BaseClass;
import com.ect.pages.LoginPages;
import com.ect.pages.SearchPages;

public class SearchTest extends BaseClass {
	
	@Test
	public void searchProduct()
	{
		lp = new LoginPages(driver);
		lp.potalLogin(username, password);
		
		SearchPages sp=new SearchPages(driver);
		sp.searchProduct();
		
	}

}

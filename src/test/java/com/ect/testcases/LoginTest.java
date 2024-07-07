package com.ect.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ect.pages.BaseClass;
import com.ect.pages.LoginPages;
import com.ect.utilities.ReadExcelFile;

public class LoginTest extends BaseClass{
	String fileName=System.getProperty("user.dir") + "\\TestData\\TestInfo.xlsx";
	
	@Test(dataProvider="logindataProvider")
	public void verify(String user, String pass) throws IOException
	{
		LoginPages lp = new LoginPages(driver);
		lp.potalLogin(user, pass);
		
		if(user.equals("ravi@dhiyotech.in") && pass.equals("Demo"))
		{
			Assert.assertTrue(true);
			lp.portalLogout();
		}
		else
		{
			Assert.assertTrue(false);
			captureScreenShot(driver, "verify");
		}
	}
	
	@DataProvider
	public String[][] logindataProvider() {
		
		int row=ReadExcelFile.getRowCount(fileName, "LoginData");
		int col=ReadExcelFile.getColCount(fileName, "LoginData");
		String data[][]=new String[row-1][col];
		
		for (int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				data[i-1][j]=ReadExcelFile.getCellValue(fileName, "LoginData", i, j);
			}
		}
		return data;
	}
}

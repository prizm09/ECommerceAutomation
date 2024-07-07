package com.ect.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import com.ect.utilities.BrowserFactory;
import com.ect.utilities.ConfigDataClass;
import com.ect.utilities.ReadExcelFile;

public class BaseClass {
	
	String fileName=System.getProperty("user.dir") + "\\TestData\\TestInfo.xlsx";
	public WebDriver driver;
	public ConfigDataClass conf = new ConfigDataClass();
	
	ReadExcelFile rf = new ReadExcelFile();
	protected String username = ReadExcelFile.getCellValue(fileName, "LoginData", 1, 0);
	protected String password = ReadExcelFile.getCellValue(fileName, "LoginData", 1, 1);
	
	protected LoginPages lp;
	
	@BeforeClass
	public void Setup() {
		driver=BrowserFactory.startApplication(driver, conf.getBroswer(), conf.getUrl());
	}
	
	public void captureScreenShot(WebDriver driver, String testName) throws IOException {
		//Convert WebDriver object to TakeScreenShot interface
		
		TakesScreenshot screenshot = ((TakesScreenshot)driver);
		
		//Step2: call getScreenshotAs method to capture image file
		
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File scrpath = new File("."+"//ScreenShots//"+testName + ".png");
		System.out.println("This is screenshot section");
		
		//Step 3: copy image file to destination
		FileUtils.copyFile(src, scrpath);
	}

}

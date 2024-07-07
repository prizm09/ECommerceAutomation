package com.ect.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPages {

	WebDriver driver;

	public LoginPages(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"navbarText\"]/ul/li[2]/a")
	WebElement logimage;

	@FindBy(id = "email")
	WebElement email;

	@FindBy(id = "password")
	WebElement pass;

	@FindBy(id = "customerloginForm")
	WebElement sub;

	@FindBy(xpath="//*[@id=\"dropdownMenuButton\"]")
	WebElement lgoutimg;

	@FindBy(xpath = "//*[@id=\"navbarText\"]/ul/li[2]/div/div/a[2]")
	WebElement lgout;

	public void potalLogin(String username, String password) {

		logimage.click();
		email.sendKeys(username);
		pass.sendKeys(password);
		sub.click();
	}

	public void portalLogout() {
		lgoutimg.click();
		lgout.click();
	}
}

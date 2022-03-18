package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {

	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//UserName text field
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	//Password Text field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	//LoginButton in Login page
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLoginButton()
	{
		return oLogin;
	}
	//FlyOutWindow field
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	//LogOut Link field
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
	
}

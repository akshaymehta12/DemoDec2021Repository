package com.sgtesting.testngassignments;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestngAssign1 {

	private static WebDriver oBrowser=null;
	public static Logger log=Logger.getLogger("Step Executed:");
	
	
	@Test(priority=1)
	private static void launchBrowser()
	{
		try
		{
			log.info("launching browser started...");
			System.setProperty("webdriver.chrome.driver","D:\\Example Automation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
			log.info("launching browser successful...");
			Thread.sleep(2000);;
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=2)
	private static void navigate()
	{
		try
		{
			log.info("Navigation of URL started...");
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(2000);
			log.info("Acti time URL navigated successfully...");
			
			String Actualstr=oBrowser.getTitle();
			String Expectedstr="actiTIME - Login";
			Assert.assertEquals(Actualstr, Expectedstr);
			System.out.println("The navigation Step has executed successfully..");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=3)
	private static void login()
	{
		try
		{
			log.info("Login to acti time as admin started...");
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			log.info("Acti time login was successful...");
			
			String str=oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Enter Time-Track", str);
			System.out.println("The login Step has executed successfully..");
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=4)
	private static void minimizeFlyOutWindow()
	{
		try
		{
			log.info(" minimizeFlyOutWindow has been initiated by the admin...");
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			log.info("The minimizeFlyOutWindow  has been sucussefully completed....");
			
			String str=oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Enter Time-Track", str);
			System.out.println("The minimizeFlyOutWindow Step has executed successfully..");
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=5)
	private static void logout()
	{
		try
		{
			log.info("Logout has been initiated by the admin...");
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			log.info("The logout has been sucussefully completed....");
			

			String str=oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", str);
			System.out.println("The logout Step has executed successfully..");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority=6)
	private static void closeapplication()
	{
		try
		{
			log.info("Initiated to close the chrome broweser....");
			oBrowser.close();
			log.info("The chrome browser has successfully closed....");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
}


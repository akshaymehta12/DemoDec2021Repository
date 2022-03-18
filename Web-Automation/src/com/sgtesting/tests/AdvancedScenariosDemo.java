package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedScenariosDemo {
		private static WebDriver oBrowser=null;
		public static void main(String[] args) {
			launchBrowser();
			navigate();
			login();
			minimizeFlyOutWindow();
			createUser1();
			createUser2();
			createUser3();
			logout();
			loginUser1();
			logoutUser1();
			loginUser2();
			logoutUser2();
			loginUser3();
			logoutUser3();
			loginasAdmin();
			ModifyUser1();
			ModifyUser2();
			ModifyUser3();
			logout();
			modifiedloginUser1();
			modifiedlogoutUser1();
			modifiedloginUser2();
			modifiedlogoutUser2();
			modifiedloginUser3();
			modifiedlogoutUser3();
			logout();
			loginasAdmin();
			deleteUser1();
			deleteUser2();
			deleteUser3();
			logout();
		    closeapplication();
		}
		
		private static void launchBrowser()
		{
			try
			{
				System.setProperty("webdriver.chrome.driver","D:\\Example Automation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
				oBrowser=new ChromeDriver();
				oBrowser.manage().window().maximize();
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void navigate()
		{
			try
			{
				oBrowser.get("http://localhost:81/login.do");
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void login()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(4000);
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void minimizeFlyOutWindow()
		{
			try
			{
				oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
				Thread.sleep(2000);
				
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void logout()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void closeapplication()
		{
			try
			{
				oBrowser.close();
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void createUser1()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Demo1");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Demouser1");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("Demo1@gmail.com");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("User1");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("123456");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("123456");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(2000);
			
			}catch(Exception e)
			{
				e.printStackTrace();;
			}
		}
		private static void createUser2()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Demo2");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Demouser2");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("Demo2@gmail.com");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("User2");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("U23456");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("U23456");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(2000);
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void createUser3()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Demo3");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("Demouser3");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_emailField")).sendKeys("Demo3@gmail.com");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("User3");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("U34567");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("U34567");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
				Thread.sleep(2000);
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void loginUser1()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("User1");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("pwd")).sendKeys("123456");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
				Thread.sleep(2000);
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void logoutUser1()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void loginUser2()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("User2");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("pwd")).sendKeys("U23456");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
				Thread.sleep(2000);
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void logoutUser2()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void loginUser3()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("User3");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("pwd")).sendKeys("U34567");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
				Thread.sleep(2000);
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void logoutUser3()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void loginasAdmin()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(4000);
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void ModifyUser1()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_passwordField")).clear();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("456789");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).clear();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("456789");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
				Thread.sleep(2000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void ModifyUser2()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_passwordField")).clear();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("U56789");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).clear();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("U56789");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
				Thread.sleep(2000);
				
			}catch(Exception e)
			
			{
				e.printStackTrace();
			}
		}
		private static void ModifyUser3()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_passwordField")).clear();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("U6789");
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).clear();
				Thread.sleep(2000);
				oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("U6789");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
				Thread.sleep(2000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void modifiedloginUser1()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("User1");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("pwd")).sendKeys("456789");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
				Thread.sleep(2000);
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void modifiedlogoutUser1()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void modifiedloginUser2()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("User2");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("pwd")).sendKeys("U56789");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
				Thread.sleep(2000);
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void modifiedlogoutUser2()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void modifiedloginUser3()
		{
			try
			{
				oBrowser.findElement(By.id("username")).sendKeys("User3");
				Thread.sleep(2000);
				oBrowser.findElement(By.name("pwd")).sendKeys("U6789");
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
				Thread.sleep(2000);
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void modifiedlogoutUser3()
		{
			try
			{
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(2000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void deleteUser1()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
				Thread.sleep(2000);
				oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Thread.sleep(2000);
				Alert oAlert=oBrowser.switchTo().alert();
				String content=oAlert.getText();
				System.out.println(content);
				oAlert.accept();
				Thread.sleep(2000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void deleteUser2()
		{
			try
			{
				oBrowser.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Thread.sleep(2000);
				Alert oAlert=oBrowser.switchTo().alert();
				String content=oAlert.getText();
				System.out.println(content);
				oAlert.accept();
				Thread.sleep(2000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void deleteUser3()
		{
			try
			{
				oBrowser.findElement(By.xpath("//*[@id='userListTableContainer']/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Thread.sleep(2000);
				Alert oAlert=oBrowser.switchTo().alert();
				String content=oAlert.getText();
				System.out.println(content);
				oAlert.accept();
				Thread.sleep(2000);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}


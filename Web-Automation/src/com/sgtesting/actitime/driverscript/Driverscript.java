package com.sgtesting.actitime.driverscript;

import com.sgtesting.actitime.tests.Initialize;
import com.sgtesting.actitime.tests.LoginLogout;
import com.sgtesting.actitime.tests.Users;
import com.sgtesting.actitime.tests.Homepage;
import com.sgtesting.actitime.tests.Customers;
import com.sgtesting.actitime.tests.Projects;
import com.sgtesting.actitime.tests.Tasks;

public class Driverscript {

	public static void main(String[] args) {
		try
		{
			//Create User Scenario
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			Homepage.minimizeFlyOutWindow();
			Users.createUser();
			Users.deleteUser();
			LoginLogout.logout();
			Initialize.closeapplication();

			//Modify User Scenario
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			Homepage.minimizeFlyOutWindow();
			Users.createUser();
			Users.ModifyUser();
			Users.deleteUser();
			LoginLogout.logout();
			Initialize.closeapplication();
			
			//create Customer Scenario
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			Homepage.minimizeFlyOutWindow();
			Customers.createCustomer();
			Customers.deleteCustomer();
			LoginLogout.logout();
			Initialize.closeapplication();
			
			//Modify Customer Scenario
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			Homepage.minimizeFlyOutWindow();
			Customers.createCustomer();
			Customers.modifyCustomer();
			Customers.deleteCustomer();
			LoginLogout.logout();
			Initialize.closeapplication();
			
			//Create Project Scenario
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			Customers.createCustomer();
			Projects.createProject();
			Projects.deleteProject();
			Customers.deleteCustomer();
			LoginLogout.logout();
			Initialize.closeapplication();
			
			//Modify Project Scenario
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			Customers.createCustomer();
			Projects.createProject();
			Projects.modifyProject();
			Projects.deleteProject();
			Customers.deleteCustomer();
			LoginLogout.logout();
			Initialize.closeapplication();
			
			//Create Task Scenario
			Initialize.launchBrowser();
			Initialize.navigate();
			LoginLogout.login();
			Customers.createCustomer();
			Projects.createProject();
			Tasks.createTasks();
			Tasks.importTasks();
			Projects.deleteProject();
			Customers.deleteCustomer();
			LoginLogout.logout();
			Initialize.closeapplication();
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}

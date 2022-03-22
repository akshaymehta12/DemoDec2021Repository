package com.sgtesting.sample;

import org.testng.annotations.Test;

public class Users {
	
	@Test
	public void createUser()
	{
		System.out.println("The USer demoUser has created successfully");
	}
	
	@Test
	public void modifyUser()
	{
		System.out.println("The User demoUser has modified successfully");
	}
	
	
	@Test
	public void deleteUser()
	{
		System.out.println("The USer demoUser has deleted successfully");
	}

}

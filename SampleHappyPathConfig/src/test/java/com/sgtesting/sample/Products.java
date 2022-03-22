package com.sgtesting.sample;

import org.testng.annotations.Test;

public class Products {
	
	@Test
	public void createProduct()
	{
		System.out.println("The product demoProduct has created successfully");
	}
	
	@Test
	public void modifyProduct()
	{
		System.out.println("The Product demoProduct has modified successfully");
	}
	
	
	@Test
	public void deleteProduct()
	{
		System.out.println("The Product demoProduct has deleted successfully");
	}

}

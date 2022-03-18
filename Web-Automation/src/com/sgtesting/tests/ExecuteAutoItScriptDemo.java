package com.sgtesting.tests;

public class ExecuteAutoItScriptDemo {

	public static void main(String[] args) {
		executeDemo();

	}
	private static void executeDemo()
	{
		try
		{
			String path="";
			//Runtime.getRuntime().exec(path);
			  Runtime obj=Runtime.getRuntime();
			  obj.exec(path);
		}catch(Exception e)
		{
			e.printStackTrace();		}
	}

}

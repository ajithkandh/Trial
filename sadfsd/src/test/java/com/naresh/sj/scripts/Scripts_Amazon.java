package com.naresh.sj.scripts;

import org.testng.annotations.Test;

public class Scripts_Amazon extends Main_Class {
	@Test
	public void Amazon() throws InterruptedException
	{
		//Common_Methods obj=new Common_Methods();
		//obj.Send_Data();
		Common_Methods.Login_SalesForce();
		
	}

}

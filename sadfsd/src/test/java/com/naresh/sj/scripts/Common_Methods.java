package com.naresh.sj.scripts;

import org.openqa.selenium.By;

public class Common_Methods extends Scripts_Amazon {
	public void Send_Data() throws InterruptedException
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Realme Narzo 30");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
	}
	public static void Login_SalesForce()
	{
		driver.findElement(By.id("username")).sendKeys("ajithkandh");
		driver.findElement(By.id("password")).sendKeys("98757");
		driver.findElement(By.id("Login")).click();
	}

}

package com.guru99.test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class SS1_Login extends Main_Class {
	@Test
	public void Login() throws InterruptedException, IOException
	{
		driver.findElement(By.name("uid")).sendKeys("mngr491448");
		driver.findElement(By.name("password")).sendKeys("erAdAgA");
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(3000);
	
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Guru99 Bank Manager HomePage"))
		{
			System.out.println("Testcase passed");
		}
		else
		{
			System.out.println("Testcase Failed");
		}
		String src=driver.getPageSource();
		boolean ver=src.contains("mngr491448");
		
		if(ver){
			System.out.println("Testcase passed");
		}
		else
		{
			System.out.println("Testcase Failed");
		}
	
		File tss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\Users\\Admin\\Desktop\\SS1.jpeg");
		FileHandler.copy(tss, des);
	}
}

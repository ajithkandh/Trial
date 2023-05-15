package com.guru99.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Main_Class {
	WebDriver driver;
	@BeforeMethod
	public void Launch_AUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}
	@AfterMethod
	public void Close_AUT()
	{
		driver.close();
	}

}

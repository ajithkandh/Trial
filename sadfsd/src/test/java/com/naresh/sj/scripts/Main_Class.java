package com.naresh.sj.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Main_Class {
   static WebDriver driver;
   @BeforeMethod
   public void LauncAUT()
   {
	   System.setProperty("wedriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	   driver=new ChromeDriver();
	  // driver.get("https://www.amazon.in/");
	   driver.get("https://login.salesforce.com/");
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.manage().window().maximize();
   }
   public static WebDriver getdriver()
   {
	   return driver;
   }
   @AfterMethod
   public void CloseAUT()
   {
	   driver.quit();
   }
}

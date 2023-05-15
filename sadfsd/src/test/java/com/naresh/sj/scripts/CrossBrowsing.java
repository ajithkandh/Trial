package com.naresh.sj.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsing {
  WebDriver driver;
  @Test
  public void Send_Data()
  {
	  driver.findElement(By.id("username")).sendKeys("akg@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("1243sad");
	  driver.findElement(By.id("Login")).click();
  }
  @BeforeClass
  @Parameters("browser")
  public void Launch(String browser) throws InterruptedException
  {
	  switch(browser)
	  {
	  case "chrome":
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://login.salesforce.com/");
		  Thread.sleep(2000);
		  driver.manage().window().maximize();
		  break;
	  case "edge":
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\msedgedriver.exe");
		  driver=new EdgeDriver();
		  driver.get("https://login.salesforce.com/");
		  Thread.sleep(2000);
		  driver.manage().window().maximize();
		  break;
		  default:
			  driver=null;
	  }
  }
  @AfterClass
  public void tear_down() throws InterruptedException
  {
	  Thread.sleep(2000);
	  driver.quit();
  }
}

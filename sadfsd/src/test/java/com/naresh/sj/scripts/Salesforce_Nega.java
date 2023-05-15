package com.naresh.sj.scripts;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Salesforce_Nega extends Main_Class {
  @Test(dataProvider="LoginData")
  public void Initial(String username, String password) 
  {
	  driver.findElement(By.id("username")).sendKeys(username);
	  driver.findElement(By.id("password")).sendKeys(password);
	  driver.findElement(By.id("Login")).click();
  }
  @DataProvider(name="LoginData")
  public Object[][]Details()
  {
	  Object[][] obj=new Object[2][2];
	  obj[0][0]="ggpondad@gmail.com";
	  obj[0][1]="9834831";
	  obj[1][0]="kanian@gmail.com";
	  obj[1][1]="riuwyrhd";
	  return obj;	  
  }
}

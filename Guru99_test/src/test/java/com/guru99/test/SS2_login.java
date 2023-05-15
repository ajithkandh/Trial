package com.guru99.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SS2_login extends SS1_Login{
	@Test(dataProvider="LoginData")
	public void Login(String username,String password) throws InterruptedException
	{
		String actualTitle;
		String actualBoxMsg;
		driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(5000);
		 try{ 
			    
		       	Alert alt = driver.switchTo().alert();
				actualBoxMsg = alt.getText(); // get content of the Alter Message
				alt.accept();
				 // Compare Error Text with Expected Error Value					
				assertEquals(actualBoxMsg,"User or Password is not valid");
				
			}    
		    catch (NoAlertPresentException Ex){ 
		    	// Get text displayes on login page 
				String pageText = driver.findElement(By.tagName("tbody")).getText();

				// Extract the dynamic text mngrXXXX on page		
				String[] parts = pageText.split(":");
				String dynamicText = parts[1];

				// Check that the dynamic text is of pattern mngrXXXX
				// First 4 characters must be "mngr"
				assertTrue(dynamicText.substring(1, 5).equals("mngr"));
				// remain stores the "XXXX" in pattern mngrXXXX
				String remain = dynamicText.substring(dynamicText.length() - 4);
				// Check remain string must be numbers;
				assertTrue(remain.matches("[0-9]+"));
	        } 
	}
	@DataProvider(name="LoginData")
	public Object[][] Details()
	{
		Object[][] obj=new Object[3][2];
		obj[0][0]="invalid";
		obj[0][1]="erAdAgA";
		obj[1][0]="mnggr491448";
		obj[1][1]="invalid";
		obj[2][0]="invalid";
		obj[2][1]="invalid";
		return obj;
	}

}

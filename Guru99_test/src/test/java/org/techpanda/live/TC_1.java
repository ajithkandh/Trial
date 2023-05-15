package org.techpanda.live;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC_1 extends Main_Class {
	@Test
	public void Title()
	{
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("THIS IS DEMO SITE"))
		{
			System.out.println("Test Case passed");
		}
		else
		{
			System.out.println("Test Case Failed");
		}
		
	}
	@Test
	public void mobile() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='Mobile']")).click();
		Thread.sleep(2000);
		String title_mobile=driver.getTitle();
		System.out.println(title_mobile);
		if(title_mobile.equals("MOBILE"))
		{
			System.out.println("Test Case passed");
		}
		else
		{
			System.out.println("Test Case Failed");
		}
		
	}
	@Test
	public void dropdown() throws InterruptedException
	{
		WebElement we=driver.findElement(By.xpath("//select[@title='Sort By']"));
		Select slc=new Select(we);
		we.click();
		slc.selectByVisibleText("Name");
	}

}

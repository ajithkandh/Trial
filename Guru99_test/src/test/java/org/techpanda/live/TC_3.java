package org.techpanda.live;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_3 extends Main_Class {
	@Test
	public void mobile() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='Mobile']")).click();
		Thread.sleep(5000);
	}
	@Test
	public void addToCart()
	{
		driver.findElement(By.xpath("//a[@title='Xperia']")).click();
		driver.findElement(By.xpath(".//*[@id='shopping-cart-table']/tbody/tr/td[4]/input")).sendKeys("1000");
		driver.findElement(By.xpath(".//*[@id='shopping-cart-table']/tbody/tr/td[4]/button")).click();
	}
}

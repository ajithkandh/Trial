package org.techpanda.live;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC_2 extends Main_Class{
	@Test
	public void mobile() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='Mobile']")).click();
		Thread.sleep(3000);
	}
	@Test
	public void Price() throws InterruptedException
	{
		String XPeriaPrice = driver.findElement(By.cssSelector("#product-price-1 > span.price")).getText();
		   
	    // 4. Click on Sony Xperia mobile 	   
	    driver.findElement(By.id("product-collection-image-1")).click();
	    
	    // 5. Read the XPeria mobile price from details page
	    String detailPrice = driver.findElement(By.cssSelector("span.price")).getText();
	    	    
	    //  Product price in list and details page should be equal ($100)
	    try {
	        assertEquals(XPeriaPrice, detailPrice); 
	      } catch (Exception e) {
	    	  e.printStackTrace();
	      }
	  }
	

}

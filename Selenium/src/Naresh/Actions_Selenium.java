package Naresh;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Selenium {
	WebDriver driver;
	Actions optobj;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		 optobj=new Actions(driver);
		 optobj.sendKeys(Keys.ESCAPE).build().perform();
		
		
		
	}
	public void SendData() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("Java");
		optobj=new Actions(driver);
		optobj.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);
		
	}
	public void PageSRC()
	{
		String src=driver.getPageSource();
		if(src.contains("java"))
		{
			System.out.println("it contains");
		}
		else
		{
			System.out.println("Nothing THere");
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Actions_Selenium obj=new Actions_Selenium();
		obj.LaunchAUT();
		obj.SendData();
		obj.PageSRC();

	}

}

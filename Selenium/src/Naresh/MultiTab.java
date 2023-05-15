package Naresh;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiTab {
	WebDriver driver;
	public void LAunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/demo");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void Multi() throws InterruptedException
	{
		String P_window=driver.getWindowHandle();
		driver.findElement(By.xpath("//span[text()='Admin area']")).click();
		Set<String>allwindows=driver.getWindowHandles();
		for(String window:allwindows)
		{
			if(!window.equals(P_window))
			{
				driver.switchTo().window(window);
				driver.findElement(By.id("Email")).clear();
				Thread.sleep(2000);
				driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
				driver.findElement(By.id("Password")).clear();
				Thread.sleep(2000);
				driver.findElement(By.id("Password")).sendKeys("admin");
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[text()='Log in']")).click();
			}
			
		}
	}
	public void CloseAUT()
	{
		driver.quit();
	}
	public static void main(String[] args) throws InterruptedException {
		MultiTab obj=new MultiTab();
		obj.LAunchAUT();
		obj.Multi();
		obj.CloseAUT();

	}

}

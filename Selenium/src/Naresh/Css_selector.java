package Naresh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_selector {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
	public void css()
	{
	 driver.findElement(By.cssSelector("input#email")).sendKeys("ajihtkandh");
	 driver.findElement(By.cssSelector("[id='pass']")).sendKeys("ponnitha");
	 driver.findElement(By.xpath("//input[@name='pass']/following::div[@class='_9lsa']")).click();
	 driver.findElement(By.cssSelector("[name='login']")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		Css_selector obj=new Css_selector();
		obj.LaunchAUT();
		obj.css();

	}

}

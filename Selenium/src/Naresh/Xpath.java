package Naresh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https:\\www.amazon.in");
		Thread.sleep(3000);	
		driver.manage().window().maximize();
	}
	public void InsertText() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Realme Narzo");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.xpath("//span[text()='realme narzo 50 (Speed Black, 4GB RAM+64GB Storage) Helio G96 Processor | 50MP AI Triple Camera | 120Hz Ultra Smooth Display']")).click();
		Thread.sleep(15000);
		driver.findElement(By.name("1")).click();
		driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
		Thread.sleep(3000);
	}
	

	public static void main(String[] args) throws InterruptedException {
		Xpath obj=new Xpath();
		obj.LaunchAUT();
		obj.InsertText();
	}

}

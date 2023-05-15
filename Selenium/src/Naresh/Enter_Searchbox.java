package Naresh;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enter_Searchbox {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https:\\www.amazon.in");
		Thread.sleep(5000);	
		driver.manage().window().maximize();
	}
	public void InsertText() throws InterruptedException
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Realme Narzo 30");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(5000);
	}
	public void Lang()
	{
		driver.findElement(By.className("icp-nav-link-inner")).click();
		driver.findElement(By.className("nav-a nav-a-2 icp-link-style-2")).findElement(By.className("nav-line-2")).click();
		driver.findElement(By.className("a-button-input")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		Enter_Searchbox obj=new Enter_Searchbox();
		obj.LaunchAUT();
		obj.InsertText();
		//obj.Lang();
	}

}

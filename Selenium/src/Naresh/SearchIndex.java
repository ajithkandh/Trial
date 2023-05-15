package Naresh;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchIndex {
	WebDriver driver;
	Actions actobj;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void SendData()
	{
		actobj=new Actions(driver);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("java");
		for(int i=1;i<=6;i++)
		{
		actobj.sendKeys(Keys.DOWN).build().perform();
		}
		actobj.sendKeys(Keys.ENTER).perform();
	}

	public static void main(String[] args) throws InterruptedException {
		SearchIndex obj=new SearchIndex();
		obj.LaunchAUT();
		obj.SendData();
		

	}

}

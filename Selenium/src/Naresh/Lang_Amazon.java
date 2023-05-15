package Naresh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lang_Amazon {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https:\\www.amazon.in");
		Thread.sleep(2000);
		driver.manage().window().minimize();	
	}
	public void Lang()
	{
		WebElement lang=driver.findElement(By.id("icp-nav-flyout"));
		Select Langobj=new Select(lang);
		Langobj.selectByIndex(2);
	}

	public static void main(String[] args) throws InterruptedException {
		Lang_Amazon obj=new Lang_Amazon();
		obj.LaunchAUT();
		

	}

}

package Naresh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
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
	public void RClick()
	{
		actobj=new Actions(driver);
		WebElement we=driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]"));
		actobj.contextClick(we).build().perform();
	}
	public static void main(String[] args) throws InterruptedException {
		RightClick obj=new RightClick();
		obj.LaunchAUT();
		obj.RClick();
		
	}

}

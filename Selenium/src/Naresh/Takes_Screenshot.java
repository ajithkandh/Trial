package Naresh;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takes_Screenshot {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void Sign_in() throws InterruptedException
	
	{
		driver.findElement(By.id("nav-link-accountList")).click();
		Thread.sleep(2000);
	}
	public void Screenshot() throws IOException
	{
		File tss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Admin\\Desktop\\GP.jpeg");
		FileHandler.copy(tss, des);
	}
	

	public static void main(String[] args) throws InterruptedException, IOException {
		Takes_Screenshot obj=new Takes_Screenshot();
		obj.LaunchAUT();
		obj.Sign_in();
		obj.Screenshot();

	}

}

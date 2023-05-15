package Naresh;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Double_clck {
	WebDriver driver;
	Actions actobj;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void Double() throws InterruptedException, IOException
	{
		driver.switchTo().frame("iframeResult");
		//WebElement dcl=driver.findElement(By.xpath("//p[@ondblclick='myFunction()']"));
		WebElement dcl=driver.findElement(By.xpath("//p[contains(text(),'Double-click this paragraph to trigger a function.')]"));
		actobj=new Actions(driver);
		actobj.doubleClick(dcl).perform();
		Thread.sleep(2000);
		File tss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Admin\\Desktop\\Dclick.jpeg");
		FileHandler.copy(tss, des);
		
	}
	public void CloseAUT() 
	{
		driver.quit();
	}
	

	public static void main(String[] args) throws InterruptedException, IOException {
		Double_clck obj=new Double_clck();
		obj.LaunchAUT();
		obj.Double();
		obj.CloseAUT();

	}

}

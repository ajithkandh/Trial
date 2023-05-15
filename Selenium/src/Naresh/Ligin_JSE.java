package Naresh;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Ligin_JSE {
	WebDriver driver;
	JavascriptExecutor jse;
	public void LAunchAUT()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	public void SendData()
	{
		jse=(JavascriptExecutor)driver;
		WebElement we=driver.findElement(By.id("username"));
		 jse.executeScript("arguments[0].value='ajithkandh';",we);
		
	}
	public void Password()
	{
		jse=(JavascriptExecutor)driver;
		WebElement pass=driver.findElement(By.id("password"));
		jse.executeScript("arguments[0].value='ponnitha';", pass);
		
	}
	public void Login()
	{
		jse=(JavascriptExecutor)driver;
		WebElement log=driver.findElement(By.id("Login"));
		jse.executeScript("arguments[0].click();", log);
		
	}
	public void ChangeBG()
	{
		jse=(JavascriptExecutor)driver;
		WebElement were=driver.findElement(By.id("username"));
		jse.executeScript("arguments[0].style='border:5px dotted pink';", were);
	}
	public void Screenshot() throws IOException
	{
		File tss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Admin\\Desktop\\JSE1.jpeg");
		FileHandler.copy(tss, des);
	}

	public static void main(String[] args) throws IOException {
		Ligin_JSE obj=new Ligin_JSE();
		obj.LAunchAUT();
		obj.SendData();
		obj.Password();
		obj.Login();
		obj.ChangeBG();
		obj.Screenshot();

	}

}

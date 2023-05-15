package Naresh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class His_Alert_JSE {
	WebDriver driver;
	JavascriptExecutor jse;
	public void LaunchAUT()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	public void History()
	{
		jse=(JavascriptExecutor)driver;
		jse.executeScript("history.go(0)");
	}
	public void alert()
	{
		jse=(JavascriptExecutor)driver;
		jse.executeScript("alert('Hi welcome');");
	}

	public static void main(String[] args) {
		His_Alert_JSE obj=new His_Alert_JSE();
		obj.LaunchAUT();
		obj.History();
		obj.alert();

	}

}

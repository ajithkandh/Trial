package Naresh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_JSE {
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
	public void S_down()
	{
		jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)"); 
	
	}
	public void S_Up()
	{
		jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		
	}
	public void scroll()
	{
		jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,600);");
	}
	
	public static void main(String[] args) {
	Scroll_JSE obj=new Scroll_JSE();
	obj.LaunchAUT();
	obj.S_down();
	obj.S_Up();
	obj.scroll();
	}

}

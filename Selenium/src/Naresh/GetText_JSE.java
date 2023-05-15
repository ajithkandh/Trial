package Naresh;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_JSE {
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
	public void gettit()
	{
		jse=(JavascriptExecutor)driver;
		String title=jse.executeScript("return document.title;").toString();
		System.out.println(title);
	}
	public void pageSRC()
	{
		jse=(JavascriptExecutor)driver;
		String src=jse.executeScript("return document.documentElement.innerText;").toString();
		System.out.println(src);
	}

	public static void main(String[] args) {
		GetText_JSE obj=new GetText_JSE();
		obj.LaunchAUT();
		obj.gettit();
		obj.pageSRC();

	}

}

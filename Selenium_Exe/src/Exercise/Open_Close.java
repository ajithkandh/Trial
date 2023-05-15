package Exercise;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Open_Close {
	WebDriver driver;
	public void Launch_AUT() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		
	}
	public void CLose_AUT()
	{
		driver.quit();
	}
	public static void main(String[] args) throws InterruptedException {
		Open_Close obj=new Open_Close();
		obj.Launch_AUT();
		obj.CLose_AUT();
		

	}

}

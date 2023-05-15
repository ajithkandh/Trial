package DemoQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Open_Close {
	WebDriver driver;
	public void LAunch_AUT() throws InterruptedException 	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(options);
		//driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
	}
	public void Close_AUT()
	{
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		Open_Close obj=new Open_Close();
		obj.LAunch_AUT();
		obj.Close_AUT();
		
	}

}

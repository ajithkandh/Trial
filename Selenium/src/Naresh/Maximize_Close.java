package Naresh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize_Close {
	WebDriver driver;
	public void Launch_AUT()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	public void Close_AUT()
	{
		driver.close();
	}

	public static void main(String[] args) {
		Maximize_Close obj=new Maximize_Close();
		obj.Launch_AUT();
		obj.Close_AUT();
				
	}

}

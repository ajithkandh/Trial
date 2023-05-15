package Naresh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Link {
	public void Launch_AUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(10000);
		
	}
	public static void main(String[] args) throws InterruptedException {
		Open_Link obj=new Open_Link();
		obj.Launch_AUT();

	}

}

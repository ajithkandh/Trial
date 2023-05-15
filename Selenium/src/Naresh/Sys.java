package Naresh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sys {
	public void AUT()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver web=new ChromeDriver();
	
	}
	public static void main(String[] args) {
		Sys obj=new Sys();
		obj.AUT();

	}

}

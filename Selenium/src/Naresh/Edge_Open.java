package Naresh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge_Open { 
	WebDriver driver ;
	public void Launch_AUT()
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().minimize();
	}
	public void Close_AUT()
	{
		driver.close();
	}

	public static void main(String[] args) {
		Edge_Open obj=new Edge_Open();
		obj.Launch_AUT();
		obj.Close_AUT();

	}

}

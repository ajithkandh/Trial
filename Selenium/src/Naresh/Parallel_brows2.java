package Naresh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Parallel_brows2 {
	WebDriver driver;
	String bot1="Chrome";
	String bot2="Edge";
	public void LaunchAUT() throws InterruptedException
	{
		Parallel_brows2 obj=new Parallel_brows2();
		if(obj.bot1.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
		}
		if(obj.bot2.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\msedgedriver.exe");
			driver=new EdgeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
		}
	}
	

	public static void main(String[] args) throws InterruptedException {
		Parallel_brows2 obj=new Parallel_brows2();
		obj.LaunchAUT();
	}

}

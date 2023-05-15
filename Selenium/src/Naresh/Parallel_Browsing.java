package Naresh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Parallel_Browsing {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		String[] Browsers= {"Chrome","edge"};
		for(String browser:Browsers)
		{
			if(browser.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get("https://www.amazon.in/");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
			}
			else if(browser.equalsIgnoreCase("edge"))
			{
				System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\msedgedriver.exe");
				driver=new EdgeDriver();
				driver.get("https://www.amazon.in/");
				driver.manage().window().maximize();
				Thread.sleep(2000);
			}
			else
			{
				
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Parallel_Browsing obj=new Parallel_Browsing();
		obj.LaunchAUT();

	}

}

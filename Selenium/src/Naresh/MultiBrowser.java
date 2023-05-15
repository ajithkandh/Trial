package Naresh;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MultiBrowser {
	WebDriver driver;
	public void LaunchAUT()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the browser name");
		String browser=sc.nextLine();
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\Downloads\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else
		{
			System.out.println("No browser found");
		}
		driver.get("https:\\www.amazon.in");
		driver.manage().window().maximize();
	}
	
	

	public static void main(String[] args) {
		MultiBrowser obj=new MultiBrowser();
		obj.LaunchAUT();

	}

}

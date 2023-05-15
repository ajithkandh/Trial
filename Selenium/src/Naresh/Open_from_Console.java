package Naresh;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_from_Console {
	public void LaunchAUT()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the url");
		String url=sc.nextLine();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void main(String[] args) {
		Open_from_Console obj=new Open_from_Console();
		obj.LaunchAUT();

	}

}

package Naresh;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Title {
	WebDriver driver;
	public void Launch_AUT()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String Act_Title=driver.getTitle();
		System.out.println(Act_Title);
		String Exp_Title="Welcome to Amazon";
		if(Exp_Title.equalsIgnoreCase(Act_Title))
		{
			System.out.println("Test Case Pass");
		
		}
		else
		{
			System.out.println("Test Case Fail");
		
		}
	
	}
	public void Close_AUT()
	{
		driver.close();
	}

	public static void main(String[] args) {
		Test_Title obj=new Test_Title();
		obj.Launch_AUT();
		obj.Close_AUT();

	}

}

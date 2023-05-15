package DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBox {
		WebDriver driver;
		public void Launch_AUT() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
			ChromeOptions opt=new ChromeOptions();
			opt.addArguments("--remote-allow-origins=*");
			driver=new ChromeDriver(opt);
			driver.get("https://demoqa.com/checkbox");
			Thread.sleep(2000);
			driver.manage().window().maximize();	
		}
		public void Check()
		{
			driver.findElement(By.xpath("//span[text()='Home']/preceding::span[@class='rct-checkbox']")).click();
		}

	public static void main(String[] args) throws InterruptedException {
		CheckBox obj=new CheckBox();
		obj.Launch_AUT();
		obj.Check();
	}

}

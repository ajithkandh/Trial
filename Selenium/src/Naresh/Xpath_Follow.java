package Naresh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Follow {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
	public void xpath()
	{
		driver.findElement(By.xpath("//label[text()='Last Name']/following::input[@name='name'][1]")).sendKeys("KAndh");
		driver.findElement(By.xpath("//table/tbody/tr[2]/td[2][text()='Maria Anders']/preceding::td[1]/input")).click();
	
	}

	public static void main(String[] args) throws InterruptedException {
		Xpath_Follow obj=new Xpath_Follow();
		obj.LaunchAUT();
		obj.xpath();

	}

}

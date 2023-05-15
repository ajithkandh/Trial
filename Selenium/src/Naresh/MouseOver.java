package Naresh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	WebDriver driver;
	Actions actobj;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void Mouse()
	{
		WebElement one=driver.findElement(By.xpath("//a[text()='Desktops']"));
		WebElement two=driver.findElement(By.xpath("//a[text()='Mac (1)']"));
		actobj=new Actions(driver);
		actobj.moveToElement(one).moveToElement(two).click().build().perform();
	}

	public static void main(String[] args) throws InterruptedException {
		MouseOver obj=new MouseOver();
		obj.LaunchAUT();
		obj.Mouse();

	}

}

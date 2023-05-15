package Naresh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.indiehackers.com/sign-in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void ClickOK() throws InterruptedException
	{
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}
	public void ClickCancel() throws InterruptedException
{
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
}
	public void SendData() throws InterruptedException
	{
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("abc@gmail.com");
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
	}
	public void GetTitle() throws InterruptedException
	{
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(2000);
		String Text=driver.switchTo().alert().getText();
		System.out.println(Text);
		driver.switchTo().alert().accept();
		
	}
	public static void main(String[] args) throws InterruptedException {
		PopUp obj=new PopUp();
		obj.LaunchAUT();
		obj.ClickOK();
		obj.ClickCancel();
		obj.SendData();
		obj.GetTitle();

	}

}

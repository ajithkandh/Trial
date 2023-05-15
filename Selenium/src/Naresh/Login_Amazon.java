package Naresh;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Login_Amazon {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https:\\www.amazon.in");
		Thread.sleep(2000);
		driver.manage().window().minimize();	
	}
	public void SignIn()
	{
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		String login=driver.getCurrentUrl();
		System.out.println(login);
	}
	public void SenData()
	{
		driver.findElement(By.id("ap_email")).sendKeys("ggpondad@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("ponnitha");
		driver.findElement(By.id("signInSubmit")).click();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter OTP");
		String otp=sc.nextLine();
		driver.findElement(By.id("auth-mfa-otpcode")).sendKeys(otp);
		driver.findElement(By.id("auth-signin-button")).click();
		String psc=driver.getPageSource();
		if(psc.contains("auth-error-message-box"))
		{
			System.out.println("Testcase Pass");
		}
		else
		{
			System.out.println("TestCase Fail");
		}
	}
	public void ScreenShot() throws IOException
	{
		File tss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Admin\\Desktop\\Web1.jpg");
		FileHandler.copy(tss, des);
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		Login_Amazon obj=new Login_Amazon();
		obj.LaunchAUT();
		obj.SignIn();
		obj.SenData();
		obj.ScreenShot();
		

	}

}

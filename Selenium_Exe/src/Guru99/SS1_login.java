package Guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SS1_login {
	WebDriver driver;
	Actions actobj;
	public void Launch_AUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.demo.guru99.com/V4/");
		driver.manage().window().maximize();
		Thread.sleep(3000);;
		
	}
	public void login() throws InterruptedException
	{
		driver.findElement(By.name("uid")).sendKeys("mngr491448");
		driver.findElement(By.name("password")).sendKeys("erAdAgA");
		driver.findElement(By.name("btnLogin")).click();
		
		Thread.sleep(3000);
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}
	
	public void negativeLogin(String username,String password) throws InterruptedException
	{
		driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(5000);
		driver.switchTo().alert();
		actobj.sendKeys(Keys.ENTER).build().perform();
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}
	public void Close_AUT()
	{
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		SS1_login obj=new SS1_login();
		obj.Launch_AUT();
		obj.login();
		obj.Launch_AUT();
		obj.negativeLogin("mnggr491448", "invalid");
		obj.Launch_AUT();
		obj.negativeLogin("invalid", "erAdAgA");
		obj.Launch_AUT();
		obj.negativeLogin("invalid", "invalid");
		obj.Close_AUT();

	}

}

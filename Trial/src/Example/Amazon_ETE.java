package Example;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_ETE {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
	public void signin() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("9578063903");
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("ponnitha");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(5000);
		driver.manage().window().minimize();
		Scanner otp=new Scanner(System.in);
		System.out.println("Enter the Otp");
		String Value=otp.nextLine();
		driver.manage().window().maximize();
		driver.findElement(By.name("otpCode")).sendKeys(Value);
		driver.findElement(By.name("mfaSubmit")).click();
		
	}
	public void Search() throws InterruptedException
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Realme");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
	}
	public void Select_Model() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='realme narzo 50i Prime (Mint Green 4GB RAM+64GB Storage) Octa-core Processor |5000 mAh Battery']")).click();
		
	}
	public void Book() throws InterruptedException
	{
		String P_Window=driver.getWindowHandle();
		Set<String>windows=driver.getWindowHandles();
		for(String window:windows)
		{
			if(!window.equals(P_Window))
			{
				driver.switchTo().window(window);
				driver.findElement(By.xpath("//a[text()=' See All Buying Options ']")).click();
				Thread.sleep(8000);
				driver.findElement(By.xpath("//input[@name='submit.addToCart']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//i[@class='a-icon aod-close-button']")).click();
				driver.close();
				Thread.sleep(2000);
				driver.switchTo().window(P_Window);
				Thread.sleep(2000);
				driver.findElement(By.xpath("//a[@id='nav-cart']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//input[@value='Delete']")).click();
				
			}
		}
	}
	
	public void CloseAUT()
	{
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		Amazon_ETE obj=new Amazon_ETE();
		obj.LaunchAUT();
		obj.signin();
		obj.Search();
		obj.Select_Model();
		obj.Book();
		
		

	}

}

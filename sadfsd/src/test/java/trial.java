


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;



public class trial {
	WebDriver driver;
	Actions act;
	public void Launch_AUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32(1)\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(opt);
		driver.get("https://demoqa.com/radio-button");
		Thread.sleep(3000);
		driver.manage().window().maximize();	
	}
	public void Radio() throws InterruptedException
	{
		act=new Actions(driver);
		WebElement we=driver.findElement(By.xpath("//input[@id='yesRadio']"));
		act.moveToElement(we).click().build().perform();
		Thread.sleep(3000);
		WebElement we2=driver.findElement(By.xpath("//input[@id='impressiveRadio']"));
		act.moveToElement(we2).click().perform();
		Thread.sleep(3000);
		WebElement we3=driver.findElement(By.xpath("//input[@id='noRadio']"));
		boolean no_rb=!we3.isEnabled();
		Assert.assertTrue(no_rb);
		System.out.println("The button is disabled");
		
	}

	public static void main(String[] args) throws InterruptedException {
		trial obj=new trial();
		obj.Launch_AUT();
		obj.Radio();

	}

}




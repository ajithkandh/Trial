package DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTables {
	WebDriver driver;
	Actions actobj;
	public void LAunch_AUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver.", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		Thread.sleep(3000);
		driver.manage().window().maximize();
	}
	public void Add()
	{
		driver.findElement(By.id("addNewRecordButton")).click();
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Ajith");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Kandh");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("akg@gmail.com");
		driver.findElement(By.xpath("//input[@id='age']")).sendKeys("28");
		driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("10000");
		driver.findElement(By.xpath("//input[@id='department']")).sendKeys("Testing");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}
	

	public static void main(String[] args) throws InterruptedException {
		WebTables obj=new WebTables();
		obj.LAunch_AUT();
		obj.Add();
	}

}

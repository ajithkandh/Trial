package Naresh;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.driver.chrome", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft&bc=HA");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	public void SendData()
	{
		driver.findElement(By.name("UserFirstName")).sendKeys("Ajith");
		driver.findElement(By.name("UserLastName")).sendKeys("Kandh");
		driver.findElement(By.name("UserEmail")).sendKeys("ggpondad@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("Naresh IT");
		driver.findElement(By.name("UserPhone")).sendKeys("9578063903");
	}
	public void Dropdown() throws InterruptedException, IOException
	{
		WebElement we=driver.findElement(By.name("UserTitle"));
		Select slcobj=new Select(we);
		for(int i=1;i<=9;i++) 
		{
		slcobj.selectByIndex(i);
		Thread.sleep(2000);
		if(i==4)
			{
			break;
			
			};
		}
		File tss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Admin\\Desktop\\Sel1.jpg");
		FileHandler.copy(tss, des);
		WebElement em=driver.findElement(By.name("CompanyEmployees"));
		Select emobj=new Select(em);
		emobj.selectByVisibleText("16 - 100 employees");
		WebElement cn=driver.findElement(By.name("CompanyCountry"));
		Select cnobj=new Select(cn);
		cnobj.selectByVisibleText("India");
		driver.findElement(By.className("checkbox-ui")).click();
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		DropDown obj=new DropDown();
		obj.LaunchAUT();
		obj.SendData();
		obj.Dropdown();

	}

}

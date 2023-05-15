package Naresh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe_MultiSel {
	WebDriver driver;
	public void LAunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_elem_select_multiple");
		Thread.sleep(2000);
		driver.manage().window().maximize();	
	}
	public void SelCars() throws InterruptedException
	{
		driver.switchTo().frame("iframeResult");
		WebElement cars=driver.findElement(By.id("cars"));
		Select slccars=new Select(cars);
		if(slccars.isMultiple()) {
			slccars.selectByVisibleText("Audi");
			slccars.selectByVisibleText("Volvo");
			Thread.sleep(2000);
		List<WebElement>alloptions=slccars.getAllSelectedOptions();
		int k=alloptions.size();
		System.out.println(k);
				
		for(int i=0;i<alloptions.size();i++)
		{
			String data=alloptions.get(i).getText();
			System.out.println(data);
		}
		slccars.deselectByVisibleText("Audi");
		slccars.deselectAll();
		}
		driver.switchTo().defaultContent();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Iframe_MultiSel obj=new Iframe_MultiSel();
		obj.LAunchAUT();
		obj.SelCars();
		

	}

}

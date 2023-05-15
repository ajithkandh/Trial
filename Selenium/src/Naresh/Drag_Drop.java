package Naresh;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Drag_Drop {

	WebDriver driver;
	Actions actobj;
	public void LauchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
			
	}
	public void DragDrop() throws InterruptedException
	{
		driver.switchTo().frame(0);
		WebElement drg=driver.findElement(By.id("draggable"));
		WebElement drp=driver.findElement(By.id("droppable"));
		actobj=new Actions(driver);
		actobj.dragAndDrop(drg, drp).perform();
		Thread.sleep(3000);
		
		
	}
	public void CloseAUT() throws IOException
	{
		File tss=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\Admin\\Desktop\\DAD.jpeg");
		FileHandler.copy(tss, des);
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		Drag_Drop obj=new Drag_Drop();
		obj.LauchAUT();
		obj.DragDrop();
		obj.CloseAUT();

	}

}

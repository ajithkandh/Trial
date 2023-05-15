package Naresh;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expl_wait {
	WebDriver driver;
	public void LAunchAUT()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		}
	public void Wait()
	{
		WebElement sign=driver.findElement(By.id("nav-link-accountList"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement we=wait.until(ExpectedConditions.visibilityOf(sign));
		we.click();
	}

	public static void main(String[] args) {
		Expl_wait obj=new Expl_wait();
		obj.LAunchAUT();
		obj.Wait();
	}

}

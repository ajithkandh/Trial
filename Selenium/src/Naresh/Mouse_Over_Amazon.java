package Naresh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Over_Amazon {
	WebDriver driver;
	Actions actobj;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/dp/B09FKD67CS/ref=QAHzEditorial_en_IN_3?pf_rd_r=CZV15WJ3VX48DP4YDJ0G&pf_rd_p=28190779-68a3-4b32-a9a6-b13da9eb28c9&pf_rd_m=A1VBAL9TL5WCBF&pf_rd_s=merchandised-search-7&pf_rd_t=&pf_rd_i=1389401031&ie=UTF8&ref_=CLP_MH8_BSAffordable_3&th=1");
		Thread.sleep(2000);
		driver.manage().window().maximize();	
	}
	public void Mobile()
	{
		WebElement we=driver.findElement(By.xpath("//div[@id='imgTagWrapperId']"));
		actobj=new Actions(driver);
		//actobj.moveToElement(we, 120, 120).build().perform();
		for(int i=507;i<=570;i++)
		{
			for(int j=199;j<=314;j++)
			{
				actobj.moveToElement(we, i, j).build().perform();
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Mouse_Over_Amazon obj=new Mouse_Over_Amazon();
		obj.LaunchAUT();
		obj.Mobile();

	}

}

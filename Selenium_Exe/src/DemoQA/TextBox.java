package DemoQA;

import org.openqa.selenium.By;

public class TextBox extends Open_Close{
	public void FullName() throws InterruptedException
	{
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(2000);
		driver.findElement(By.id("userName")).sendKeys("Ajithkandh");
		
	}
	public void Email()
	{
		driver.findElement(By.id("userEmail")).sendKeys("abc@gmail.com");
	}
	public void Address()
	{
		driver.findElement(By.id("currentAddress")).sendKeys("56,East Street,"
				+ "Kadukkarai,Kanniyakumari Dist"
				+ "Tamilnadu");
		driver.findElement(By.id("permanentAddress")).sendKeys("56,East Street,"
				+ "Kadukkarai,Kanniyakumari Dist"
				+ "Tamilnadu");
		
	}
	public static void main(String[] args) throws InterruptedException {
		TextBox obj1=new TextBox();
		obj1.LAunch_AUT();
		obj1.FullName();
		obj1.Email();
		obj1.Address();
		obj1.Close_AUT();

	}

}

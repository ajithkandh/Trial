package Step_Definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_DEfinition {
	public WebDriver driver;
	@Given("launch the salesforce application")
	public void launch_the_salesforce_application()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
	    
	}
	@When("user enter the username and password")
	public void user_enter_the_username_and_password()
	{
		driver.findElement(By.id("username")).sendKeys("akg@gmail.com");
		driver.findElement(By.id("password")).sendKeys("wfdasfaf");
		
	}
	@Then("click on Login button")
	public void click_on_login_button() 
	{
	    driver.findElement(By.id("Login")).click();
	}
	@And("get the title")
	public void get_the_title() 
	{
	    String title=driver.getTitle();
	    System.out.println(title);
	}
}

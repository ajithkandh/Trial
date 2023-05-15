import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTestclass {
	 @BeforeClass
	  public void LaunchAUT()
	  {
		  System.out.println("LaunchAUT");
	  }
	  @Test(priority=1)
	  public void SendData()
	  {
		  System.out.println("Send data");
	  }
	  @Test(priority=-1)
	  public void Username()
	  {
		  System.out.println("Username");
	  }
	  @Test(enabled=false)
	  public void Password()
	  {
		  System.out.println("Password");
	  }
	  @Test
	  public void Get_Text()
	  {
		  System.out.println("Get Text");
	  }
	  @AfterClass
	  public void CloseAUT()
	  {
		  System.out.println("CloseAUT");
	  }

  
}

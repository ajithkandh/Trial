import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
  @BeforeMethod
  public void LaunchAUT()
  {
	  System.out.println("LaunchAUT");
  }
  @Test
  public void SendData()
  {
	  System.out.println("Send data");
  }
  @Test
  public void Username()
  {
	  System.out.println("Username");
  }
  @Test
  public void Password()
  {
	  System.out.println("Password");
  }
  @Test
  public void Get_Text()
  {
	  System.out.println("Get Text");
  }
  @AfterMethod
  public void CloseAUT()
  {
	  System.out.println("CloseAUT");
  }
}

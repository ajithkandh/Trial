import org.testng.annotations.Test;

public class NewClass {
  @Test
  public void LaunchAUT() 
  {
  System.out.println("This is the launch browser");
  }
  public void SendData()
  {
	  System.out.println("Enter the value");
  }
  public void Click_on_Ligin()
  {
	  System.out.println("Click the login Button");
  }
  public void LogOut()
  {
	  System.out.println("tear down");
  }
}

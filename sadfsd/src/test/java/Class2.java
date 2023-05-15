import org.testng.annotations.Test;

public class Class2 {
  @Test
  public void LaunchAUT() 
  {
  System.out.println("This is the launch browser");
  }
  @Test
  public void SendData()
  {
	  System.out.println("Enter the value");
  }
  @Test
  public void Click_on_Ligin()
  {
	  System.out.println("Click the login Button");
  }
  @Test
  public void LogOut()
  {
	  System.out.println("tear down");
  }
}

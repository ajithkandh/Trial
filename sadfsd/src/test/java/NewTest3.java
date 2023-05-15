import org.testng.annotations.Test;

public class NewTest3 {
  @Test(groups="Retesting")
  public void LaunchAUT() 
  {
  System.out.println("This is the launch browser");
  }
  @Test(groups="Regression")
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

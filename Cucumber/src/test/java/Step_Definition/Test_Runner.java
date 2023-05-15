package Step_Definition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Admin\\eclipse-workspace\\Cucumber\\src\\test\\resources\\Feature\\login.feature",
		glue = {"Step_Definition"}
		)

public class Test_Runner {

}

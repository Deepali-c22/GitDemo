package MavenProject.MavenJava;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Payement.feature",glue= "PaymentStepDef.java",monochrome=true,tags="@regression")
public class CucmberRunnerFile {
	
	

}

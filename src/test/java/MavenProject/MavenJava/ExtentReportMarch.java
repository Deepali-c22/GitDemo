package MavenProject.MavenJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportMarch {
	ExtentReports eRepo;
	@BeforeTest
	public void Extentreport()
	{
		
		
		String path=System.getProperty("user.dir")+"/Reports/EXtentReports.html";
		ExtentSparkReporter ext = new ExtentSparkReporter(path);
		ext.config().setReportName("MyReport");
		eRepo=new ExtentReports();
		eRepo.attachReporter(ext);
		eRepo.setSystemInfo("Tester","Deepali");
		
		
		
		
	}
	
	@Test
	public void Runreport(String path)
	{
		//ChromeOptions co=new ChromeOptions();
		//co.addArguments("-")
		ExtentTest e=eRepo.createTest("MyTest");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.getTitle();
		//e.addScreenCaptureFromPath(path);
		eRepo.flush();
		
	}
	
	/*
	 * @Test public void Runreport1() { //ChromeOptions co=new ChromeOptions();
	 * //co.addArguments("-") eRepo.createTest("MyTest-1");
	 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
	 * ChromeDriver(); driver.get("http://www.yahoo.com"); driver.getTitle();
	 * eRepo.flush();
	 * 
	 * }
	 * 
	 * @Test public void Runreport2() { //ChromeOptions co=new ChromeOptions();
	 * //co.addArguments("-") eRepo.createTest("MyTest-2");
	 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
	 * ChromeDriver(); driver.get("http://www.amazon.com"); driver.getTitle();
	 * eRepo.flush();
	 * 
	 * }
	 */

}

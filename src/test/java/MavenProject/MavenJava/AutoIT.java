package MavenProject.MavenJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoIT {
	
	public static void main(String srgs[])
	{
	//System.setProperty("webdriver.chrome.driver","");
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http:admin:admin@the-internet.herokuapp.com/");
	}
}

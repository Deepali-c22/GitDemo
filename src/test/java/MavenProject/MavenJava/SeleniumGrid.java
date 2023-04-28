package MavenProject.MavenJava;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGrid {
	
	
	@Test
	public void homepage() throws MalformedURLException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.1.75:4444"),dc);
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("India");
		driver.close();
	}

}

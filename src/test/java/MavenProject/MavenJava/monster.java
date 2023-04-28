package MavenProject.MavenJava;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import io.github.bonigarcia.wdm.WebDriverManager;

public class monster {

    

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		  WebDriverManager.chromedriver().setup(); WebDriver driver = new
		  ChromeDriver(); driver.get("https://www.monsterindia.com");
		  Thread.sleep(3000);
		  System.out.println(driver.findElement(By.tagName("input")));		 
		 driver.findElement(By.xpath("//*[text()='Upload Resume']")).click();
		  
		  //WebElement browse=driver.findElement(By.xpath("//button[@class='line-btn']"));
		 WebElement browse=driver.findElement(By.id("file-upload"));
		  Thread.sleep(3000);
		  
		  browse.sendKeys("//Users//alokkhare//Desktop//Selenium cheatsheet//testfile.docx");
		  System.out.println("File is Uploaded Successfully");
		  
		  
		  
	
			/*
			 * WebDriverManager.firefoxdriver().setup(); WebDriver d = new FirefoxDriver();
			 * d.manage().window().maximize(); //always write wait code after this
			 * d.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); //for page load
			 * d.get("https://www.monsterindia.com/seeker/registration"); //Testing webpage
			 * d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //for Implicit
			 * wait
			 * 
			 * JavascriptExecutor js = (JavascriptExecutor)d; //Scrolling using
			 * JavascriptExecutor js.executeScript("window.scrollBy(0,380)");//Scroll Down
			 * to file upload button (+ve) Thread.sleep(3000);
			 * 
			 * // FILE UPLOADING USING SENDKEYS ....
			 * 
			 * WebElement browse = d.findElement(By.xpath("//input[@id='file-upload']"));
			 * //click on ‘Choose file’ to upload the desired file browse.
			 * sendKeys("//Users//alokkhare//Desktop//Selenium cheatsheet//testfile.docx");
			 * //Uploading the file using sendKeys
			 * System.out.println("File is Uploaded Successfully");
			 */
		 

		
	}

}

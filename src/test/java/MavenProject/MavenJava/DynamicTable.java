package MavenProject.MavenJava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicTable {
	
	@Test
	public void Table()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		int rowCount=driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		
		int colCount=driver.findElements(By.xpath("//table[@id='customers']//th")).size();
		
			for(int i=1;i<rowCount;i++)
			{
				for(int j=1;j<colCount;j++)
				{
					String text=driver.findElement(By.xpath("//table[@id=\"customers\"]/tbody/tr["+(i+1)+"]/td[("+j+")]")).getText();
					if(text.equalsIgnoreCase("Roland Mendel"))
					{
					System.out.println(i +" " + j);
					System.out.println(text);

					break;
					}

				}
			}

				
	}

}

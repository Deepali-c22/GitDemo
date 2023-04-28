package MavenProject.MavenJava;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DProv {

	@Test(dataProvider="Testdata")
	public void test(String s,String s1,int i)
	{
		System.out.println(s+s1+i);
	}
	
	@DataProvider(name="Testdata")
	public Object[][] getData()
	{
		Object[][] obj= {{"hello","world",1},{"my,","name",2},{"This","is",3}};
		return obj;
		
	}
}

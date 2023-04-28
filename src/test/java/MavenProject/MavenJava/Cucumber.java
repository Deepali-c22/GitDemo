package MavenProject.MavenJava;

import org.testng.annotations.Test;

public class Cucumber {
	
	@Test
	public void onlyNum()
	{
	String s= "200.00$";
	String n=s.replaceAll("[$.' ']","");
	System.out.println(s);

System.out.println(n);
	}
}

package MavenProject.MavenJava;

import java.util.Arrays;

import org.testng.annotations.Test;

public class a {

	@Test
	public void test()
	{
String a="$99.90";
String m=a.replaceAll("[$.]","");
System.out.println(m);
System.out.print(Arrays.toString(bubbleSort()));

	}
	
	@Test
	public int[] bubbleSort()
	{
		boolean flag=false;
		int[] arr= {20,45,3};
		for(int i=0;i<=arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]<arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
			if(flag=false)
			{
				break;
			}
		}
		return arr;
		
		
	}
}

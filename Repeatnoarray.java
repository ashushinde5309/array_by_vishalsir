package arraybyvishalsir;

public class Repeatnoarray 
{
	public static void main(String[] args)
	{
		int a[]= {0,1,2,2,5,6,6,6,6,5,6};
		int c=0;
		int n=6;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				c++;
			}
				
		}
		System.out.println("Count of "+n+" is "+c);
	}

}

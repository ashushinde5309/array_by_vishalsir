package arraybyvishalsir;

import java.util.*;

public class SecMaxMin 
{
	public static void main(String[] args)
	{
		int a[]= {9,5,8,7,6,4,1,3,2};
		Arrays.sort(a);
		System.out.println("Second min is "+a[1]);
		System.out.println("Second max is "+a[a.length-2]);
	}
}
